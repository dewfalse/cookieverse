package cookieverse.block;

import java.awt.Color;

import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.BlockSapling;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.entity.player.BonemealEvent;
import net.minecraftforge.event.terraingen.SaplingGrowTreeEvent;
import cookieverse.world.WorldGeneratorCookieTrees;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockCookieSapling extends BlockSapling {

	public BlockCookieSapling() {
		super();
	}

	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int par1, int par2) {
		return blockIcon;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister par1IconRegister) {
		this.blockIcon = par1IconRegister.registerIcon("cookieverse:cookieSapling");
	}

	@Override
	public int getBlockColor() {
		return Color.WHITE.getRGB();
	}

	@Override
	public int getRenderColor(int par1) {
		return Color.WHITE.getRGB();
	}

	@Override
	public int colorMultiplier(IBlockAccess par1iBlockAccess, int par2,
			int par3, int par4) {
		return Color.WHITE.getRGB();
	}

	@SubscribeEvent
	public void onBonemealEvent(BonemealEvent event) {
		if(event.world.isRemote) {
			return;
		}
		if(event.world.getBlock(event.x, event.y, event.z) == Blocks.cookieSapling) {
			if (event.world.rand.nextFloat() < 0.45D) {
				WorldGenerator g = new WorldGeneratorCookieTrees(true);
				event.world.setBlockToAir(event.x, event.y, event.z);
				g.generate(event.world, event.world.rand, event.x, event.y, event.z);
				event.setResult(Event.Result.ALLOW);
			}
		}
	}

	@SubscribeEvent
	public void onSaplingGrowTreeEvent(SaplingGrowTreeEvent event) {
		if(event.isCanceled()) {
			return;
		}
		if(event.getResult() != Event.Result.DEFAULT) {
			return;
		}
		if(event.world.getBlock(event.x, event.y, event.z) == Blocks.cookieSapling) {
			(new WorldGeneratorCookieTrees(true)).generate(event.world, event.rand, event.x, event.y, event.z);
			event.setResult(Event.Result.DENY);
		}

	}
}
