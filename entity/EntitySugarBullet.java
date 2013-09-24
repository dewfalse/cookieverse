package cookieverse.entity;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagDouble;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class EntitySugarBullet extends EntityThrowable {

	private int xTile = -1;
	private int yTile = -1;
	private int zTile = -1;
	private int inTile;
	private boolean inGround;
	public EntityLivingBase shootingEntity;
	private int ticksAlive;
	private int ticksInAir;
	public double accelerationX;
	public double accelerationY;
	public double accelerationZ;

	public EntitySugarBullet(World par1World, double par2, double par4,
			double par6) {
		super(par1World, par2, par4, par6);
	}

	public EntitySugarBullet(World par1World,
			EntityLivingBase par2EntityLivingBase, double par3, double par5,
			double par7) {
		super(par1World);
		this.shootingEntity = par2EntityLivingBase;
		this.setSize(1.0F, 1.0F);
		this.setLocationAndAngles(par2EntityLivingBase.posX,
				par2EntityLivingBase.posY, par2EntityLivingBase.posZ,
				par2EntityLivingBase.rotationYaw,
				par2EntityLivingBase.rotationPitch);
		this.setPosition(this.posX, this.posY, this.posZ);
		this.yOffset = 0.0F;
		this.motionX = this.motionY = this.motionZ = 0.0D;
		par3 += this.rand.nextGaussian() * 0.4D;
		par5 += this.rand.nextGaussian() * 0.4D;
		par7 += this.rand.nextGaussian() * 0.4D;
		double d3 = MathHelper.sqrt_double(par3 * par3 + par5 * par5 + par7
				* par7);
		this.accelerationX = par3 / d3 * 0.1D;
		this.accelerationY = par5 / d3 * 0.1D;
		this.accelerationZ = par7 / d3 * 0.1D;
		this.accelerationZ = par7 / d3 * 0.1D;
	}

	public EntitySugarBullet(World par1World,
			EntityLivingBase par2EntityLivingBase) {
		super(par1World, par2EntityLivingBase);
	}

	public EntitySugarBullet(World par1World) {
		super(par1World);
		this.setSize(1.0F, 1.0F);
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
						this.posY, this.posZ, new ItemStack(Item.sugar));
				double motionX = this.rand.nextGaussian() * 2 - 1;
				double motionY = this.rand.nextGaussian();
				double motionZ = this.rand.nextGaussian() * 2 - 1;
				entityItem.setVelocity(motionX, motionY, motionZ);
				this.worldObj.spawnEntityInWorld(entityItem);
			}
		}
	}

	protected float getMotionFactor() {
		return 0.95F;
	}

	@Override
	public void onUpdate() {
		if (!this.worldObj.isRemote
				&& (this.shootingEntity != null && this.shootingEntity.isDead || !this.worldObj
						.blockExists((int) this.posX, (int) this.posY,
								(int) this.posZ))) {
			this.setDead();
		} else {
			super.onUpdate();

			if (this.inGround) {
				int i = this.worldObj.getBlockId(this.xTile, this.yTile,
						this.zTile);

				if (i == this.inTile) {
					++this.ticksAlive;

					if (this.ticksAlive == 600) {
						this.setDead();
					}

					return;
				}

				this.inGround = false;
				this.motionX *= (this.rand.nextFloat() * 0.2F);
				this.motionY *= (this.rand.nextFloat() * 0.2F);
				this.motionZ *= (this.rand.nextFloat() * 0.2F);
				this.ticksAlive = 0;
				this.ticksInAir = 0;
			} else {
				++this.ticksInAir;
			}

			Vec3 vec3 = this.worldObj.getWorldVec3Pool().getVecFromPool(
					this.posX, this.posY, this.posZ);
			Vec3 vec31 = this.worldObj.getWorldVec3Pool().getVecFromPool(
					this.posX + this.motionX, this.posY + this.motionY,
					this.posZ + this.motionZ);
			MovingObjectPosition movingobjectposition = this.worldObj.clip(
					vec3, vec31);
			vec3 = this.worldObj.getWorldVec3Pool().getVecFromPool(this.posX,
					this.posY, this.posZ);
			vec31 = this.worldObj.getWorldVec3Pool().getVecFromPool(
					this.posX + this.motionX, this.posY + this.motionY,
					this.posZ + this.motionZ);

			if (movingobjectposition != null) {
				vec31 = this.worldObj.getWorldVec3Pool().getVecFromPool(
						movingobjectposition.hitVec.xCoord,
						movingobjectposition.hitVec.yCoord,
						movingobjectposition.hitVec.zCoord);
			}

			Entity entity = null;
			List list = this.worldObj.getEntitiesWithinAABBExcludingEntity(
					this,
					this.boundingBox.addCoord(this.motionX, this.motionY,
							this.motionZ).expand(1.0D, 1.0D, 1.0D));
			double d0 = 0.0D;

			for (int j = 0; j < list.size(); ++j) {
				Entity entity1 = (Entity) list.get(j);

				if (entity1.canBeCollidedWith()
						&& (!entity1.isEntityEqual(this.shootingEntity) || this.ticksInAir >= 25)) {
					float f = 0.3F;
					AxisAlignedBB axisalignedbb = entity1.boundingBox.expand(f,
							f, f);
					MovingObjectPosition movingobjectposition1 = axisalignedbb
							.calculateIntercept(vec3, vec31);

					if (movingobjectposition1 != null) {
						double d1 = vec3
								.distanceTo(movingobjectposition1.hitVec);

						if (d1 < d0 || d0 == 0.0D) {
							entity = entity1;
							d0 = d1;
						}
					}
				}
			}

			if (entity != null) {
				movingobjectposition = new MovingObjectPosition(entity);
			}

			if (movingobjectposition != null) {
				this.onImpact(movingobjectposition);
			}

			this.posX += this.motionX;
			this.posY += this.motionY;
			this.posZ += this.motionZ;
			float f1 = MathHelper.sqrt_double(this.motionX * this.motionX
					+ this.motionZ * this.motionZ);
			this.rotationYaw = (float) (Math.atan2(this.motionZ, this.motionX) * 180.0D / Math.PI) + 90.0F;

			for (this.rotationPitch = (float) (Math.atan2(f1, this.motionY) * 180.0D / Math.PI) - 90.0F; this.rotationPitch
					- this.prevRotationPitch < -180.0F; this.prevRotationPitch -= 360.0F) {
				;
			}

			while (this.rotationPitch - this.prevRotationPitch >= 180.0F) {
				this.prevRotationPitch += 360.0F;
			}

			while (this.rotationYaw - this.prevRotationYaw < -180.0F) {
				this.prevRotationYaw -= 360.0F;
			}

			while (this.rotationYaw - this.prevRotationYaw >= 180.0F) {
				this.prevRotationYaw += 360.0F;
			}

			this.rotationPitch = this.prevRotationPitch
					+ (this.rotationPitch - this.prevRotationPitch) * 0.2F;
			this.rotationYaw = this.prevRotationYaw
					+ (this.rotationYaw - this.prevRotationYaw) * 0.2F;
			float f2 = this.getMotionFactor();

			if (this.isInWater()) {
				for (int k = 0; k < 4; ++k) {
					float f3 = 0.25F;
					this.worldObj.spawnParticle("bubble", this.posX
							- this.motionX * f3, this.posY - this.motionY * f3,
							this.posZ - this.motionZ * f3, this.motionX,
							this.motionY, this.motionZ);
				}

				f2 = 0.8F;
			}

			this.motionX += this.accelerationX;
			this.motionY += this.accelerationY;
			this.motionZ += this.accelerationZ;
			this.motionX *= f2;
			this.motionY *= f2;
			this.motionZ *= f2;
			this.worldObj.spawnParticle("smoke", this.posX, this.posY + 0.5D,
					this.posZ, 0.0D, 0.0D, 0.0D);
			this.setPosition(this.posX, this.posY, this.posZ);
		}
	}

	@Override
	protected float getGravityVelocity() {
		return 0.02F;
	}

	@Override
	public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
		par1NBTTagCompound.setShort("xTile", (short) this.xTile);
		par1NBTTagCompound.setShort("yTile", (short) this.yTile);
		par1NBTTagCompound.setShort("zTile", (short) this.zTile);
		par1NBTTagCompound.setByte("inTile", (byte) this.inTile);
		par1NBTTagCompound.setInteger("ticksAlive", this.ticksAlive);
		par1NBTTagCompound.setInteger("ticksInAir", this.ticksInAir);
		par1NBTTagCompound.setByte("inGround", (byte) (this.inGround ? 1 : 0));
		par1NBTTagCompound.setTag(
				"direction",
				this.newDoubleNBTList(new double[] { this.motionX,
						this.motionY, this.motionZ }));
	}

	@Override
	public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
		this.xTile = par1NBTTagCompound.getShort("xTile");
		this.yTile = par1NBTTagCompound.getShort("yTile");
		this.zTile = par1NBTTagCompound.getShort("zTile");
		this.inTile = par1NBTTagCompound.getByte("inTile") & 255;
		this.ticksAlive = par1NBTTagCompound.getInteger("ticksAlive");
		this.ticksInAir = par1NBTTagCompound.getInteger("ticksInAir");
		this.inGround = par1NBTTagCompound.getByte("inGround") == 1;

		if (par1NBTTagCompound.hasKey("direction")) {
			NBTTagList nbttaglist = par1NBTTagCompound.getTagList("direction");
			this.motionX = ((NBTTagDouble) nbttaglist.tagAt(0)).data;
			this.motionY = ((NBTTagDouble) nbttaglist.tagAt(1)).data;
			this.motionZ = ((NBTTagDouble) nbttaglist.tagAt(2)).data;
		} else {
			this.setDead();
		}
	}

}
