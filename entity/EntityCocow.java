package cookieverse.entity;

import java.util.ArrayList;

import cookieverse.Items;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;
import cookieverse.block.Blocks;

public class EntityCocow extends EntityCow implements IShearable {

	public EntityCocow(World par1World) {
		super(par1World);
		this.setSize(0.9F, 1.3F);
	}

	@Override
	public EntityCocow createChild(EntityAgeable entityageable) {
		return new EntityCocow(this.worldObj);
	}

	@Override
	public ArrayList<ItemStack> onSheared(ItemStack item, IBlockAccess world, int X, int Y, int Z, int fortune) {
		setDead();
		EntityCow entitycow = new EntityCow(worldObj);
		entitycow.setLocationAndAngles(posX, posY, posZ, rotationYaw, rotationPitch);
		entitycow.setHealth(getHealth());
		entitycow.renderYawOffset = renderYawOffset;
		worldObj.spawnEntityInWorld(entitycow);
		worldObj.spawnParticle("largeexplode", posX, posY
				+ (height / 2.0F), posZ, 0.0D, 0.0D, 0.0D);

		ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
		for (int x = 0; x < 5; x++) {
			ret.add(new ItemStack(Items.dye, 1, 3));
		}
		return ret;
	}

	@Override
	public boolean isShearable(ItemStack item, IBlockAccess world, int x, int y, int z) {
		return getGrowingAge() >= 0;
	}

	@Override
	public boolean getCanSpawnHere()
    {
        int i = MathHelper.floor_double(this.posX);
        int j = MathHelper.floor_double(this.boundingBox.minY);
        int k = MathHelper.floor_double(this.posZ);
        Block block = this.worldObj.getBlock(i, j - 1, k);
        if(block == Blocks.grass || block == Blocks.cookieDough || block == Blocks.chocolateCookieDough || block == Blocks.whiteChocolateCookieDough || block == Blocks.blackChocolateCookieDough) {
            return  this.worldObj.getFullBlockLightValue(i, j, k) > 8 && super.getCanSpawnHere();
        }
        return false;
    }
}
