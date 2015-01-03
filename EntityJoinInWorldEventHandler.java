package cookieverse;

import cookieverse.block.Blocks;
import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

public class EntityJoinInWorldEventHandler {

	@SubscribeEvent
	public void onEntityJoinWorldEvent(EntityJoinWorldEvent event) {
		if(event.isCanceled()) {
			return;
		}
		if(event.getResult() != Event.Result.DEFAULT) {
			return;
		}
		if(event.entity instanceof EntityPlayerMP) {
			event.entity.timeUntilPortal = 300;
			event.setResult(Event.Result.ALLOW);
			return;
		}
		if(event.entity instanceof EntityLivingBase) {
			event.entity.timeUntilPortal = 300;
			event.setResult(Event.Result.ALLOW);
			return;
		}
		if(event.entity instanceof EntityItem) {
			if(event.world.isRemote) {
				return;
			}
			ItemStack itemStack = ((EntityItem)event.entity).getEntityItem();
			if(itemStack.getItem() == Items.dye && itemStack.getItemDamage() == 3) {
				for(int i = -1; i <= 1; ++i) {
					for(int j = -1; j <= 1; ++j) {
						for(int k = -1; k <= 1; ++k) {
							int x = (int)(event.entity.posX + i);
							int y = (int)(event.entity.posY + j);
							int z = (int)(event.entity.posZ + k);
							if(event.world.getBlock(x, y, z) == Blocks.planks && event.world.getBlockMetadata(x, y, z) == 3) {
								if(event.world.rand.nextInt(100) == 0) {
									((EntityItem)event.entity).setEntityItemStack(new ItemStack(Items.strangeNuts, itemStack.stackSize));
								}
								event.setResult(Event.Result.ALLOW);
								return;
							}
						}
					}
				}
			}
		}
	}
}
