package cookieverse.block;

import net.minecraft.block.BlockFlowing;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLiquidMoving extends BlockFlowing {

	public BlockLiquidMoving(int par1, Material par2Material) {
		super(par1, par2Material);
	}

    @Override
	@SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        if (this.blockMaterial == Material.lava)
        {
            this.theIcon = new Icon[] {par1IconRegister.registerIcon("cookieverse:hot_chocolate_still"), par1IconRegister.registerIcon("cookieverse:hot_chocolate_flow")};
        }
        else
        {
            this.theIcon = new Icon[] {par1IconRegister.registerIcon("cookieverse:milk_still"), par1IconRegister.registerIcon("cookieverse:milk_flow")};
        }
    }

    @SideOnly(Side.CLIENT)
    public static Icon func_94424_b(String par0Str)
    {
        return par0Str == "cookieverse:milk_still" ? Blocks.milkMoving.getIcon(0, 0) : (par0Str == "cookieverse:milk_flow" ? Blocks.milkMoving.getIcon(2, 0) : (par0Str == "cookieverse:hot_chocolate_still" ? Blocks.hotChocolateMoving.getIcon(0, 0) : (par0Str == "cookieverse:hot_chocolate_flow" ? Blocks.hotChocolateMoving.getIcon(2, 0) : null)));
    }

	@Override
	public int getRenderBlockPass() {
		return 0;
	}
}
