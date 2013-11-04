package cookieverse.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.terraingen.BiomeEvent;
import cookieverse.Config;
import cookieverse.Items;
import cookieverse.block.Blocks;
import cpw.mods.fml.common.registry.VillagerRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;

public class Village implements IVillageTradeHandler {

	static Village instance = new Village();
	static int villagerID;
	static int blackSmithID;

	public static void init() {
		villagerID = Config.villagerID;
		blackSmithID = Config.blackSmithID;
		VillagerRegistry.instance().registerVillagerId(villagerID);
		VillagerRegistry.instance().registerVillagerSkin(villagerID, new ResourceLocation("cookieverse", "textures/villager.png"));
		VillagerRegistry.instance().registerVillageTradeHandler(villagerID, instance);
		VillagerRegistry.instance().registerVillagerId(blackSmithID);
		VillagerRegistry.instance().registerVillagerSkin(blackSmithID, new ResourceLocation("cookieverse", "textures/villager.png"));
		VillagerRegistry.instance().registerVillageTradeHandler(blackSmithID, instance);
		MinecraftForge.TERRAIN_GEN_BUS.register(instance);
		BiomeManager.addVillageBiome(WorldChunkManagerCookieverse.cookieDough, true);
		BiomeManager.addVillageBiome(WorldChunkManagerCookieverse.chocolateCookieDough, true);
		BiomeManager.addVillageBiome(WorldChunkManagerCookieverse.whiteChocolateCookieDough, true);
		BiomeManager.addVillageBiome(WorldChunkManagerCookieverse.blackChocolateCookieDough, true);
		MinecraftForge.EVENT_BUS.register(instance);
	}

	@Override
	public void manipulateTradesForVillager(EntityVillager villager,
			MerchantRecipeList recipeList, Random random) {


		Item[] items = {Item.cookie, Items.itemBlackChocolateCookie, Items.itemWhiteChocolateCookie, Items.itemBlackChocolateCookie};
		if(villager.getProfession() == 1) {
			recipeList.add(new MerchantRecipe( new ItemStack(Item.cookie, 64, 0), new ItemStack(Items.exoticNuts.itemID, 1, 1)));
		}
		else if(villager.getProfession() == villagerID) {
			for(Item item : items) {
				recipeList.add(new MerchantRecipe( new ItemStack(item, 64, 0), new ItemStack(Items.exoticNuts.itemID, 1, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.cookieSeeds.itemID, 1, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.swordChocolate.itemID, 1, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.itemChocolate.itemID, 1, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.itemWhiteChocolate.itemID, 1, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.itemBlackChocolate.itemID, 1, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.itemCookieDough.itemID, 1, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.itemChocolateCookieDough.itemID, 1, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.itemWhiteChocolateCookieDough.itemID, 1, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.itemBlackChocolateCookieDough.itemID, 1, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, 1, 0), new ItemStack(Items.itemChocolate.itemID, random.nextInt(64)+1, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, 1, 0), new ItemStack(Items.itemWhiteChocolate.itemID, random.nextInt(64)+1, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, 1, 0), new ItemStack(Items.itemBlackChocolate.itemID, random.nextInt(64)+1, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, 1, 0), new ItemStack(Items.itemCookieDough.itemID, random.nextInt(64)+1, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, 1, 0), new ItemStack(Items.itemChocolateCookieDough.itemID, random.nextInt(64)+1, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, 1, 0), new ItemStack(Items.itemWhiteChocolateCookieDough.itemID, random.nextInt(64)+1, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, 1, 0), new ItemStack(Items.itemBlackChocolateCookieDough.itemID, random.nextInt(64)+1, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Blocks.cookieSapling.blockID, 1, 1)));
			}
		}
		else if(villager.getProfession() == blackSmithID) {
			for(Item item : items) {
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.swordChocolate.itemID, 1, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.shovelChocolate.itemID, 1, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.pickaxeChocolate.itemID, 1, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.axeChocolate.itemID, 1, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.hoeChocolate.itemID, 1, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.swordWhiteChocolate.itemID, 1, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.shovelWhiteChocolate.itemID, 1, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.pickaxeWhiteChocolate.itemID, 1, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.axeWhiteChocolate.itemID, 1, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.hoeWhiteChocolate.itemID, 1, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.swordBlackChocolate.itemID, 1, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.shovelBlackChocolate.itemID, 1, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.pickaxeBlackChocolate.itemID, 1, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.axeBlackChocolate.itemID, 1, 1)));
				recipeList.add(new MerchantRecipe( new ItemStack(item, random.nextInt(64)+1, 0), new ItemStack(Items.hoeBlackChocolate.itemID, 1, 1)));
			}
		}
	}

	@ForgeSubscribe
	public void getVillageBlockID(BiomeEvent.GetVillageBlockID event) {
		boolean found = false;
		for(BiomeGenBase biome : WorldChunkManagerCookieverse.cookieverseBiomeList) {
			if(event.biome.biomeID == biome.biomeID) {
				found = true;
				break;
			}
		}
		if(found == false) {
			return;
		}

		if (event.original == Block.wood.blockID) {
			event.replacement = Blocks.blackChocolateCookie.blockID;
		} else if (event.original == Block.cobblestone.blockID) {
			event.replacement = Blocks.cookie.blockID;
		} else if (event.original == Block.planks.blockID) {
			event.replacement = Blocks.chocolateCookie.blockID;
		} else if (event.original == Block.stairsWoodOak.blockID) {
			event.replacement = Blocks.whiteChocolateCookie.blockID;
		} else if (event.original == Block.stairsCobblestone.blockID) {
			event.replacement = Blocks.whiteChocolateCookie.blockID;
		} else if (event.original == Block.gravel.blockID) {
			event.replacement = Blocks.cookieDough.blockID;
		} else if (event.original == Block.dirt.blockID) {
			event.replacement = Blocks.blackChocolateCookieDough.blockID;
		} else if (event.original == Block.furnaceIdle.blockID) {
			return;
		} else if (event.original == Block.carrot.blockID) {
			event.replacement = Blocks.cookieCrops.blockID;
		} else if (event.original == Block.potato.blockID) {
			event.replacement = Blocks.cookieCrops.blockID;
		} else if (event.original == Block.crops.blockID) {
			event.replacement = Blocks.cookieCrops.blockID;
		} else if (event.original == Block.thinGlass.blockID) {
			return;
		} else if (event.original == Block.stoneDoubleSlab.blockID) {
			event.replacement = Blocks.blackChocolateCookie.blockID;
		} else if (event.original == Block.stoneSingleSlab.blockID) {
			event.replacement = Blocks.blackChocolateCookie.blockID;
		} else if (event.original == Block.fence.blockID) {
			return;
		} else if (event.original == Block.bookShelf.blockID) {
			return;
		} else if (event.original == Block.waterMoving.blockID) {
			event.replacement = Blocks.milkMoving.blockID;
		} else if (event.original == Block.tilledField.blockID) {
			event.replacement = Blocks.cookieDough.blockID;
		} else {
			return;
		}

		event.setResult(Result.DENY);

	}

	@ForgeSubscribe
	public void onEntityJoinWorldEvent(EntityJoinWorldEvent event) {
		if(event.isCanceled()) {
			return;
		}
		if(event.getResult() != Result.DEFAULT) {
			return;
		}
		if(event.entity instanceof EntityVillager && event.entity.dimension == Config.dimensionID) {
			switch(event.entity.worldObj.rand.nextInt(5)) {
			case 0:
				break;
			case 1:
				((EntityVillager)event.entity).setProfession(blackSmithID);
				event.setResult(Result.ALLOW);
				break;
			default:
				((EntityVillager)event.entity).setProfession(villagerID);
				event.setResult(Result.ALLOW);
				break;
			}
		}
	}
}