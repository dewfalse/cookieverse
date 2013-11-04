package cookieverse;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.FMLLog;

public class Config {

	public static int oreChocolateID;
	public static int oreWhiteChocolateID;
	public static int oreBlackChocolateID;
	public static int blockChocolateID;
	public static int blockWhiteChocolateID;
	public static int blockBlackChocolateID;

	public static int milkMovingID;
	public static int milkStillID;
	public static int hotChocolateMovingID;
	public static int hotChocolateStillID;

	public static int cookieDoughID;
	public static int cookieID;
	public static int chocolateCookieDoughID;
	public static int chocolateCookieID;
	public static int whiteChocolateCookieDoughID;
	public static int whiteChocolateCookieID;
	public static int blackChocolateCookieDoughID;
	public static int blackChocolateCookieID;

	public static int cookieSaplingID;
	public static int cookieCropsID;
	public static int sugarGasID;
	public static int portalID;

	public static int itemChocolateID;
	public static int itemWhiteChocolateID;
	public static int itemBlackChocolateID;
	public static int itemCookieDoughID;
	public static int itemChocolateCookieDoughID;
	public static int itemChocolateCookieID;
	public static int itemWhiteChocolateCookieDoughID;
	public static int itemWhiteChocolateCookieID;
	public static int itemBlackChocolateCookieDoughID;
	public static int itemBlackChocolateCookieID;

	public static int swordChocolateID;
	public static int shovelChocolateID;
	public static int pickaxeChocolateID;
	public static int axeChocolateID;
	public static int hoeChocolateID;

	public static int swordWhiteChocolateID;
	public static int shovelWhiteChocolateID;
	public static int pickaxeWhiteChocolateID;
	public static int axeWhiteChocolateID;
	public static int hoeWhiteChocolateID;

	public static int swordBlackChocolateID;
	public static int shovelBlackChocolateID;
	public static int pickaxeBlackChocolateID;
	public static int axeBlackChocolateID;
	public static int hoeBlackChocolateID;

	public static int bucketHotChocolateID;
	public static int cookieSeedsID;
	public static int exoticNutsID;
	public static int strangeNutsID;

	public static int dimensionID;
	public static int providerType;
	public static int biomeID;
	public static int villagerID;
	public static int blackSmithID;
	public static int echantmentBaseID;
	public static boolean cookieVillage;
	public static boolean setBedrock;

	public static void preInit(File file) {
		Configuration cfg = new Configuration(file);
		try {
			cfg.load();

			oreChocolateID = cfg.getBlock("oreChocolateID", 3400).getInt();
			oreWhiteChocolateID = cfg.getBlock("oreWhiteChocolateID", 3401).getInt();
			oreBlackChocolateID = cfg.getBlock("oreBlackChocolateID", 3402).getInt();
			blockChocolateID = cfg.getBlock("blockChocolateID", 3403).getInt();
			blockWhiteChocolateID = cfg.getBlock("blockWhiteChocolateID", 3404).getInt();
			blockBlackChocolateID = cfg.getBlock("blockBlackChocolateID", 3405).getInt();
			milkMovingID = cfg.getBlock("milkMovingID", 3406).getInt();
			milkStillID = cfg.getBlock("milkStillID", 3407).getInt();
			hotChocolateMovingID = cfg.getBlock("hotChocolateMovingID", 3408).getInt();
			hotChocolateStillID = cfg.getBlock("hotChocolateStillID", 3409).getInt();
			cookieDoughID = cfg.getBlock("cookieDoughID", 3410).getInt();
			cookieID = cfg.getBlock("cookieID", 3411).getInt();
			chocolateCookieDoughID = cfg.getBlock("chocolateCookieDoughID", 3412).getInt();
			chocolateCookieID = cfg.getBlock("chocolateCookieID", 3413).getInt();
			whiteChocolateCookieDoughID = cfg.getBlock("whiteChocolateCookieDoughID", 3414).getInt();
			whiteChocolateCookieID = cfg.getBlock("whiteChocolateCookieID", 3415).getInt();
			blackChocolateCookieDoughID = cfg.getBlock("blackChocolateCookieDoughID", 3416).getInt();
			blackChocolateCookieID = cfg.getBlock("blackChocolateCookieID", 3417).getInt();
			cookieSaplingID = cfg.getBlock("cookieSaplingID", 3418).getInt();
			cookieCropsID = cfg.getBlock("cookieCropsID", 3419).getInt();
			sugarGasID = cfg.getBlock("sugarGasID", 3420).getInt();
			portalID = cfg.getBlock("portalID", 3421).getInt();

			itemChocolateID = cfg.getItem("itemChocolateID", 5000).getInt();
			itemWhiteChocolateID = cfg.getItem("itemWhiteChocolateID", 5001).getInt();
			itemBlackChocolateID = cfg.getItem("itemBlackChocolateID", 5002).getInt();
			itemCookieDoughID = cfg.getItem("itemCookieDoughID", 5003).getInt();
			itemChocolateCookieDoughID = cfg.getItem("itemChocolateCookieDoughID", 5004).getInt();
			itemChocolateCookieID = cfg.getItem("itemChocolateCookieID", 5005).getInt();
			itemWhiteChocolateCookieDoughID = cfg.getItem("itemWhiteChocolateCookieDoughID", 5006).getInt();
			itemWhiteChocolateCookieID = cfg.getItem("itemWhiteChocolateCookieID", 5007).getInt();
			itemBlackChocolateCookieDoughID = cfg.getItem("itemBlackChocolateCookieDoughID", 5008).getInt();
			itemBlackChocolateCookieID = cfg.getItem("itemBlackChocolateCookieID", 5009).getInt();

			swordChocolateID = cfg.getItem("swordChocolateID", 5010).getInt();
			shovelChocolateID = cfg.getItem("shovelChocolateID", 5011).getInt();
			pickaxeChocolateID = cfg.getItem("pickaxeChocolateID", 5012).getInt();
			axeChocolateID = cfg.getItem("axeChocolateID", 5013).getInt();
			hoeChocolateID = cfg.getItem("hoeChocolateID", 5014).getInt();

			swordWhiteChocolateID = cfg.getItem("swordWhiteChocolateID", 5015).getInt();
			shovelWhiteChocolateID = cfg.getItem("shovelWhiteChocolateID", 5016).getInt();
			pickaxeWhiteChocolateID = cfg.getItem("pickaxeWhiteChocolateID", 5017).getInt();
			axeWhiteChocolateID = cfg.getItem("axeWhiteChocolateID", 5018).getInt();
			hoeWhiteChocolateID = cfg.getItem("hoeWhiteChocolateID", 5019).getInt();

			swordBlackChocolateID = cfg.getItem("swordBlackChocolateID", 5020).getInt();
			shovelBlackChocolateID = cfg.getItem("shovelBlackChocolateID", 5021).getInt();
			pickaxeBlackChocolateID = cfg.getItem("pickaxeBlackChocolateID", 5022).getInt();
			axeBlackChocolateID = cfg.getItem("axeBlackChocolateID", 5023).getInt();
			hoeBlackChocolateID = cfg.getItem("hoeBlackChocolateID", 5024).getInt();

			bucketHotChocolateID = cfg.getItem("bucketHotChocolateID", 5025).getInt();
			cookieSeedsID = cfg.getItem("cookieSeedID", 5026).getInt();
			exoticNutsID = cfg.getItem("exoticNutsID", 5027).getInt();
			strangeNutsID = cfg.getItem("strangeNutsID", 5028).getInt();

			dimensionID = cfg.get(Configuration.CATEGORY_GENERAL, "dimensionID", 10).getInt();
			providerType = cfg.get(Configuration.CATEGORY_GENERAL, "providerType", 10).getInt();
			biomeID = cfg.get(Configuration.CATEGORY_GENERAL, "biomeID", 60).getInt();
			villagerID = cfg.get(Configuration.CATEGORY_GENERAL, "villagerID", 12).getInt();
			blackSmithID = cfg.get(Configuration.CATEGORY_GENERAL, "blackSmithID", 13).getInt();
			echantmentBaseID = cfg.get(Configuration.CATEGORY_GENERAL, "echantmentBaseID", 77).getInt();
			cookieVillage = cfg.get(Configuration.CATEGORY_GENERAL, "cookieVillage", true).getBoolean(true);
			setBedrock = cfg.get(Configuration.CATEGORY_GENERAL, "setBedrock", false).getBoolean(false);
			cfg.save();
		} catch (Exception e) {
			FMLLog.log(Level.SEVERE, e, Cookieverse.modid + " load config exception");
		} finally {
			cfg.save();
		}

	}

}
