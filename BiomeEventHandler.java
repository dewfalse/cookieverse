package cookieverse;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.terraingen.BiomeEvent;
import cookieverse.block.Blocks;
import cookieverse.world.WorldChunkManagerCookieverse;

public class BiomeEventHandler {

	@ForgeSubscribe
	public void getVillageBlockID(BiomeEvent.GetVillageBlockID event) {
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

		if (event.original == Block.wood.blockID) {
			event.replacement = Blocks.blackChocolateCookie.blockID;
		} else if (event.original == Block.cobblestone.blockID) {
			event.replacement = Blocks.cookie.blockID;
		} else if (event.original == Block.planks.blockID) {
			event.replacement = Blocks.chocolateCookie.blockID;
		} else if (event.original == Block.stairsWoodOak.blockID) {
			event.replacement = Blocks.whiteChocolateCookie.blockID;
		} else if (event.original == Block.stairsCobblestone.blockID) {
			event.replacement = Blocks.whiteChocolateCookie.blockID;
		} else if (event.original == Block.gravel.blockID) {
			event.replacement = Blocks.cookieDough.blockID;
		} else if (event.original == Block.dirt.blockID) {
			event.replacement = Blocks.blackChocolateCookieDough.blockID;
		} else if (event.original == Block.furnaceIdle.blockID) {
			return;
		} else if (event.original == Block.carrot.blockID) {
			event.replacement = Blocks.cookieCrops.blockID;
		} else if (event.original == Block.potato.blockID) {
			event.replacement = Blocks.cookieCrops.blockID;
		} else if (event.original == Block.crops.blockID) {
			event.replacement = Blocks.cookieCrops.blockID;
		} else if (event.original == Block.thinGlass.blockID) {
			return;
		} else if (event.original == Block.stoneDoubleSlab.blockID) {
			event.replacement = Blocks.blackChocolateCookie.blockID;
		} else if (event.original == Block.stoneSingleSlab.blockID) {
			event.replacement = Blocks.blackChocolateCookie.blockID;
		} else if (event.original == Block.fence.blockID) {
			return;
		} else if (event.original == Block.bookShelf.blockID) {
			return;
		} else if (event.original == Block.waterMoving.blockID) {
			event.replacement = Config.useOtherMilk ? Config.milkStillID
					: Config.milkMovingID;
		} else if (event.original == Block.tilledField.blockID) {
			event.replacement = Blocks.cookieDough.blockID;
		} else {
			return;
		}

		event.setResult(Result.DENY);

	}

}
