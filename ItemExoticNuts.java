package cookieverse;

import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemExoticNuts extends ItemFood {

	public ItemExoticNuts(int par2, float par3, boolean par4) {
		super(par2, par3, par4);
	}

	public ItemExoticNuts(int par1, int par2, boolean par3) {
		super(par1, par2, par3);
	}

	@Override
	public boolean hasEffect(ItemStack par1ItemStack, int pass) {
		return true;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public EnumRarity getRarity(ItemStack par1ItemStack) {
		return EnumRarity.epic;
	}

	@Override
	public ItemStack onEaten(ItemStack par1ItemStack, World par2World,
			EntityPlayer par3EntityPlayer) {
		ItemStack itemStack = super.onEaten(par1ItemStack, par2World, par3EntityPlayer);
		CookieverseTeleporter.transferEntityToWorld(par3EntityPlayer, par2World.provider.dimensionId == Config.dimensionID ? 0 : Config.dimensionID);
		return itemStack;
	}

	@SubscribeEvent
	public void onEntity(ItemTossEvent event) {
		if(event.isCanceled()) {
			return;
		}
		if(event.getResult() != Event.Result.DEFAULT) {
			return;
		}
		if(event.player.dimension != 1) {
			return;
		}
		if(event.entityItem.worldObj.isRemote) {
			return;
		}
		if(event.entityItem.getEntityItem().getItem()== Items.dye && event.entityItem.getEntityItem().getItemDamage() == 3) {
			ItemStack itemStack = new ItemStack(Items.exoticNuts, event.entityItem.getEntityItem().stackSize);
			event.entityItem.setEntityItemStack(itemStack);
			event.setResult(Event.Result.ALLOW);
		}
	}

}
