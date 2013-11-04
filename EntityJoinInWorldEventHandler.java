package cookieverse;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

public class EntityJoinInWorldEventHandler {

	@ForgeSubscribe
	public void onEntityJoinWorldEvent(EntityJoinWorldEvent event) {
		if(event.isCanceled()) {
			return;
		}
		if(event.getResult() != Result.DEFAULT) {
			return;
		}
		if(event.entity instanceof EntityPlayerMP) {
			event.entity.timeUntilPortal = 300;
			event.setResult(Result.ALLOW);
			return;
		}
		if(event.entity instanceof EntityLivingBase) {
			event.entity.timeUntilPortal = 300;
			event.setResult(Result.ALLOW);
			return;
		}
		if(event.entity instanceof EntityItem) {
			if(event.world.isRemote) {
				return;
			}
			ItemStack itemStack = ((EntityItem)event.entity).getEntityItem();
			if(itemStack.itemID == Item.dyePowder.itemID && itemStack.getItemDamage() == 3) {
				for(int i = -1; i <= 1; ++i) {
					for(int j = -1; j <= 1; ++j) {
						for(int k = -1; k <= 1; ++k) {
							int x = (int)(event.entity.posX + i);
							int y = (int)(event.entity.posY + j);
							int z = (int)(event.entity.posZ + k);
							if(event.world.getBlockId(x, y, z) == Block.wood.blockID && event.world.getBlockMetadata(x, y, z) == 3) {
								if(event.world.rand.nextInt(100) == 0) {
									((EntityItem)event.entity).setEntityItemStack(new ItemStack(Items.strangeNuts, itemStack.stackSize));
								}
								event.setResult(Result.ALLOW);
								return;
							}
						}
					}
				}
			}
		}
	}
}
