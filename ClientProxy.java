package cookieverse;

import net.minecraftforge.common.MinecraftForge;
import cookieverse.block.Blocks;
import cookieverse.entity.Entities;
import cookieverse.world.Village;

public class ClientProxy extends CommonProxy {

	@Override
	public void preInit() {
		MinecraftForge.EVENT_BUS.register(new TextureStitchEventHandler());
	}
	@Override
	public void init() {
		Entities.register();
		Village.instance.resierVillagerSkin();
	}
}
