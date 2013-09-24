package cookieverse;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
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
		}
	}
}
