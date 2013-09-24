package cookieverse.entity;

import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.world.World;
import cookieverse.block.Blocks;

public class EntityMilkreeper extends EntityCreeper {

	public EntityMilkreeper(World par1World) {
		super(par1World);
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if(this.isDead) {
			for(int i = 0; i < this.rand.nextInt(5) + 1; ++i) {
				int x = (int) (this.posX + this.rand.nextInt(10) - 5);
				int y = (int) (this.posY + this.rand.nextInt(10) - 5);
				int z = (int) (this.posZ + this.rand.nextInt(10) - 5);
				if(this.worldObj.isAirBlock(x, y, z)) {
					this.worldObj.setBlock(x, y, z, Blocks.milkMoving.blockID, 0, 0);
				}
			}
		}
	}
}
