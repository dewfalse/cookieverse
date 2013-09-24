package cookieverse;

import net.minecraftforge.common.MinecraftForge;
import cookieverse.block.Blocks;
import cookieverse.entity.Entities;

public class ClientProxy extends CommonProxy {

	@Override
	public void preInit() {
		MinecraftForge.EVENT_BUS.register(new Blocks());
	}

	@Override
	public void init() {
		Entities.register();
	}
}
