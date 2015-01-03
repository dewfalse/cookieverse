package cookieverse;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CookieCreativeTab extends CreativeTabs {

	public CookieCreativeTab(String label) {
		super(label);
	}

	public CookieCreativeTab(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@Override
	public ItemStack getIconItemStack() {
		return new ItemStack(Items.cookie);
	}

    @Override
    public Item getTabIconItem() {
        return Items.cookie;
    }

    @Override
	public String getTranslatedTabLabel() {
		return "Cookieverse";
	}

}
