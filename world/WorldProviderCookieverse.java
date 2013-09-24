package cookieverse.world;

import cookieverse.Config;
import net.minecraft.block.Block;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.storage.DerivedWorldInfo;
import net.minecraft.world.storage.WorldInfo;
import cpw.mods.fml.common.ObfuscationReflectionHelper;

public class WorldProviderCookieverse extends WorldProvider {

	@Override
	public String getDimensionName() {
		return "Cookieverse";
	}

	@Override
	public IChunkProvider createChunkGenerator() {
		return new ChunkProviderCookieverse(worldObj, worldObj.getSeed(), true);
	}

	@Override
	public boolean canCoordinateBeSpawn(int par1, int par2) {
		int i = worldObj.getFirstUncoveredBlock(par1, par2);

		if (i == 0) {
			return false;
		} else {
			return Block.blocksList[i].blockMaterial.blocksMovement();
		}
	}

	@Override
	public boolean canRespawnHere() {
		return true;
	}

	@Override
	public float getCloudHeight() {
		return 128.0F;
	}

	@Override
	public boolean isSkyColored() {
		return true;
	}

	@Override
	public ChunkCoordinates getEntrancePortalLocation() {
		return new ChunkCoordinates(0, 64, 0);
	}

	@Override
	public int getAverageGroundLevel() {
		return 64;
	}

	@Override
	public void resetRainAndThunder() {
		super.resetRainAndThunder();

		if(this.worldObj.getGameRules().getGameRuleBooleanValue("doDaylightCycle")) {

			WorldInfo worldInfo = ObfuscationReflectionHelper.getPrivateValue(DerivedWorldInfo.class, (DerivedWorldInfo)worldObj.getWorldInfo(), "theWorldInfo", "field_76115_a");
			long i = worldInfo.getWorldTime() + 24000L;
			worldInfo.setWorldTime(i - i % 24000L);
		}
	}

	@Override
	protected void registerWorldChunkManager() {
		worldChunkMgr =new WorldChunkManagerCookieverse(worldObj);
		this.dimensionId = Config.dimensionID;
		hasNoSky = false;
	}

}
