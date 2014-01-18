package cookieverse;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import cookieverse.block.Blocks;

public class FillBucketEventHandler {

	@ForgeSubscribe
	public void onFillBucketEvent(FillBucketEvent event) {
		if(event.isCanceled()) {
			return;
		}
		if(event.getResult() != Result.DEFAULT) {
			return;
		}

		if(Config.useOtherMilk) {
			return;
		}
		if(event.target.typeOfHit == EnumMovingObjectType.TILE) {
			int blockID = event.world.getBlockId(event.target.blockX, event.target.blockY, event.target.blockZ);
			int metadata = event.world.getBlockMetadata(event.target.blockX, event.target.blockY, event.target.blockZ);
			if( (blockID == Blocks.milkMoving.blockID || blockID == Blocks.milkStill.blockID) && metadata == 0) {
				event.world.setBlockToAir(event.target.blockX, event.target.blockY, event.target.blockZ);
				event.result = new ItemStack(Item.bucketMilk);
				event.setResult(Result.ALLOW);
				return;
			}
			if( (blockID == Blocks.hotChocolateMoving.blockID || blockID == Blocks.hotChocolateStill.blockID) && metadata == 0) {
				event.world.setBlockToAir(event.target.blockX, event.target.blockY, event.target.blockZ);
				event.result = new ItemStack(Items.bucketHotChocolate);
				event.setResult(Result.ALLOW);
				return;
			}
		}
	}
}
