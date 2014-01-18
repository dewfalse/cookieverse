package cookieverse;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import cookieverse.block.Blocks;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {

	public static void init() {
		registerBlockRecipe(Items.itemChocolate, Blocks.blockChocolate);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.itemChocolate, 9, 0),
				Blocks.oreChocolate);

		registerBlockRecipe(Items.itemWhiteChocolate, Blocks.blockWhiteChocolate);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.itemWhiteChocolate, 9, 0),
				Blocks.oreWhiteChocolate);

		registerBlockRecipe(Items.itemBlackChocolate, Blocks.blockBlackChocolate);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.itemBlackChocolate, 9, 0),
				Blocks.oreBlackChocolate);

		registerBlockRecipe(Items.itemCookieDough, Blocks.cookieDough);
		GameRegistry.addSmelting(Blocks.cookieDough.blockID, new ItemStack(Blocks.cookie, 1, 0), 0.15F);
		registerBlockRecipe(Item.cookie, Blocks.cookie);

		registerBlockRecipe(Items.itemChocolateCookieDough, Blocks.chocolateCookieDough);
		GameRegistry.addSmelting(Blocks.chocolateCookieDough.blockID, new ItemStack(Blocks.chocolateCookie, 1, 0), 0.15F);
		registerBlockRecipe(Items.itemChocolateCookie, Blocks.chocolateCookie);

		registerBlockRecipe(Items.itemWhiteChocolateCookieDough, Blocks.whiteChocolateCookieDough);
		GameRegistry.addSmelting(Blocks.whiteChocolateCookieDough.blockID, new ItemStack(Blocks.whiteChocolateCookie, 1, 0), 0.15F);
		registerBlockRecipe(Items.itemWhiteChocolateCookie, Blocks.whiteChocolateCookie);

		registerBlockRecipe(Items.itemBlackChocolateCookieDough, Blocks.blackChocolateCookieDough);
		GameRegistry.addSmelting(Blocks.blackChocolateCookieDough.blockID, new ItemStack(Blocks.blackChocolateCookie, 1, 0), 0.15F);
		registerBlockRecipe(Items.itemBlackChocolateCookie, Blocks.blackChocolateCookie);

		GameRegistry.addShapedRecipe(new ItemStack(Blocks.cookieSapling),
				"A A",
				" A ",
				" A ",
				'A', new ItemStack(Items.itemCookieDough));

		registerToolsRecipes(Items.itemChocolate, new Item[]{Items.swordChocolate, Items.pickaxeChocolate, Items.shovelChocolate, Items.axeChocolate, Items.hoeChocolate});
		registerToolsRecipes(Items.itemWhiteChocolate, new Item[]{Items.swordWhiteChocolate, Items.pickaxeWhiteChocolate, Items.shovelWhiteChocolate, Items.axeWhiteChocolate, Items.hoeWhiteChocolate});
		registerToolsRecipes(Items.itemBlackChocolate, new Item[]{Items.swordBlackChocolate, Items.pickaxeBlackChocolate, Items.shovelBlackChocolate, Items.axeBlackChocolate, Items.hoeBlackChocolate});

		GameRegistry.addSmelting(Items.itemCookieDough.itemID, new ItemStack(Item.cookie, 1, 0), 0.01F);
		GameRegistry.addSmelting(Items.itemChocolateCookieDough.itemID, new ItemStack(Items.itemChocolateCookie, 1, 0), 0.01F);
		GameRegistry.addSmelting(Items.itemWhiteChocolateCookieDough.itemID, new ItemStack(Items.itemWhiteChocolateCookie, 1, 0), 0.01F);
		GameRegistry.addSmelting(Items.itemBlackChocolateCookieDough.itemID, new ItemStack(Items.itemBlackChocolateCookie, 1, 0), 0.01F);

		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.chocolateCookieDough),
				Blocks.cookieDough, Blocks.blockChocolate);
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.blackChocolateCookieDough),
				Blocks.cookieDough, Blocks.blockBlackChocolate);
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.whiteChocolateCookieDough),
				Blocks.cookieDough, Blocks.blockWhiteChocolate);

		GameRegistry.addShapelessRecipe(new ItemStack(Items.itemChocolateCookieDough),
				Items.itemCookieDough, Items.itemChocolate);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.itemBlackChocolateCookieDough),
				Items.itemCookieDough, Items.itemBlackChocolate);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.itemWhiteChocolateCookieDough),
				Items.itemCookieDough, Items.itemWhiteChocolate);
	}

	private static void registerToolsRecipes(Item item, Item[] items) {
		String[][] recipePatterns = new String[][] {{"X", "X", "#"}, {"XXX", " # ", " # "}, {"X", "#", "#"}, {"XX", "X#", " #"}, {"XX", " #", " #"}};
		for(Item tool : items) {
			String[] recipe = null;
			if(tool instanceof ItemSword) {
				recipe = recipePatterns[0];
			}
			else if(tool instanceof ItemPickaxe) {
				recipe = recipePatterns[1];
			}
			else if(tool instanceof ItemSpade) {
				recipe = recipePatterns[2];
			}
			else if(tool instanceof ItemAxe) {
				recipe = recipePatterns[3];
			}
			else if(tool instanceof ItemHoe) {
				recipe = recipePatterns[4];
			}
			else {
				continue;
			}
			GameRegistry.addShapedRecipe(new ItemStack(tool),
					recipe,
					'X', item,
					'#', Item.stick);
		}
	}

	private static void registerBlockRecipe(Item item, Block block) {
		GameRegistry.addShapedRecipe(new ItemStack(block),
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(item));
		GameRegistry.addShapelessRecipe(new ItemStack(item, 9, 0),
				block);

	}

}
