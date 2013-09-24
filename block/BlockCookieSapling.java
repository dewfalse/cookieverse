package cookieverse.block;

import java.awt.Color;

import net.minecraft.block.BlockSapling;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.BonemealEvent;
import net.minecraftforge.event.terraingen.SaplingGrowTreeEvent;
import cookieverse.world.WorldGeneratorCookieTrees;

public class BlockCookieSapling extends BlockSapling {

	public BlockCookieSapling(int par1) {
		super(par1);
	}

	@Override
	public Icon getIcon(int par1, int par2) {
		return blockIcon;
	}

	@Override
	public void registerIcons(IconRegister par1IconRegister) {
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

	@ForgeSubscribe
	public void onBonemealEvent(BonemealEvent event) {
		if(event.world.isRemote) {
			return;
		}
		if(event.world.getBlockId(event.X, event.Y, event.Z) == Blocks.cookieSapling.blockID) {
			if (event.world.rand.nextFloat() < 0.45D) {
				WorldGenerator g = new WorldGeneratorCookieTrees(true);
				event.world.setBlock(event.X, event.Y, event.Z, 0, 0, 4);
				g.generate(event.world, event.world.rand, event.X, event.Y, event.Z);
				event.setResult(Result.ALLOW);
			}
		}
	}

	@ForgeSubscribe
	public void onSaplingGrowTreeEvent(SaplingGrowTreeEvent event) {
		if(event.isCanceled()) {
			return;
		}
		if(event.getResult() != Result.DEFAULT) {
			return;
		}
		if(event.world.getBlockId(event.x, event.y, event.z) == Blocks.cookieSapling.blockID) {
			(new WorldGeneratorCookieTrees(true)).generate(event.world, event.rand, event.x, event.y, event.z);
			event.setResult(Result.DENY);
		}

	}
}
