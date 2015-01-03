package cookieverse.block;

import cookieverse.Items;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class BlockCookieCrops extends BlockCrops {

	private IIcon[] iconArray;

	public BlockCookieCrops() {
		super();
		disableStats();
	}


	@Override
	protected Item func_149866_i() {
		return Items.cookieSeeds;
	}

	@Override
	protected Item func_149865_P() {
		return Items.cookie;
	}

	@Override
	public IIcon getIcon(int par1, int par2) {
		if (par2 < 0 || par2 > 7) {
			par2 = 7;
		}

		return this.iconArray[par2];
	}

	@Override
	public void registerBlockIcons(IIconRegister par1IconRegister) {
		this.iconArray = new IIcon[8];

		for (int i = 0; i < this.iconArray.length; ++i) {
			this.iconArray[i] = par1IconRegister.registerIcon("cookieverse:crops_" + i);
		}
	}
}
