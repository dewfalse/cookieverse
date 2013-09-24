package cookieverse.block;

import cookieverse.Items;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;

public class BlockCookieCrops extends BlockCrops {

	private Icon[] iconArray;

	public BlockCookieCrops(int par1) {
		super(par1);
		disableStats();
	}


	@Override
	protected int getSeedItem() {
		return Items.cookieSeeds.itemID;
	}

	@Override
	protected int getCropItem() {
		return Item.cookie.itemID;
	}

	@Override
	public Icon getIcon(int par1, int par2) {
		if (par2 < 0 || par2 > 7) {
			par2 = 7;
		}

		return this.iconArray[par2];
	}

	@Override
	public void registerIcons(IconRegister par1IconRegister) {
		this.iconArray = new Icon[8];

		for (int i = 0; i < this.iconArray.length; ++i) {
			this.iconArray[i] = par1IconRegister.registerIcon("cookieverse:crops_" + i);
		}
	}
}
