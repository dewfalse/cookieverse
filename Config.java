package cookieverse;

import java.io.File;
import org.apache.logging.log4j.Level;

import cpw.mods.fml.common.FMLLog;
import net.minecraftforge.common.config.Configuration;

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
	public static boolean milkExplosion;
	public static boolean useOtherMilk;

	public static void preInit(File file) {
		Configuration cfg = new Configuration(file);
		try {
			cfg.load();

			dimensionID = cfg.get(Configuration.CATEGORY_GENERAL, "dimensionID", 10).getInt();
			providerType = cfg.get(Configuration.CATEGORY_GENERAL, "providerType", 10).getInt();
			biomeID = cfg.get(Configuration.CATEGORY_GENERAL, "biomeID", 60).getInt();
			villagerID = cfg.get(Configuration.CATEGORY_GENERAL, "villagerID", 12).getInt();
			blackSmithID = cfg.get(Configuration.CATEGORY_GENERAL, "blackSmithID", 13).getInt();
			echantmentBaseID = cfg.get(Configuration.CATEGORY_GENERAL, "echantmentBaseID", 77).getInt();
			cookieVillage = cfg.get(Configuration.CATEGORY_GENERAL, "cookieVillage", true).getBoolean(true);
			milkExplosion = cfg.get(Configuration.CATEGORY_GENERAL, "milkExplosion", true).getBoolean(true);
			useOtherMilk = cfg.get(Configuration.CATEGORY_GENERAL, "useOtherMilk", false).getBoolean(false);
			cfg.save();
		} catch (Exception e) {
			FMLLog.log(Level.ERROR, e, Cookieverse.modid + " load config exception");
		} finally {
			cfg.save();
		}

	}

}
