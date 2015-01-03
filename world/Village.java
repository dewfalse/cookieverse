package cookieverse.world;

import java.util.Random;

import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import cookieverse.BiomeEventHandler;
import cookieverse.Config;
import cookieverse.Items;
import cookieverse.block.Blocks;
import cpw.mods.fml.common.registry.VillagerRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Village implements IVillageTradeHandler {

	public static Village instance = new Village();
	static int villagerID;
	static int blackSmithID;

	public static void init() {
		villagerID = Config.villagerID;
		blackSmithID = Config.blackSmithID;
		VillagerRegistry.instance().registerVillagerId(villagerID);
		VillagerRegistry.instance().registerVillageTradeHandler(villagerID, instance);
		VillagerRegistry.instance().registerVillagerId(blackSmithID);
		VillagerRegistry.instance().registerVillageTradeHandler(blackSmithID, instance);
		if(Config.cookieVillage) {
			MinecraftForge.TERRAIN_GEN_BUS.register(new BiomeEventHandler());
		}
		BiomeManager.addVillageBiome(WorldChunkManagerCookieverse.cookieDough, true);
		BiomeManager.addVillageBiome(WorldChunkManagerCookieverse.chocolateCookieDough, true);
		BiomeManager.addVillageBiome(WorldChunkManagerCookieverse.whiteChocolateCookieDough, true);
		BiomeManager.addVillageBiome(WorldChunkManagerCookieverse.blackChocolateCookieDough, true);
		MinecraftForge.EVENT_BUS.register(instance);
	}

	@SideOnly(Side.CLIENT)
	public void resierVillagerSkin() {
		VillagerRegistry.instance().registerVillagerSkin(villagerID, new ResourceLocation("cookieverse", "textures/villager.png"));
		VillagerRegistry.instance().registerVillagerSkin(blackSmithID, new ResourceLocation("cookieverse", "textures/villager.png"));
	}

	@Override
	public void manipulateTradesForVillager(EntityVillager villager,
			MerchantRecipeList recipeList, Random random) {


		Item[] items = {Items.cookie, Items.itemBlackChocolateCookie, Items.itemWhiteChocolateCookie, Items.itemBlackChocolateCookie};
		if(villager.getProfession() == 1) {
			recipeList.add(new MerchantRecipe( new ItemStack(Items.cookie, 64, 0), new ItemStack(Items.exoticNuts, 1)));
		}
		else if(villager.getProfession() == villagerID) {
			for(Item item : items) {
				recipeList.add(new MerchantRecipe( new ItemStack(item, 64, 0), new ItemStack(Items.exoticNuts, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.cookieSeeds, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.swordChocolate, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.itemChocolate, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.itemWhiteChocolate, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.itemBlackChocolate, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.itemCookieDough, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.itemChocolateCookieDough, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.itemWhiteChocolateCookieDough, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.itemBlackChocolateCookieDough, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, 1, 0), new ItemStack(Items.itemChocolate, random.nextInt(64)+1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, 1, 0), new ItemStack(Items.itemWhiteChocolate, random.nextInt(64)+1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, 1, 0), new ItemStack(Items.itemBlackChocolate, random.nextInt(64)+1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, 1, 0), new ItemStack(Items.itemCookieDough, random.nextInt(64)+1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, 1, 0), new ItemStack(Items.itemChocolateCookieDough, random.nextInt(64)+1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, 1, 0), new ItemStack(Items.itemWhiteChocolateCookieDough, random.nextInt(64)+1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, 1, 0), new ItemStack(Items.itemBlackChocolateCookieDough, random.nextInt(64)+1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Blocks.cookieSapling, 1)));
			}
		}
		else if(villager.getProfession() == blackSmithID) {
			for(Item item : items) {
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.swordChocolate, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.shovelChocolate, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.pickaxeChocolate, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.axeChocolate, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.hoeChocolate, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.swordWhiteChocolate, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.shovelWhiteChocolate, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.pickaxeWhiteChocolate, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.axeWhiteChocolate, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.hoeWhiteChocolate, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.swordBlackChocolate, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.shovelBlackChocolate, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.pickaxeBlackChocolate, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.axeBlackChocolate, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.hoeBlackChocolate, 1)));
			}
		}
	}

	@SubscribeEvent
	public void onEntityJoinWorldEvent(EntityJoinWorldEvent event) {
		if(event.isCanceled()) {
			return;
		}
		if(event.getResult() != Event.Result.DEFAULT) {
			return;
		}
		if(event.entity instanceof EntityVillager && event.entity.dimension == Config.dimensionID) {
			switch(event.entity.worldObj.rand.nextInt(5)) {
			case 0:
				break;
			case 1:
				((EntityVillager)event.entity).setProfession(blackSmithID);
				event.setResult(Event.Result.ALLOW);
				break;
			default:
				((EntityVillager)event.entity).setProfession(villagerID);
				event.setResult(Event.Result.ALLOW);
				break;
			}
		}
	}
}
