package cookieverse;

import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import cookieverse.block.Blocks;

public class FillBucketEventHandler {

	@SubscribeEvent
	public void onFillBucketEvent(FillBucketEvent event) {
		if(event.isCanceled()) {
			return;
		}
		if(event.getResult() != Event.Result.DEFAULT) {
			return;
		}

		if(Config.useOtherMilk) {
			return;
		}
		if(event.target.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {
			Block block = event.world.getBlock(event.target.blockX, event.target.blockY, event.target.blockZ);
			int metadata = event.world.getBlockMetadata(event.target.blockX, event.target.blockY, event.target.blockZ);
			if( (block == Blocks.milkMoving || block == Blocks.milkStill) && metadata == 0) {
				event.world.setBlockToAir(event.target.blockX, event.target.blockY, event.target.blockZ);
				event.result = new ItemStack(Items.milk_bucket);
				event.setResult(Event.Result.ALLOW);
				return;
			}
			if( (block == Blocks.hotChocolateMoving || block == Blocks.hotChocolateStill) && metadata == 0) {
				event.world.setBlockToAir(event.target.blockX, event.target.blockY, event.target.blockZ);
				event.result = new ItemStack(Items.bucketHotChocolate);
				event.setResult(Event.Result.ALLOW);
				return;
			}
		}
	}
}
