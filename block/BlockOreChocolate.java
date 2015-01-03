package cookieverse.block;

import java.util.Random;

import cookieverse.Items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockOreChocolate extends Block {

	public BlockOreChocolate(Material par2Material) {
		super(par2Material);
	}

	@Override
	public Item getItemDropped(int par1, Random par2Random, int par3) {
		if(this == Blocks.oreChocolate) {
			return Items.itemChocolate;
		}
		if(this == Blocks.oreBlackChocolate) {
			return Items.itemBlackChocolate;
		}
		if(this == Blocks.oreWhiteChocolate) {
			return Items.itemWhiteChocolate;
		}
		return Item.getItemFromBlock(this);
	}

	@Override
	public void dropBlockAsItemWithChance(World par1World, int par2, int par3,
			int par4, int par5, float par6, int par7) {
		if(this.getItemDropped(par5, par1World.rand, par7) != Item.getItemFromBlock(this)) {
			int xp = MathHelper.getRandomIntegerInRange(par1World.rand, 2, 5);
			this.dropXpOnBlockBreak(par1World, par2, par3, par4, xp);
		}
	}

	@Override
	public int quantityDroppedWithBonus(int par1, Random par2Random) {
		if(par1 > 0 && Item.getItemFromBlock(this) != this.getItemDropped(0, par2Random, par1)) {
			int j = par2Random.nextInt(par1 + 2) - 1;

			if (j < 0) {
				j = 0;
			}

			return this.quantityDropped(par2Random) * (j + 1);
		} else {
			return this.quantityDropped(par2Random);
		}
	}

}
