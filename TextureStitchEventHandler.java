package cookieverse;

import cookieverse.block.Blocks;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.client.event.TextureStitchEvent;

/**
 * Created by dew on 14/07/12.
 */
public class TextureStitchEventHandler {
    @SubscribeEvent
    public void onTextureStitch(TextureStitchEvent.Post event) {
        if (Config.useOtherMilk == false) {
            Blocks.milkFluid.setIcons(Blocks.milkStill.getIcon(0, 0), Blocks.milkStill.getIcon(2, 0));
        }
        Blocks.hotChocolateFluid.setIcons(Blocks.hotChocolateStill.getIcon(0, 0), Blocks.hotChocolateStill.getIcon(2, 0));
    }
}
