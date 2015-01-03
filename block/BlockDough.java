package cookieverse.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;

public class BlockDough extends Block {

	public BlockDough(Material par2Material) {
		super(par2Material);
	}

	@Override
	public boolean canSustainPlant(IBlockAccess world, int x, int y, int z,
			ForgeDirection direction, IPlantable plant) {
		Block plantBlcok = plant.getPlant(world, x, y + 1, z);
		EnumPlantType plantType = plant.getPlantType(world, x, y + 1, z);

		if (plantBlcok == Blocks.cookieSapling) {
			return true;
		}
		if (plantBlcok == Blocks.cookieCrops) {
			return true;
		}
		return false;
	}

}
