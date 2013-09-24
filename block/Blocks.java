package cookieverse.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFluid;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidContainerRegistry.FluidContainerData;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import cookieverse.Config;
import cookieverse.Cookieverse;
import cookieverse.Items;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Blocks {

	public static Block oreChocolate = new BlockOreChocolate(Config.oreChocolateID, Material.cake).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("cookieverse:oreChocolate").func_111022_d("cookieverse:oreChocolate").setCreativeTab(Cookieverse.creativeTab);
	public static Block oreWhiteChocolate = new BlockOreChocolate(Config.oreWhiteChocolateID, Material.cake).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("cookieverse:oreWhiteChocolate").func_111022_d("cookieverse:oreWhiteChocolate").setCreativeTab(Cookieverse.creativeTab);
	public static Block oreBlackChocolate = new BlockOreChocolate(Config.oreBlackChocolateID, Material.cake).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("cookieverse:oreBlackChocolate").func_111022_d("cookieverse:oreBlackChocolate").setCreativeTab(Cookieverse.creativeTab);
	public static Block blockChocolate = new Block(Config.blockChocolateID, Material.cake).setHardness(3.0F).setResistance(10.0F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("cookieverse:blockChocolate").func_111022_d("cookieverse:blockChocolate").setCreativeTab(Cookieverse.creativeTab);
	public static Block blockWhiteChocolate = new Block(Config.blockWhiteChocolateID, Material.cake).setHardness(3.0F).setResistance(10.0F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("cookieverse:blockWhiteChocolate").func_111022_d("cookieverse:blockWhiteChocolate").setCreativeTab(Cookieverse.creativeTab);
	public static Block blockBlackChocolate = new Block(Config.blockBlackChocolateID, Material.cake).setHardness(3.0F).setResistance(10.0F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("cookieverse:blockBlackChocolate").func_111022_d("cookieverse:blockBlackChocolate").setCreativeTab(Cookieverse.creativeTab);

	public static BlockFluid milkMoving = (BlockFluid)(new BlockLiquidMoving(Config.milkMovingID, Material.water)).setHardness(100.0F).setUnlocalizedName("cookieverse:milk").func_111022_d("cookieverse:milk").setCreativeTab(Cookieverse.creativeTab);
	public static Block milkStill = (new BlockLiquidStill(Config.milkStillID, Material.water)).setHardness(100.0F).setUnlocalizedName("cookieverse:milk").func_111022_d("cookieverse:milk").setCreativeTab(Cookieverse.creativeTab);
	public static BlockFluid hotChocolateMoving = (BlockFluid)(new BlockLiquidMoving(Config.hotChocolateMovingID, Material.lava)).setHardness(100.0F).setUnlocalizedName("cookieverse:hotChocolate").func_111022_d("cookieverse:hotChocolate");
	public static Block hotChocolateStill = (new BlockLiquidStill(Config.hotChocolateStillID, Material.lava)).setHardness(100.0F).setUnlocalizedName("cookieverse:hotChocolate").func_111022_d("cookieverse:hotChocolate");

	public static Block cookieDough = new BlockDough(Config.cookieDoughID, Material.cake).setHardness(0.5F).setStepSound(Block.soundClothFootstep).setUnlocalizedName("cookieverse:cookieDough").func_111022_d("cookieverse:cookieDough").setCreativeTab(Cookieverse.creativeTab);
	public static Block cookie = new BlockCookie(Config.cookieID, Material.cake).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundClothFootstep).setUnlocalizedName("cookieverse:cookie").func_111022_d("cookieverse:cookie").setCreativeTab(Cookieverse.creativeTab);
	public static Block chocolateCookieDough = new BlockDough(Config.chocolateCookieDoughID, Material.cake).setHardness(0.5F).setStepSound(Block.soundClothFootstep).setUnlocalizedName("cookieverse:chocolateCookieDough").func_111022_d("cookieverse:chocolateCookieDough").setCreativeTab(Cookieverse.creativeTab);
	public static Block chocolateCookie = new BlockCookie(Config.chocolateCookieID, Material.cake).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundClothFootstep).setUnlocalizedName("cookieverse:chocolateCookie").func_111022_d("cookieverse:chocolateCookie").setCreativeTab(Cookieverse.creativeTab);
	public static Block whiteChocolateCookieDough = new BlockDough(Config.whiteChocolateCookieDoughID, Material.cake).setHardness(0.5F).setStepSound(Block.soundClothFootstep).setUnlocalizedName("cookieverse:whiteChocolateCookieDough").func_111022_d("cookieverse:whiteChocolateCookieDough").setCreativeTab(Cookieverse.creativeTab);
	public static Block whiteChocolateCookie = new BlockCookie(Config.whiteChocolateCookieID, Material.cake).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundClothFootstep).setUnlocalizedName("cookieverse:whiteChocolateCookie").func_111022_d("cookieverse:whiteChocolateCookie").setCreativeTab(Cookieverse.creativeTab);
	public static Block blackChocolateCookieDough = new BlockDough(Config.blackChocolateCookieDoughID, Material.cake).setHardness(0.5F).setStepSound(Block.soundClothFootstep).setUnlocalizedName("cookieverse:blackChocolateCookieDough").func_111022_d("cookieverse:blackChocolateCookieDough").setCreativeTab(Cookieverse.creativeTab);
	public static Block blackChocolateCookie = new BlockCookie(Config.blackChocolateCookieID, Material.cake).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundClothFootstep).setUnlocalizedName("cookieverse:blackChocolateCookie").func_111022_d("cookieverse:blackChocolateCookie").setCreativeTab(Cookieverse.creativeTab);

	public static Block cookieSapling = new BlockCookieSapling(Config.cookieSaplingID).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("cookieverse:cookieSapling").func_111022_d("cookieverse:cookieSapling").setCreativeTab(Cookieverse.creativeTab);
	public static Block cookieCrops = new BlockCookieCrops(Config.cookieCropsID).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("cookieverse:cookieCrops");

	//public static Block sugarGas = new Block(Config.sugarGasID, Material.air).setHardness(0.0F).setUnlocalizedName("cookieverse:sugarGas").func_111022_d("cookieverse:sugarGas").setCreativeTab(Cookieverse.creativeTab);

	public static Block portal = new BlockCookiePortal(Config.portalID, Material.portal).setHardness(-1.0F).setResistance(6000000.0F).setUnlocalizedName("cookieverse:portal").setCreativeTab(Cookieverse.creativeTab);

	public static Fluid milkFluid = new Fluid("milk").setBlockID(milkStill.blockID);
	public static Fluid hotChocolateFluid = new Fluid("hotChocolate").setBlockID(hotChocolateStill.blockID);

	public static void preInit() {
		registerBlock(oreChocolate, "oreChocolate", "チョコレート鉱石");
		MinecraftForge.setBlockHarvestLevel(oreChocolate, "pickaxe", 1);
		registerBlock(oreWhiteChocolate, "oreWhiteChocolate", "ホワイトチョコレート鉱石");
		MinecraftForge.setBlockHarvestLevel(oreWhiteChocolate, "pickaxe", 2);
		registerBlock(oreBlackChocolate, "oreBlackChocolate", "ブラックチョコレート鉱石");
		MinecraftForge.setBlockHarvestLevel(oreBlackChocolate, "pickaxe", 2);
		registerBlock(blockChocolate, "blockChocolate", "チョコレートブロック");
		MinecraftForge.setBlockHarvestLevel(blockChocolate, "pickaxe", 1);
		registerBlock(blockWhiteChocolate, "blockWhiteChocolate", "ホワイトチョコレートブロック");
		MinecraftForge.setBlockHarvestLevel(blockWhiteChocolate, "pickaxe", 2);
		registerBlock(blockBlackChocolate, "blockBlackChocolate", "ブラックチョコレートブロック");
		MinecraftForge.setBlockHarvestLevel(blockBlackChocolate, "pickaxe", 2);

		registerBlock(milkMoving, "milkMoving", "ミルク");
		registerBlock(milkStill, "milkStill", "ミルク");
		registerBlock(hotChocolateMoving, "hotChocolateMoving", "ホットチョコレート");
		registerBlock(hotChocolateStill, "hotChocolateStill", "ホットチョコレート");

		FluidRegistry.registerFluid(milkFluid);
		FluidContainerRegistry
				.registerFluidContainer(new FluidContainerData(new FluidStack(
						milkFluid, FluidContainerRegistry.BUCKET_VOLUME),
						new ItemStack(Item.bucketMilk), new ItemStack(
								Item.bucketEmpty)));

		FluidRegistry.registerFluid(hotChocolateFluid);
		FluidContainerRegistry
				.registerFluidContainer(new FluidContainerData(new FluidStack(
						hotChocolateFluid, FluidContainerRegistry.BUCKET_VOLUME),
						new ItemStack(Items.bucketHotChocolate), new ItemStack(
								Item.bucketEmpty)));

		registerBlock(cookieDough, "cookieDough", "クッキー生地");
		MinecraftForge.setBlockHarvestLevel(cookieDough, "shovel", 0);
		registerBlock(cookie, "cookie", "クッキー");
		MinecraftForge.setBlockHarvestLevel(cookie, "pickaxe", 0);

		registerBlock(chocolateCookieDough, "chocolateCookieDough", "チョコレートクッキー生地");
		MinecraftForge.setBlockHarvestLevel(chocolateCookieDough, "shovel", 0);
		registerBlock(chocolateCookie, "chocolateCookie", "チョコレートクッキー");
		MinecraftForge.setBlockHarvestLevel(chocolateCookie, "pickaxe", 0);

		registerBlock(whiteChocolateCookieDough, "whiteChocolateCookieDough", "ホワイトチョコレートクッキー生地");
		MinecraftForge.setBlockHarvestLevel(whiteChocolateCookieDough, "shovel", 1);
		registerBlock(whiteChocolateCookie, "whiteChocolateCookie", "ホワイトチョコレートクッキー");
		MinecraftForge.setBlockHarvestLevel(whiteChocolateCookie, "pickaxe", 1);

		registerBlock(blackChocolateCookieDough, "blackChocolateCookieDough", "ブラックチョコレートクッキー生地");
		MinecraftForge.setBlockHarvestLevel(blackChocolateCookieDough, "shovel", 1);
		registerBlock(blackChocolateCookie, "blackChocolateCookie", "ブラックチョコレートクッキー");
		MinecraftForge.setBlockHarvestLevel(blackChocolateCookie, "pickaxe", 1);

		registerBlock(cookieSapling, "cookieSapling", "クッキーの苗木");
		ItemBlock itemBlockSapling = (ItemBlock) new ItemBlockCookieSapling(cookieSapling.blockID - 256).setUnlocalizedName("cookieverse:cookieSapling");
		GameRegistry.registerItem(itemBlockSapling, "itemBlockCookieSapling");
		MinecraftForge.EVENT_BUS.register(cookieSapling);

		registerBlock(cookieCrops, "cookieCrops", "クッキーの種");

		//registerBlock(sugarGas, "sugarGas", "シュガーガス");
		registerBlock(portal, "portal", "ポータル");
	}

	private static void registerBlock(Block block, String enName, String jaName) {
		GameRegistry.registerBlock(block, enName);
		LanguageRegistry.instance().addNameForObject(block, "en_US", enName);
		LanguageRegistry.instance().addNameForObject(block, "ja_JP", jaName);
	}

	@ForgeSubscribe
	public void onTextureStitch(TextureStitchEvent.Post event) {
		milkFluid.setIcons(milkStill.getIcon(0, 0),
				milkStill.getIcon(2, 0));
		hotChocolateFluid.setIcons(hotChocolateStill.getIcon(0, 0),
				hotChocolateStill.getIcon(2, 0));
	}
}
