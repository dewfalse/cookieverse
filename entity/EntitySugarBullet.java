package cookieverse.entity;

import cookieverse.Items;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntitySugarBullet extends EntityLargeFireball {

	public EntitySugarBullet(World par1World) {
		super(par1World);
	}

	@SideOnly(Side.CLIENT)
	public EntitySugarBullet(World par1World, double par2, double par4,
			double par6, double par8, double par10, double par12) {
		super(par1World, par2, par4, par6, par8, par10, par12);
	}

	public EntitySugarBullet(World par1World,
			EntityLivingBase par2EntityLivingBase, double par3, double par5,
			double par7) {
		super(par1World, par2EntityLivingBase, par3, par5, par7);
	}

	@Override
	protected void onImpact(MovingObjectPosition movingobjectposition) {

		if (!this.worldObj.isRemote) {
			if (movingobjectposition.entityHit != null
					&& movingobjectposition.entityHit != shootingEntity) {
				movingobjectposition.entityHit.attackEntityFrom(DamageSource
						.causeThrownDamage(this, this.shootingEntity), 6.0F);
			}

			this.worldObj.newExplosion((Entity) null, this.posX, this.posY,
					this.posZ, 1, false, this.worldObj.getGameRules()
							.getGameRuleBooleanValue("mobGriefing"));
			this.setDead();

			for (int i = 0; i < this.rand.nextInt(5) + 1; ++i) {
				EntityItem entityItem = new EntityItem(worldObj, this.posX,
						this.posY, this.posZ, new ItemStack(Items.sugar));
				double motionX = this.rand.nextGaussian() * 2 - 1;
				double motionY = this.rand.nextGaussian();
				double motionZ = this.rand.nextGaussian() * 2 - 1;
				entityItem.setVelocity(motionX, motionY, motionZ);
				this.worldObj.spawnEntityInWorld(entityItem);
			}
		}
	}

	@Override
	public boolean canRenderOnFire() {
		return false;
	}

}
