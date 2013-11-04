package cookieverse.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import cookieverse.Config;
import cookieverse.block.Blocks;

public class EntityMilkreeper extends EntityCreeper {

	boolean attacked;
	@Override
	public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
		Entity src = par1DamageSource.getSourceOfDamage();
		if(src != null && src instanceof EntityLivingBase && Config.milkExplosion) {
			attacked = true;
		}
		return super.attackEntityFrom(par1DamageSource, par2);
	}

	public EntityMilkreeper(World par1World) {
		super(par1World);
	}

	@Override
	public void onUpdate() {
		if (this.isEntityAlive()) {
			super.onUpdate();
			if (this.isDead) {
				for (int i = 0; i < this.rand.nextInt(5) + 1; ++i) {
					int x = (int) (this.posX + this.rand.nextInt(10) - 5);
					int y = (int) (this.posY + this.rand.nextInt(10) - 5);
					int z = (int) (this.posZ + this.rand.nextInt(10) - 5);
					if (this.worldObj.isAirBlock(x, y, z)) {
						this.worldObj.setBlock(x, y, z,
								Blocks.milkMoving.blockID, 0, 0);
					}
				}
			}
		} else {
			super.onUpdate();
		}
	}
}
