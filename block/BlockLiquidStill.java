package cookieverse.block;

import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLiquidStill extends BlockLiquid {

    @SideOnly(Side.CLIENT)
    private IIcon[] theIcon;

    public BlockLiquidStill(Material par2Material) {
		super(par2Material);
	}

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        return p_149691_1_ != 0 && p_149691_1_ != 1 ? this.theIcon[1] : this.theIcon[0];
    }

    @Override
	@SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister)
    {
        if (this.blockMaterial == Material.lava)
        {
            this.theIcon = new IIcon[] {par1IconRegister.registerIcon("cookieverse:hot_chocolate_still"), par1IconRegister.registerIcon("cookieverse:hot_chocolate_flow")};
        }
        else
        {
            this.theIcon = new IIcon[] {par1IconRegister.registerIcon("cookieverse:milk_still"), par1IconRegister.registerIcon("cookieverse:milk_flow")};
        }
    }

    @SideOnly(Side.CLIENT)
    public static IIcon func_94424_b(String par0Str)
    {
        return par0Str == "cookieverse:milk_still" ? Blocks.milkMoving.getIcon(0, 0) : (par0Str == "cookieverse:milk_flow" ? Blocks.milkMoving.getIcon(2, 0) : (par0Str == "cookieverse:hot_chocolate_still" ? Blocks.hotChocolateMoving.getIcon(0, 0) : (par0Str == "cookieverse:hot_chocolate_flow" ? Blocks.hotChocolateMoving.getIcon(2, 0) : null)));
    }

	@Override
	public int getRenderBlockPass() {
		return 0;
	}
}
