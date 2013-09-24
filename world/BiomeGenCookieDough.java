package cookieverse.world;

import net.minecraft.block.Block;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenSand;
import cookieverse.block.Blocks;

public class BiomeGenCookieDough extends BiomeGenCookieverse {

	public BiomeGenCookieDough(int par1) {
		super(par1);
		mainBlockID = Blocks.cookieDough.blockID;
		this.theBiomeDecorator.sandGen = new WorldGenSand(7, Blocks.blackChocolateCookieDough.blockID);
		this.theBiomeDecorator.gravelAsSandGen = new WorldGenSand(6, Blocks.whiteChocolateCookieDough.blockID);
		this.theBiomeDecorator.dirtGen = new WorldGenMinable(Blocks.blackChocolateCookie.blockID, 32, mainBlockID);
		this.theBiomeDecorator.gravelGen = new WorldGenMinable(Blocks.cookie.blockID, 32, mainBlockID);
		this.theBiomeDecorator.coalGen = new WorldGenMinable(Blocks.chocolateCookieDough.blockID, 16, mainBlockID);
		this.theBiomeDecorator.ironGen = new WorldGenMinable(Blocks.oreChocolate.blockID, 8, mainBlockID);
		this.theBiomeDecorator.goldGen = new WorldGenMinable(Blocks.oreWhiteChocolate.blockID, 8, mainBlockID);
		this.theBiomeDecorator.redstoneGen = new WorldGenMinable(Blocks.oreBlackChocolate.blockID, 7, mainBlockID);
		this.theBiomeDecorator.diamondGen = new WorldGenMinable(Block.oreDiamond.blockID, 7, mainBlockID);
		this.theBiomeDecorator.lapisGen = new WorldGenMinable(Blocks.cookie.blockID, 6, mainBlockID);
		this.worldGeneratorTrees = new WorldGeneratorCookieTrees(false, Blocks.cookie.blockID);
	}

}
