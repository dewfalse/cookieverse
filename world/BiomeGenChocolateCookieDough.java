package cookieverse.world;

import net.minecraft.block.Block;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenSand;
import cookieverse.block.Blocks;

public class BiomeGenChocolateCookieDough extends BiomeGenCookieverse {

	public BiomeGenChocolateCookieDough(int par1) {
		super(par1);
        mainBlock = Blocks.chocolateCookieDough;
		this.theBiomeDecorator.sandGen = new WorldGenSand(Blocks.cookieDough, 7);
		this.theBiomeDecorator.gravelAsSandGen = new WorldGenSand(Blocks.whiteChocolateCookieDough, 6);
		this.theBiomeDecorator.dirtGen = new WorldGenMinable(Blocks.blackChocolateCookie, 32, mainBlock);
		this.theBiomeDecorator.gravelGen = new WorldGenMinable(Blocks.cookie, 32, mainBlock);
		this.theBiomeDecorator.coalGen = new WorldGenMinable(Blocks.cookieDough, 16, mainBlock);
		this.theBiomeDecorator.ironGen = new WorldGenMinable(Blocks.oreChocolate, 8, mainBlock);
		this.theBiomeDecorator.goldGen = new WorldGenMinable(Blocks.oreWhiteChocolate, 8, mainBlock);
		this.theBiomeDecorator.redstoneGen = new WorldGenMinable(Blocks.oreBlackChocolate, 7, mainBlock);
		this.theBiomeDecorator.diamondGen = new WorldGenMinable(Blocks.gold_block, 3, mainBlock);
		this.theBiomeDecorator.lapisGen = new WorldGenMinable(Blocks.whiteChocolateCookie, 6, mainBlock);
		this.worldGeneratorTrees = new WorldGeneratorCookieTrees(false, Blocks.chocolateCookie);
	}

}
