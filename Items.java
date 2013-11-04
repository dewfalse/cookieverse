package cookieverse;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cookieverse.block.Blocks;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {

	public static Item itemChocolate = new ItemFood(Config.itemChocolateID, 3, 0.5F, false).setUnlocalizedName("cookieverse:itemChocolate").func_111206_d("cookieverse:itemChocolate").setCreativeTab(Cookieverse.creativeTab);
	public static Item itemWhiteChocolate = new ItemFood(Config.itemWhiteChocolateID, 3, 0.5F, false).setUnlocalizedName("cookieverse:itemWhiteChocolate").func_111206_d("cookieverse:itemWhiteChocolate").setCreativeTab(Cookieverse.creativeTab);
	public static Item itemBlackChocolate = new ItemFood(Config.itemBlackChocolateID, 3, 0.5F, false).setUnlocalizedName("cookieverse:itemBlackChocolate").func_111206_d("cookieverse:itemBlackChocolate").setCreativeTab(Cookieverse.creativeTab);

	public static Item itemCookieDough = new Item(Config.itemCookieDoughID).setUnlocalizedName("cookieverse:itemCookieDough").func_111206_d("cookieverse:itemCookieDough").setCreativeTab(Cookieverse.creativeTab);
	public static Item itemChocolateCookieDough = new Item(Config.itemChocolateCookieDoughID).setUnlocalizedName("cookieverse:itemChocolateCookieDough").func_111206_d("cookieverse:itemChocolateCookieDough").setCreativeTab(Cookieverse.creativeTab);
	public static Item itemChocolateCookie = new ItemFood(Config.itemChocolateCookieID, 4, 0.7F, false).setUnlocalizedName("cookieverse:itemChocolateCookie").func_111206_d("cookieverse:itemChocolateCookie").setCreativeTab(Cookieverse.creativeTab);
	public static Item itemWhiteChocolateCookieDough = new Item(Config.itemWhiteChocolateCookieDoughID).setUnlocalizedName("cookieverse:itemWhiteChocolateCookieDough").func_111206_d("cookieverse:itemWhiteChocolateCookieDough").setCreativeTab(Cookieverse.creativeTab);
	public static Item itemWhiteChocolateCookie = new ItemFood(Config.itemWhiteChocolateCookieID, 5, 0.8F, false).setUnlocalizedName("cookieverse:itemWhiteChocolateCookie").func_111206_d("cookieverse:itemWhiteChocolateCookie").setCreativeTab(Cookieverse.creativeTab);
	public static Item itemBlackChocolateCookieDough = new Item(Config.itemBlackChocolateCookieDoughID).setUnlocalizedName("cookieverse:itemBlackChocolateCookieDough").func_111206_d("cookieverse:itemBlackChocolateCookieDough").setCreativeTab(Cookieverse.creativeTab);
	public static Item itemBlackChocolateCookie = new ItemFood(Config.itemBlackChocolateCookieID, 5, 0.8F, false).setUnlocalizedName("cookieverse:itemBlackChocolateCookie").func_111206_d("cookieverse:itemBlackChocolateCookie").setCreativeTab(Cookieverse.creativeTab);

	public static Item bucketHotChocolate = (new ItemBucket(Config.bucketHotChocolateID, Blocks.hotChocolateMoving.blockID)).setUnlocalizedName("cookieverse:bucketHotChocolate").setContainerItem(Item.bucketEmpty).func_111206_d("cookieverse:bucket_hot_chocolate").setCreativeTab(Cookieverse.creativeTab);
	public static Item cookieGun;
	public static Item exoticNuts = new ItemExoticNuts(Config.exoticNutsID, 1, 0.1F, false).setAlwaysEdible().setUnlocalizedName("cookieverse:exoticNuts").func_111206_d("cookieverse:exoticNuts").setCreativeTab(Cookieverse.creativeTab);
	public static Item strangeNuts = new ItemStrangeNuts(Config.strangeNutsID, 1, 0.1F, false).setAlwaysEdible().setUnlocalizedName("cookieverse:strangeNuts").func_111206_d("cookieverse:exoticNuts").setCreativeTab(Cookieverse.creativeTab);


	public static EnumToolMaterial materialChocolate = EnumHelper.addToolMaterial("chocolate", 1, 200, 5.0F, 1.2F, 20);
	public static EnumToolMaterial materialWhiteChocolate = EnumHelper.addToolMaterial("whiteChocolate", 2, 300, 7.0F, 2.2F, 20);
	public static EnumToolMaterial materialBlackChocolate = EnumHelper.addToolMaterial("blackChocolate", 2, 300, 7.0F, 2.2F, 20);

	public static Item swordChocolate = (new ItemSword(Config.swordChocolateID, materialChocolate)).setUnlocalizedName("cookieverse:cookieverse:swordChocolate").func_111206_d("cookieverse:chocolate_sword").setCreativeTab(Cookieverse.creativeTab);
	public static Item shovelChocolate = (new ItemSpade(Config.shovelChocolateID, materialChocolate)).setUnlocalizedName("cookieverse:shovelChocolate").func_111206_d("cookieverse:chocolate_shovel").setCreativeTab(Cookieverse.creativeTab);
	public static Item pickaxeChocolate = (new ItemPickaxe(Config.pickaxeChocolateID, materialChocolate)).setUnlocalizedName("cookieverse:pickaxeChocolate").func_111206_d("cookieverse:chocolate_pickaxe").setCreativeTab(Cookieverse.creativeTab);
	public static Item axeChocolate = (new ItemAxe(Config.axeChocolateID, materialChocolate)).setUnlocalizedName("cookieverse:hatchetChocolate").func_111206_d("cookieverse:chocolate_axe").setCreativeTab(Cookieverse.creativeTab);
	public static Item hoeChocolate = (new ItemHoe(Config.hoeChocolateID, materialChocolate)).setUnlocalizedName("cookieverse:hoeChocolate").func_111206_d("cookieverse:chocolate_hoe").setCreativeTab(Cookieverse.creativeTab);

	public static Item swordWhiteChocolate = (new ItemSword(Config.swordWhiteChocolateID, materialWhiteChocolate)).setUnlocalizedName("cookieverse:swordWhiteChocolate").func_111206_d("cookieverse:white_chocolate_sword").setCreativeTab(Cookieverse.creativeTab);
	public static Item shovelWhiteChocolate = (new ItemSpade(Config.shovelWhiteChocolateID, materialWhiteChocolate)).setUnlocalizedName("cookieverse:shovelWhiteChocolate").func_111206_d("cookieverse:white_chocolate_shovel").setCreativeTab(Cookieverse.creativeTab);
	public static Item pickaxeWhiteChocolate = (new ItemPickaxe(Config.pickaxeWhiteChocolateID, materialWhiteChocolate)).setUnlocalizedName("cookieverse:pickaxeWhiteChocolate").func_111206_d("cookieverse:white_chocolate_pickaxe").setCreativeTab(Cookieverse.creativeTab);
	public static Item axeWhiteChocolate = (new ItemAxe(Config.axeWhiteChocolateID, materialWhiteChocolate)).setUnlocalizedName("cookieverse:hatchetWhiteChocolate").func_111206_d("cookieverse:white_chocolate_axe").setCreativeTab(Cookieverse.creativeTab);
	public static Item hoeWhiteChocolate = (new ItemHoe(Config.hoeWhiteChocolateID, materialWhiteChocolate)).setUnlocalizedName("cookieverse:hoeWhiteChocolate").func_111206_d("cookieverse:white_chocolate_hoe").setCreativeTab(Cookieverse.creativeTab);

	public static Item swordBlackChocolate = (new ItemSword(Config.swordBlackChocolateID, materialBlackChocolate)).setUnlocalizedName("cookieverse:swordBlackChocolate").func_111206_d("cookieverse:black_chocolate_sword").setCreativeTab(Cookieverse.creativeTab);
	public static Item shovelBlackChocolate = (new ItemSpade(Config.shovelBlackChocolateID, materialBlackChocolate)).setUnlocalizedName("cookieverse:shovelBlackChocolate").func_111206_d("cookieverse:black_chocolate_shovel").setCreativeTab(Cookieverse.creativeTab);
	public static Item pickaxeBlackChocolate = (new ItemPickaxe(Config.pickaxeBlackChocolateID, materialBlackChocolate)).setUnlocalizedName("cookieverse:pickaxeBlackChocolate").func_111206_d("cookieverse:black_chocolate_pickaxe").setCreativeTab(Cookieverse.creativeTab);
	public static Item axeBlackChocolate = (new ItemAxe(Config.axeBlackChocolateID, materialBlackChocolate)).setUnlocalizedName("cookieverse:hatchetBlackChocolate").func_111206_d("cookieverse:black_chocolate_axe").setCreativeTab(Cookieverse.creativeTab);
	public static Item hoeBlackChocolate = (new ItemHoe(Config.hoeBlackChocolateID, materialBlackChocolate)).setUnlocalizedName("cookieverse:hoeBlackChocolate").func_111206_d("cookieverse:black_chocolate_hoe").setCreativeTab(Cookieverse.creativeTab);

	public static Item cookieSeeds = new ItemSeeds(Config.cookieSeedsID, Blocks.cookieCrops.blockID, Blocks.cookieDough.blockID).setUnlocalizedName("cookieverse:cookieSeeds").func_111206_d("cookieverse:cookieSeeds").setCreativeTab(Cookieverse.creativeTab);

	public static void preInit() {
		addNameForObject(itemChocolate, "Chocolate", "チョコレート");
		addNameForObject(itemWhiteChocolate, "WhiteChocolate", "ホワイトチョコレート");
		addNameForObject(itemBlackChocolate, "BlackChocolate", "ブラックチョコレート");
		addNameForObject(itemCookieDough, "CookieDough", "クッキー生地");
		addNameForObject(itemChocolateCookieDough, "ChocolateCookieDough", "チョコレートクッキー生地");
		addNameForObject(itemChocolateCookie, "ChocolateCookie", "チョコレートクッキー");
		addNameForObject(itemWhiteChocolateCookieDough, "WhiteChocolateCookieDough", "ホワイトチョコレートクッキー生地");
		addNameForObject(itemWhiteChocolateCookie, "WhiteChocolateCookie", "ホワイトチョコレートクッキー");
		addNameForObject(itemBlackChocolateCookieDough, "BlackChocolateCookieDough", "ブラックチョコレートクッキー生地");
		addNameForObject(itemBlackChocolateCookie, "BlackChocolateCookie", "ブラックチョコレートクッキー");

		addNameForObject(bucketHotChocolate, "bucketHotChocolate", "ホットチョコレート入りバケツ");

		addNameForObject(swordChocolate, "swordChocolate", "チョコレートの剣");
		addNameForObject(shovelChocolate, "shovelChocolate", "チョコレートのシャベル");
		addNameForObject(pickaxeChocolate, "pickaxeChocolate", "チョコレートのツルハシ");
		addNameForObject(axeChocolate, "axeChocolate", "チョコレートの斧");
		addNameForObject(hoeChocolate, "hoeChocolate", "チョコレートのクワ");

		addNameForObject(swordWhiteChocolate, "swordWhiteChocolate", "ホワイトチョコレートの剣");
		addNameForObject(shovelWhiteChocolate, "shovelWhiteChocolate", "ホワイトチョコレートのシャベル");
		addNameForObject(pickaxeWhiteChocolate, "pickaxeWhiteChocolate", "ホワイトチョコレートのツルハシ");
		addNameForObject(axeWhiteChocolate, "axeWhiteChocolate", "ホワイトチョコレートの斧");
		addNameForObject(hoeWhiteChocolate, "hoeWhiteChocolate", "ホワイトチョコレートのクワ");

		addNameForObject(swordBlackChocolate, "swordBlackChocolate", "ブラックチョコレートの剣");
		addNameForObject(shovelBlackChocolate, "shovelBlackChocolate", "ブラックチョコレートのシャベル");
		addNameForObject(pickaxeBlackChocolate, "pickaxeBlackChocolate", "ブラックチョコレートのツルハシ");
		addNameForObject(axeBlackChocolate, "axeBlackChocolate", "ブラックチョコレートの斧");
		addNameForObject(hoeBlackChocolate, "hoeBlackChocolate", "ブラックチョコレートのクワ");

		addNameForObject(cookieSeeds, "cookieSeeds", "クッキーの種");
		addNameForObject(exoticNuts, "exoticNuts", "エキゾチックなナッツ");
		addNameForObject(strangeNuts, "strangeNuts", "奇妙なナッツ");

		MinecraftForge.setToolClass(shovelChocolate, "shovel", 1);
		MinecraftForge.setToolClass(pickaxeChocolate, "pickaxe", 1);
		MinecraftForge.setToolClass(axeChocolate, "axe", 1);

		MinecraftForge.setToolClass(shovelWhiteChocolate, "shovel", 2);
		MinecraftForge.setToolClass(pickaxeWhiteChocolate, "pickaxe", 2);
		MinecraftForge.setToolClass(axeWhiteChocolate, "axe", 2);

		MinecraftForge.setToolClass(shovelBlackChocolate, "shovel", 2);
		MinecraftForge.setToolClass(pickaxeBlackChocolate, "pickaxe", 2);
		MinecraftForge.setToolClass(axeBlackChocolate, "axe", 2);
	}

	static void addNameForObject(Item item, String enName, String jaName) {
		LanguageRegistry.instance().addNameForObject(item, "en_US", enName);
		LanguageRegistry.instance().addNameForObject(item, "ja_JP", jaName);
	}

}
