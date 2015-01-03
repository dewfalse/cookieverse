package cookieverse;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemStrangeNuts extends ItemFood {

	public ItemStrangeNuts(int par2, float par3, boolean par4) {
		super(par2, par3, par4);
	}

	public ItemStrangeNuts(int par1, int par2, boolean par3) {
		super(par1, par2, par3);
	}

	@Override
	public int getItemEnchantability() {
		return 1;
	}

	@Override
	public boolean isItemTool(ItemStack par1ItemStack) {
		return true;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public EnumRarity getRarity(ItemStack par1ItemStack) {
		if(par1ItemStack.isItemEnchanted()) {
			return EnumRarity.epic;
		}
		return super.getRarity(par1ItemStack);
	}

	@Override
	public String getItemStackDisplayName(ItemStack par1ItemStack) {
		if(par1ItemStack.isItemEnchanted()) {
			return super.getItemStackDisplayName(new ItemStack(Items.exoticNuts));
		}
		return super.getItemStackDisplayName(par1ItemStack);
	}

	@Override
	public ItemStack onEaten(ItemStack par1ItemStack, World par2World,
			EntityPlayer par3EntityPlayer) {
		ItemStack itemStack = super.onEaten(par1ItemStack, par2World, par3EntityPlayer);
		if(par1ItemStack.isItemEnchanted()) {
			CookieverseTeleporter.transferEntityToWorld(par3EntityPlayer, par2World.provider.dimensionId == Config.dimensionID ? 0 : Config.dimensionID);
		}
		return itemStack;
	}

}
