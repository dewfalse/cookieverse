package cookieverse.block;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ItemBlockCookieSapling extends ItemBlock {

	IIcon icon;

	public ItemBlockCookieSapling(Block par1) {
		super(par1);
	}

	@Override
	public void getSubItems(Item par1, CreativeTabs par2CreativeTabs,
			List par3List) {
		par3List.add(new ItemStack(par1, 1, 0));
	}

	@Override
	public IIcon getIconFromDamage(int par1) {
		return this.icon;
	}

	@Override
	public void registerIcons(IIconRegister par1IconRegister) {
		icon = par1IconRegister.registerIcon("cookieverse:cookieSapling");
	}

}
