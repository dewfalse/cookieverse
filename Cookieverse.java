package cookieverse;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;
import cookieverse.block.Blocks;
import cookieverse.entity.Entities;
import cookieverse.world.Village;
import cookieverse.world.WorldChunkManagerCookieverse;
import cookieverse.world.WorldProviderCookieverse;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Cookieverse.modid, name = Cookieverse.modid, version = "1.0")
@NetworkMod
public class Cookieverse {
	public static final String modid = "cookieverse";

	@SidedProxy(clientSide = "cookieverse.ClientProxy", serverSide = "cookieverse.CommonProxy")
	public static CommonProxy proxy;

	@Instance("Cookieverse")
	public static Cookieverse instance;

	public static CreativeTabs creativeTab = new CookieCreativeTab("Cookieverse");

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		instance = this;
		Config.preInit(event.getSuggestedConfigurationFile());
		Blocks.preInit();
		Items.preInit();
		proxy.preInit();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		Entities.init();
		Recipes.init();
		Village.init();
		proxy.init();

		WorldChunkManagerCookieverse.init();
		DimensionManager.registerProviderType(Config.providerType, WorldProviderCookieverse.class, false);
		DimensionManager.registerDimension(Config.dimensionID, Config.providerType);

		MinecraftForge.EVENT_BUS.register(new FillBucketEventHandler());
		MinecraftForge.EVENT_BUS.register(Items.exoticNuts);
		MinecraftForge.EVENT_BUS.register(new EntityJoinInWorldEventHandler());
		MinecraftForge.TERRAIN_GEN_BUS.register(Blocks.cookieSapling);

		String[] categories = {
				ChestGenHooks.MINESHAFT_CORRIDOR,
				ChestGenHooks.PYRAMID_DESERT_CHEST,
				ChestGenHooks.PYRAMID_JUNGLE_CHEST,
				ChestGenHooks.STRONGHOLD_CORRIDOR,
				ChestGenHooks.STRONGHOLD_LIBRARY,
				ChestGenHooks.STRONGHOLD_CROSSING,
				ChestGenHooks.DUNGEON_CHEST,
				ChestGenHooks.VILLAGE_BLACKSMITH,
				};
		for(String category : categories) {
			ChestGenHooks.addItem(category, new WeightedRandomChestContent(new ItemStack(Items.exoticNuts), 1, 1, 3));
		}
	}
}
