package cookieverse.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

public class BlockCookie extends Block {

	public BlockCookie(int par1, Material par2Material) {
		super(par1, par2Material);
	}

	@Override
	public boolean isLeaves(World world, int x, int y, int z) {
		return true;
	}

	@Override
	public boolean isWood(World world, int x, int y, int z) {
		return true;
	}

}
