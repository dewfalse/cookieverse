package cookieverse;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

public class EnchantmentExoticNuts extends Enchantment {

	public EnchantmentExoticNuts(int par1, int par2,
			EnumEnchantmentType par3EnumEnchantmentType) {
		super(par1, par2, par3EnumEnchantmentType);

		setName("Exotic");
	}

	@Override
	public String getTranslatedName(int par1) {
		return "Exotic" + " " + StatCollector.translateToLocal("enchantment.level." + par1);
	}

	@Override
	public int getMinEnchantability(int par1) {
		return 30;
	}

	@Override
	public int getMaxEnchantability(int par1) {
		return 30;
	}

	@Override
	public int getMaxLevel() {
		return 1;
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		return stack.getItem() == Items.strangeNuts && !stack.isItemEnchanted();
	}

	@Override
	public boolean canApplyTogether(Enchantment par1Enchantment) {
		return false;
	}

	@Override
	public boolean canApply(ItemStack par1ItemStack) {
		return par1ItemStack.getItem() == Items.strangeNuts && !par1ItemStack.isItemEnchanted();
	}
}
