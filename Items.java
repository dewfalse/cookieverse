package cookieverse;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.MinecraftForge;
import cookieverse.block.Blocks;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraftforge.common.util.EnumHelper;

public class Items extends net.minecraft.init.Items{

	public static Item itemChocolate = new ItemFood(3, 0.5F, false).setUnlocalizedName("cookieverse:itemChocolate").setTextureName("cookieverse:itemChocolate").setCreativeTab(Cookieverse.creativeTab);
	public static Item itemWhiteChocolate = new ItemFood(3, 0.5F, false).setUnlocalizedName("cookieverse:itemWhiteChocolate").setTextureName("cookieverse:itemWhiteChocolate").setCreativeTab(Cookieverse.creativeTab);
	public static Item itemBlackChocolate = new ItemFood(3, 0.5F, false).setUnlocalizedName("cookieverse:itemBlackChocolate").setTextureName("cookieverse:itemBlackChocolate").setCreativeTab(Cookieverse.creativeTab);

	public static Item itemCookieDough = new Item().setUnlocalizedName("cookieverse:itemCookieDough").setTextureName("cookieverse:itemCookieDough").setCreativeTab(Cookieverse.creativeTab);
	public static Item itemChocolateCookieDough = new Item().setUnlocalizedName("cookieverse:itemChocolateCookieDough").setTextureName("cookieverse:itemChocolateCookieDough").setCreativeTab(Cookieverse.creativeTab);
	public static Item itemChocolateCookie = new ItemFood(4, 0.7F, false).setUnlocalizedName("cookieverse:itemChocolateCookie").setTextureName("cookieverse:itemChocolateCookie").setCreativeTab(Cookieverse.creativeTab);
	public static Item itemWhiteChocolateCookieDough = new Item().setUnlocalizedName("cookieverse:itemWhiteChocolateCookieDough").setTextureName("cookieverse:itemWhiteChocolateCookieDough").setCreativeTab(Cookieverse.creativeTab);
	public static Item itemWhiteChocolateCookie = new ItemFood(5, 0.8F, false).setUnlocalizedName("cookieverse:itemWhiteChocolateCookie").setTextureName("cookieverse:itemWhiteChocolateCookie").setCreativeTab(Cookieverse.creativeTab);
	public static Item itemBlackChocolateCookieDough = new Item().setUnlocalizedName("cookieverse:itemBlackChocolateCookieDough").setTextureName("cookieverse:itemBlackChocolateCookieDough").setCreativeTab(Cookieverse.creativeTab);
	public static Item itemBlackChocolateCookie = new ItemFood(5, 0.8F, false).setUnlocalizedName("cookieverse:itemBlackChocolateCookie").setTextureName("cookieverse:itemBlackChocolateCookie").setCreativeTab(Cookieverse.creativeTab);

	public static Item bucketHotChocolate = (new ItemBucket(Blocks.hotChocolateMoving)).setUnlocalizedName("cookieverse:bucketHotChocolate").setContainerItem(Items.bucket).setTextureName("cookieverse:bucket_hot_chocolate").setCreativeTab(Cookieverse.creativeTab);
	public static Item cookieGun;
	public static Item exoticNuts = new ItemExoticNuts(1, 0.1F, false).setAlwaysEdible().setUnlocalizedName("cookieverse:exoticNuts").setTextureName("cookieverse:exoticNuts").setCreativeTab(Cookieverse.creativeTab);
	public static Item strangeNuts = new ItemStrangeNuts(1, 0.1F, false).setAlwaysEdible().setUnlocalizedName("cookieverse:strangeNuts").setTextureName("cookieverse:exoticNuts").setCreativeTab(Cookieverse.creativeTab);


	public static Item.ToolMaterial materialChocolate = EnumHelper.addToolMaterial("chocolate", 1, 200, 5.0F, 1.2F, 20);
	public static Item.ToolMaterial materialWhiteChocolate = EnumHelper.addToolMaterial("whiteChocolate", 2, 300, 7.0F, 2.2F, 20);
	public static Item.ToolMaterial materialBlackChocolate = EnumHelper.addToolMaterial("blackChocolate", 2, 300, 7.0F, 2.2F, 20);

	public static Item swordChocolate = (new ItemSword(materialChocolate)).setUnlocalizedName("cookieverse:swordChocolate").setTextureName("cookieverse:chocolate_sword").setCreativeTab(Cookieverse.creativeTab);
	public static Item shovelChocolate = (new ItemSpade(materialChocolate)).setUnlocalizedName("cookieverse:shovelChocolate").setTextureName("cookieverse:chocolate_shovel").setCreativeTab(Cookieverse.creativeTab);
	public static Item pickaxeChocolate = (new ItemChocolatePickaxe(materialChocolate)).setUnlocalizedName("cookieverse:pickaxeChocolate").setTextureName("cookieverse:chocolate_pickaxe").setCreativeTab(Cookieverse.creativeTab);
	public static Item axeChocolate = (new ItemChocolateAxe(materialChocolate)).setUnlocalizedName("cookieverse:hatchetChocolate").setTextureName("cookieverse:chocolate_axe").setCreativeTab(Cookieverse.creativeTab);
	public static Item hoeChocolate = (new ItemHoe(materialChocolate)).setUnlocalizedName("cookieverse:hoeChocolate").setTextureName("cookieverse:chocolate_hoe").setCreativeTab(Cookieverse.creativeTab);

	public static Item swordWhiteChocolate = (new ItemSword(materialWhiteChocolate)).setUnlocalizedName("cookieverse:swordWhiteChocolate").setTextureName("cookieverse:white_chocolate_sword").setCreativeTab(Cookieverse.creativeTab);
	public static Item shovelWhiteChocolate = (new ItemSpade(materialWhiteChocolate)).setUnlocalizedName("cookieverse:shovelWhiteChocolate").setTextureName("cookieverse:white_chocolate_shovel").setCreativeTab(Cookieverse.creativeTab);
	public static Item pickaxeWhiteChocolate = (new ItemChocolatePickaxe(materialWhiteChocolate)).setUnlocalizedName("cookieverse:pickaxeWhiteChocolate").setTextureName("cookieverse:white_chocolate_pickaxe").setCreativeTab(Cookieverse.creativeTab);
	public static Item axeWhiteChocolate = (new ItemChocolateAxe(materialWhiteChocolate)).setUnlocalizedName("cookieverse:hatchetWhiteChocolate").setTextureName("cookieverse:white_chocolate_axe").setCreativeTab(Cookieverse.creativeTab);
	public static Item hoeWhiteChocolate = (new ItemHoe(materialWhiteChocolate)).setUnlocalizedName("cookieverse:hoeWhiteChocolate").setTextureName("cookieverse:white_chocolate_hoe").setCreativeTab(Cookieverse.creativeTab);

	public static Item swordBlackChocolate = (new ItemSword(materialBlackChocolate)).setUnlocalizedName("cookieverse:swordBlackChocolate").setTextureName("cookieverse:black_chocolate_sword").setCreativeTab(Cookieverse.creativeTab);
	public static Item shovelBlackChocolate = (new ItemSpade(materialBlackChocolate)).setUnlocalizedName("cookieverse:shovelBlackChocolate").setTextureName("cookieverse:black_chocolate_shovel").setCreativeTab(Cookieverse.creativeTab);
	public static Item pickaxeBlackChocolate = (new ItemChocolatePickaxe(materialBlackChocolate)).setUnlocalizedName("cookieverse:pickaxeBlackChocolate").setTextureName("cookieverse:black_chocolate_pickaxe").setCreativeTab(Cookieverse.creativeTab);
	public static Item axeBlackChocolate = (new ItemChocolateAxe(materialBlackChocolate)).setUnlocalizedName("cookieverse:hatchetBlackChocolate").setTextureName("cookieverse:black_chocolate_axe").setCreativeTab(Cookieverse.creativeTab);
	public static Item hoeBlackChocolate = (new ItemHoe(materialBlackChocolate)).setUnlocalizedName("cookieverse:hoeBlackChocolate").setTextureName("cookieverse:black_chocolate_hoe").setCreativeTab(Cookieverse.creativeTab);

	public static Item cookieSeeds = new ItemSeeds(Blocks.cookieCrops, Blocks.cookieDough).setUnlocalizedName("cookieverse:cookieSeeds").setTextureName("cookieverse:cookieSeeds").setCreativeTab(Cookieverse.creativeTab);

	public static void preInit() {
        GameRegistry.registerItem(itemChocolate, "Chocolate");
        GameRegistry.registerItem(itemWhiteChocolate, "WhiteChocolate");
        GameRegistry.registerItem(itemBlackChocolate, "BlackChocolate");
        GameRegistry.registerItem(itemCookieDough, "CookieDough");
        GameRegistry.registerItem(itemChocolateCookieDough, "ChocolateCookieDough");
        GameRegistry.registerItem(itemChocolateCookie, "ChocolateCookie");
        GameRegistry.registerItem(itemWhiteChocolateCookieDough, "WhiteChocolateCookieDough");
        GameRegistry.registerItem(itemWhiteChocolateCookie, "WhiteChocolateCookie");
        GameRegistry.registerItem(itemBlackChocolateCookieDough, "BlackChocolateCookieDough");
        GameRegistry.registerItem(itemBlackChocolateCookie, "BlackChocolateCookie");

        GameRegistry.registerItem(bucketHotChocolate, "bucketHotChocolate");

        GameRegistry.registerItem(swordChocolate, "swordChocolate");
        GameRegistry.registerItem(shovelChocolate, "shovelChocolate");
        GameRegistry.registerItem(pickaxeChocolate, "pickaxeChocolate");
        GameRegistry.registerItem(axeChocolate, "axeChocolate");
        GameRegistry.registerItem(hoeChocolate, "hoeChocolate");

        GameRegistry.registerItem(swordWhiteChocolate, "swordWhiteChocolate");
        GameRegistry.registerItem(shovelWhiteChocolate, "shovelWhiteChocolate");
        GameRegistry.registerItem(pickaxeWhiteChocolate, "pickaxeWhiteChocolate");
        GameRegistry.registerItem(axeWhiteChocolate, "axeWhiteChocolate");
        GameRegistry.registerItem(hoeWhiteChocolate, "hoeWhiteChocolate");

        GameRegistry.registerItem(swordBlackChocolate, "swordBlackChocolate");
        GameRegistry.registerItem(shovelBlackChocolate, "shovelBlackChocolate");
        GameRegistry.registerItem(pickaxeBlackChocolate, "pickaxeBlackChocolate");
        GameRegistry.registerItem(axeBlackChocolate, "axeBlackChocolate");
        GameRegistry.registerItem(hoeBlackChocolate, "hoeBlackChocolate");

        GameRegistry.registerItem(cookieSeeds, "cookieSeeds");
        GameRegistry.registerItem(exoticNuts, "exoticNuts");
        GameRegistry.registerItem(strangeNuts, "strangeNuts");

		shovelChocolate.setHarvestLevel("shovel", 1);
		pickaxeChocolate.setHarvestLevel("pickaxe", 1);
		axeChocolate.setHarvestLevel("axe", 1);

		shovelWhiteChocolate.setHarvestLevel("shovel", 2);
		pickaxeWhiteChocolate.setHarvestLevel("pickaxe", 2);
		axeWhiteChocolate.setHarvestLevel("axe", 2);

		shovelBlackChocolate.setHarvestLevel("shovel", 2);
		pickaxeBlackChocolate.setHarvestLevel("pickaxe", 2);
		axeBlackChocolate.setHarvestLevel("axe", 2);
	}
/*
	static void addNameForObject(Item item, String enName, String jaName) {
		LanguageRegistry.instance().addNameForObject(item, "en_US", enName);
		LanguageRegistry.instance().addNameForObject(item, "ja_JP", jaName);
	}*/

}
