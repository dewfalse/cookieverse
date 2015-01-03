package cookieverse;

import cookieverse.block.Blocks;
import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.event.terraingen.BiomeEvent;
import cookieverse.world.WorldChunkManagerCookieverse;

public class BiomeEventHandler {

	@SubscribeEvent
	public void getVillageBlockID(BiomeEvent.GetVillageBlockID event) {
		if (event == null) {
			return;
		}
		if(event.biome == null) {
			return;
		}
		boolean found = false;
		for(BiomeGenBase biome : WorldChunkManagerCookieverse.cookieverseBiomeList) {
			if(event.biome.biomeID == biome.biomeID) {
				found = true;
				break;
			}
		}
		if(found == false) {
			return;
		}

		if (event.original == Blocks.planks) {
			event.replacement = Blocks.blackChocolateCookie;
        } else if (event.original == Blocks.log) {
            event.replacement = Blocks.blackChocolateCookie;
        } else if (event.original == Blocks.log2) {
            event.replacement = Blocks.blackChocolateCookie;
        } else if (event.original == Blocks.cobblestone) {
            event.replacement = Blocks.cookie;
		} else if (event.original == Blocks.planks) {
			event.replacement = Blocks.chocolateCookie;
		} else if (event.original == Blocks.oak_stairs) {
			event.replacement = Blocks.whiteChocolateCookie;
		} else if (event.original == Blocks.stone_stairs) {
			event.replacement = Blocks.whiteChocolateCookie;
		} else if (event.original == Blocks.gravel) {
			event.replacement = Blocks.cookieDough;
		} else if (event.original == Blocks.dirt) {
			event.replacement = Blocks.blackChocolateCookieDough;
		} else if (event.original == Blocks.furnace) {
			return;
		} else if (event.original == Blocks.carrots) {
			event.replacement = Blocks.cookieCrops;
		} else if (event.original == Blocks.potatoes) {
			event.replacement = Blocks.cookieCrops;
		} else if (event.original == Blocks.wheat) {
			event.replacement = Blocks.cookieCrops;
		} else if (event.original == Blocks.glass_pane) {
			return;
		} else if (event.original == Blocks.double_stone_slab) {
			event.replacement = Blocks.blackChocolateCookie;
		} else if (event.original == Blocks.stone_slab) {
			event.replacement = Blocks.blackChocolateCookie;
		} else if (event.original == Blocks.fence) {
			return;
		} else if (event.original == Blocks.bookshelf) {
			return;
        } else if (event.original == Blocks.flowing_water) {
            event.replacement = Blocks.milkMoving;
        } else if (event.original == Blocks.water) {
            event.replacement = Blocks.milkStill;
		} else if (event.original == Blocks.farmland) {
			event.replacement = Blocks.cookieDough;
		} else {
			return;
		}

		event.setResult(Event.Result.DENY);

	}

}
