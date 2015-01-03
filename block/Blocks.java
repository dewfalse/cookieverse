package cookieverse.block;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.common.MinecraftForge;
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

public class Blocks extends net.minecraft.init.Blocks{

    public static Block oreChocolate = new BlockOreChocolate(Material.clay).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("cookieverse:oreChocolate").setBlockTextureName("cookieverse:oreChocolate").setCreativeTab(Cookieverse.creativeTab);
	public static Block oreWhiteChocolate = new BlockOreChocolate(Material.clay).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("cookieverse:oreWhiteChocolate").setBlockTextureName("cookieverse:oreWhiteChocolate").setCreativeTab(Cookieverse.creativeTab);
	public static Block oreBlackChocolate = new BlockOreChocolate(Material.clay).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("cookieverse:oreBlackChocolate").setBlockTextureName("cookieverse:oreBlackChocolate").setCreativeTab(Cookieverse.creativeTab);
	public static Block blockChocolate = new CBlock(Material.clay).setHardness(3.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setBlockName("cookieverse:blockChocolate").setBlockTextureName("cookieverse:blockChocolate").setCreativeTab(Cookieverse.creativeTab);
	public static Block blockWhiteChocolate = new CBlock(Material.clay).setHardness(3.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setBlockName("cookieverse:blockWhiteChocolate").setBlockTextureName("cookieverse:blockWhiteChocolate").setCreativeTab(Cookieverse.creativeTab);
	public static Block blockBlackChocolate = new CBlock(Material.clay).setHardness(3.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setBlockName("cookieverse:blockBlackChocolate").setBlockTextureName("cookieverse:blockBlackChocolate").setCreativeTab(Cookieverse.creativeTab);

	public static BlockLiquid milkMoving;
	public static Block milkStill;
	public static BlockLiquid hotChocolateMoving = (BlockLiquid) (new BlockLiquidMoving(Material.lava)).setHardness(100.0F).setBlockName("cookieverse:hotChocolate").setBlockTextureName("cookieverse:hotChocolate");
	public static Block hotChocolateStill = (new BlockLiquidStill(Material.lava)).setHardness(100.0F).setBlockName("cookieverse:hotChocolate").setBlockTextureName("cookieverse:hotChocolate");

	public static Block cookieDough = new BlockDough(Material.clay).setHardness(0.5F).setStepSound(Block.soundTypeCloth).setBlockName("cookieverse:cookieDough").setBlockTextureName("cookieverse:cookieDough").setCreativeTab(Cookieverse.creativeTab);
	public static Block cookie = new BlockCookie(Material.clay).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeCloth).setBlockName("cookieverse:cookie").setBlockTextureName("cookieverse:cookie").setCreativeTab(Cookieverse.creativeTab);
	public static Block chocolateCookieDough = new BlockDough(Material.clay).setHardness(0.5F).setStepSound(Block.soundTypeCloth).setBlockName("cookieverse:chocolateCookieDough").setBlockTextureName("cookieverse:chocolateCookieDough").setCreativeTab(Cookieverse.creativeTab);
	public static Block chocolateCookie = new BlockCookie(Material.clay).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeCloth).setBlockName("cookieverse:chocolateCookie").setBlockTextureName("cookieverse:chocolateCookie").setCreativeTab(Cookieverse.creativeTab);
	public static Block whiteChocolateCookieDough = new BlockDough(Material.clay).setHardness(0.5F).setStepSound(Block.soundTypeCloth).setBlockName("cookieverse:whiteChocolateCookieDough").setBlockTextureName("cookieverse:whiteChocolateCookieDough").setCreativeTab(Cookieverse.creativeTab);
	public static Block whiteChocolateCookie = new BlockCookie(Material.clay).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeCloth).setBlockName("cookieverse:whiteChocolateCookie").setBlockTextureName("cookieverse:whiteChocolateCookie").setCreativeTab(Cookieverse.creativeTab);
	public static Block blackChocolateCookieDough = new BlockDough(Material.clay).setHardness(0.5F).setStepSound(Block.soundTypeCloth).setBlockName("cookieverse:blackChocolateCookieDough").setBlockTextureName("cookieverse:blackChocolateCookieDough").setCreativeTab(Cookieverse.creativeTab);
	public static Block blackChocolateCookie = new BlockCookie(Material.clay).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeCloth).setBlockName("cookieverse:blackChocolateCookie").setBlockTextureName("cookieverse:blackChocolateCookie").setCreativeTab(Cookieverse.creativeTab);

	public static Block cookieSapling = new BlockCookieSapling().setHardness(0.0F).setStepSound(Block.soundTypeGrass).setBlockName("cookieverse:cookieSapling").setBlockTextureName("cookieverse:cookieSapling").setCreativeTab(Cookieverse.creativeTab);
	public static Block cookieCrops = new BlockCookieCrops().setHardness(0.0F).setStepSound(Block.soundTypeGrass).setBlockName("cookieverse:cookieCrops");

	//public static Block sugarGas = new Block(Config.sugarGasID, Material.air).setHardness(0.0F).setUnlocalizedName("cookieverse:sugarGas").func_111022_d("cookieverse:sugarGas").setCreativeTab(Cookieverse.creativeTab);

	public static Block portal = new BlockCookiePortal(Material.portal).setLightLevel(0.1F).setHardness(-1.0F).setResistance(6000000.0F).setBlockName("cookieverse:portal").setCreativeTab(Cookieverse.creativeTab);

	public static Fluid milkFluid;
	public static Fluid hotChocolateFluid = new Fluid("hotChocolate").setBlock(hotChocolateStill);

    public Blocks() {
    }

	public static void preInit() {
        GameRegistry.registerBlock(oreChocolate, "oreChocolate");
		oreChocolate.setHarvestLevel("pickaxe", 1);
        GameRegistry.registerBlock(oreWhiteChocolate, "oreWhiteChocolate");
		oreWhiteChocolate.setHarvestLevel("pickaxe", 2);
        GameRegistry.registerBlock(oreBlackChocolate, "oreBlackChocolate");
        oreBlackChocolate.setHarvestLevel("pickaxe", 2);
        GameRegistry.registerBlock(blockChocolate, "blockChocolate");
		blockChocolate.setHarvestLevel("pickaxe", 1);
        GameRegistry.registerBlock(blockWhiteChocolate, "blockWhiteChocolate");
		blockWhiteChocolate.setHarvestLevel("pickaxe", 2);
        GameRegistry.registerBlock(blockBlackChocolate, "blockBlackChocolate");
		blockBlackChocolate.setHarvestLevel("pickaxe", 2);

        GameRegistry.registerBlock(hotChocolateMoving, "hotChocolateMoving");
        GameRegistry.registerBlock(hotChocolateStill, "hotChocolateStill");

		if (Config.useOtherMilk == false) {
			milkMoving = (BlockLiquid) (new BlockLiquidMoving(Material.water)).setHardness(100.0F).setBlockName("cookieverse:milk").setBlockTextureName("cookieverse:milk").setCreativeTab(Cookieverse.creativeTab);
            GameRegistry.registerBlock(milkMoving, "milkMoving");
			milkStill = (new BlockLiquidStill(Material.water)).setHardness(100.0F).setBlockName("cookieverse:milk").setBlockTextureName("cookieverse:milk").setCreativeTab(Cookieverse.creativeTab);
            GameRegistry.registerBlock(milkStill, "milkStill");

			milkFluid = new Fluid("milk").setBlock(milkStill);
			FluidRegistry.registerFluid(milkFluid);
			FluidContainerRegistry.registerFluidContainer(new FluidContainerData(new FluidStack(milkFluid, FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(Items.milk_bucket), new ItemStack(Items.bucket)));
		}

		FluidRegistry.registerFluid(hotChocolateFluid);
		FluidContainerRegistry.registerFluidContainer(new FluidContainerData(new FluidStack(hotChocolateFluid, FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(Items.bucketHotChocolate), new ItemStack(Items.bucket)));

        GameRegistry.registerBlock(cookieDough, "cookieDough");
		cookieDough.setHarvestLevel("shovel", 0);
        GameRegistry.registerBlock(cookie, "cookie");
		cookie.setHarvestLevel("pickaxe", 0);

        GameRegistry.registerBlock(chocolateCookieDough, "chocolateCookieDough");
		chocolateCookieDough.setHarvestLevel("shovel", 0);
        GameRegistry.registerBlock(chocolateCookie, "chocolateCookie");
		chocolateCookie.setHarvestLevel("pickaxe", 0);

        GameRegistry.registerBlock(whiteChocolateCookieDough, "whiteChocolateCookieDough");
		whiteChocolateCookieDough.setHarvestLevel("shovel", 1);
        GameRegistry.registerBlock(whiteChocolateCookie, "whiteChocolateCookie");
		whiteChocolateCookie.setHarvestLevel("pickaxe", 1);

        GameRegistry.registerBlock(blackChocolateCookieDough, "blackChocolateCookieDough");
		blackChocolateCookieDough.setHarvestLevel("shovel", 1);
        GameRegistry.registerBlock(blackChocolateCookie, "blackChocolateCookie");
		blackChocolateCookie.setHarvestLevel("pickaxe", 1);

        GameRegistry.registerBlock(cookieSapling, ItemBlockCookieSapling.class, "cookieSapling");
		MinecraftForge.EVENT_BUS.register(cookieSapling);

        GameRegistry.registerBlock(cookieCrops, "cookieCrops");

		//registerBlock(sugarGas, "sugarGas", "シュガーガス");
        GameRegistry.registerBlock(portal, "portal");
	}
/*
	private static void registerBlock(Block block, String enName, String jaName) {
		GameRegistry.registerBlock(block, enName);
		LanguageRegistry.instance().addNameForObject(block, "en_US", enName);
		LanguageRegistry.instance().addNameForObject(block, "ja_JP", jaName);
	}
*/
}
