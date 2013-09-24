package cookieverse.block;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class ItemBlockCookieSapling extends ItemBlock {

	private int _blockID;
	Icon icon;

	public ItemBlockCookieSapling(int par1) {
		super(par1);
		_blockID = par1 + 256;
	}

	@Override
	public void getSubItems(int par1, CreativeTabs par2CreativeTabs,
			List par3List) {
		par3List.add(new ItemStack(par1, 1, 0));
	}

	@Override
	public Icon getIconFromDamage(int par1) {
		return this.icon;
	}

	@Override
	public void registerIcons(IconRegister par1IconRegister) {
		icon = par1IconRegister.registerIcon("cookieverse:cookieSapling");
	}

}
