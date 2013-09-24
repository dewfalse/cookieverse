package cookieverse.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.IPlantable;

public class BlockDough extends Block {

	public BlockDough(int par1, Material par2Material) {
		super(par1, par2Material);
	}

	@Override
	public boolean canSustainPlant(World world, int x, int y, int z,
			ForgeDirection direction, IPlantable plant) {
		int plantID = plant.getPlantID(world, x, y + 1, z);
		EnumPlantType plantType = plant.getPlantType(world, x, y + 1, z);

		if (plantID == Blocks.cookieSapling.blockID) {
			return true;
		}
		if (plantID == Blocks.cookieCrops.blockID) {
			return true;
		}
		return false;
	}

}
