package cookieverse.world;

import net.minecraft.block.Block;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenSand;
import cookieverse.block.Blocks;

public class BiomeGenWhiteChocolateCookieDough extends BiomeGenCookieverse {

	public BiomeGenWhiteChocolateCookieDough(int par1) {
		super(par1);
        mainBlock = Blocks.whiteChocolateCookieDough;
		this.theBiomeDecorator.sandGen = new WorldGenSand(Blocks.cookieDough, 7);
		this.theBiomeDecorator.gravelAsSandGen = new WorldGenSand(Blocks.blackChocolateCookieDough, 6);
		this.theBiomeDecorator.dirtGen = new WorldGenMinable(Blocks.whiteChocolateCookie, 32, mainBlock);
		this.theBiomeDecorator.gravelGen = new WorldGenMinable(Blocks.cookie, 32, mainBlock);
		this.theBiomeDecorator.coalGen = new WorldGenMinable(Blocks.chocolateCookieDough, 16, mainBlock);
		this.theBiomeDecorator.ironGen = new WorldGenMinable(Blocks.oreChocolate, 8, mainBlock);
		this.theBiomeDecorator.goldGen = new WorldGenMinable(Blocks.oreBlackChocolate, 8, mainBlock);
		this.theBiomeDecorator.redstoneGen = new WorldGenMinable(Blocks.oreWhiteChocolate, 7, mainBlock);
		this.theBiomeDecorator.diamondGen = new WorldGenMinable(Blocks.diamond_block, 3, mainBlock);
		this.theBiomeDecorator.lapisGen = new WorldGenMinable(Blocks.blackChocolateCookie, 6, mainBlock);
		this.worldGeneratorTrees = new WorldGeneratorCookieTrees(false, Blocks.whiteChocolateCookie);
	}

}
