package cookieverse.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraftforge.common.ForgeDirection;
import cookieverse.block.Blocks;

public class WorldGeneratorCookieTrees extends WorldGenTrees {

	private final int minTreeHeight;
	private final int metaWood;
	private final int leavesID;

	public WorldGeneratorCookieTrees(boolean par1) {
		this(par1, 4, 0, Blocks.chocolateCookie.blockID, false);
	}

	public WorldGeneratorCookieTrees(boolean par1, int par2) {
		this(par1, 4, 0, par2, false);
	}

	public WorldGeneratorCookieTrees(boolean par1, int par2, int par3,
			int par4, boolean par5) {
		super(par1);
		this.minTreeHeight = par2;
		this.metaWood = par3;
		this.leavesID = par4;
	}

	@Override
	public boolean generate(World par1World, Random par2Random, int par3,
			int par4, int par5) {
		int l = par2Random.nextInt(3) + this.minTreeHeight;
		boolean flag = true;

		if (par4 >= 1 && par4 + l + 1 <= 256) {
			int i1;
			byte b0;
			int j1;
			int k1;

			for (i1 = par4; i1 <= par4 + 1 + l; ++i1) {
				b0 = 1;

				if (i1 == par4) {
					b0 = 0;
				}

				if (i1 >= par4 + 1 + l - 2) {
					b0 = 2;
				}

				for (int l1 = par3 - b0; l1 <= par3 + b0 && flag; ++l1) {
					for (j1 = par5 - b0; j1 <= par5 + b0 && flag; ++j1) {
						if (i1 >= 0 && i1 < 256) {
							k1 = par1World.getBlockId(l1, i1, j1);

							Block block = Block.blocksList[k1];

							if (k1 != 0
									&& !block.isLeaves(par1World, l1, i1, j1)
									&& k1 != Blocks.cookieDough.blockID
									&& k1 != Blocks.chocolateCookieDough.blockID
									&& k1 != Blocks.whiteChocolateCookieDough.blockID
									&& k1 != Blocks.blackChocolateCookieDough.blockID
									&& k1 != Blocks.cookie.blockID
									&& k1 != Blocks.chocolateCookie.blockID
									&& k1 != Blocks.whiteChocolateCookie.blockID
									&& k1 != Blocks.blackChocolateCookie.blockID
									&& k1 != Blocks.cookieSapling.blockID
									&& !block.isWood(par1World, l1, i1, j1)) {
								flag = false;
							}
						} else {
							flag = false;
						}
					}
				}
			}

			if (!flag) {
				return false;
			} else {
				par1World.setBlock(par3, par4, par5, 0, 0, 4);
				i1 = par1World.getBlockId(par3, par4 - 1, par5);
				Block soil = Block.blocksList[i1];
				boolean isSoil = (soil != null && soil.canSustainPlant(
						par1World, par3, par4 - 1, par5, ForgeDirection.UP,
						(BlockSapling) Blocks.cookieSapling));

				if (isSoil && par4 < 256 - l - 1) {
					soil.onPlantGrow(par1World, par3, par4 - 1, par5, par3,
							par4, par5);
					b0 = 3;
					byte b1 = 0;
					int i2;
					int j2;
					int k2;

					for (j1 = par4 - b0 + l; j1 <= par4 + l; ++j1) {
						k1 = j1 - (par4 + l);
						i2 = b1 + 1 - k1 / 2;

						for (j2 = par3 - i2; j2 <= par3 + i2; ++j2) {
							k2 = j2 - par3;

							for (int l2 = par5 - i2; l2 <= par5 + i2; ++l2) {
								int i3 = l2 - par5;

								if (Math.abs(k2) != i2 || Math.abs(i3) != i2
										|| par2Random.nextInt(2) != 0
										&& k1 != 0) {
									int j3 = par1World.getBlockId(j2, j1, l2);
									Block block = Block.blocksList[j3];

									if (block == null
											|| block.canBeReplacedByLeaves(
													par1World, j2, j1, l2)) {
										this.setBlockAndMetadata(par1World, j2,
												j1, l2,
												this.leavesID, 0);
									}
								}
							}
						}
					}

					for (j1 = 0; j1 < l; ++j1) {
						k1 = par1World.getBlockId(par3, par4 + j1, par5);

						Block block = Block.blocksList[k1];

						if (k1 == 0
								|| block == null
								|| block.isLeaves(par1World, par3, par4 + j1,
										par5)) {
							this.setBlockAndMetadata(par1World, par3,
									par4 + j1, par5, Blocks.cookie.blockID,
									this.metaWood);

						}
					}

					return true;
				} else {
					return false;
				}
			}
		} else {
			return false;
		}
	}

}
