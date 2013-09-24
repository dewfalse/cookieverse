package cookieverse.entity;

import net.minecraft.block.Block;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelQuadruped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderCocow extends RenderLiving {

	private static final ResourceLocation TEXTURE = new ResourceLocation(
			"cookieverse", "textures/entity/cocow.png");

	public RenderCocow(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
	}

	public void renderLivingCocow(EntityCocow par1EntityCocow, double par2,
			double par4, double par6, float par8, float par9) {
		super.doRenderLiving(par1EntityCocow, par2, par4, par6, par8, par9);
	}

	protected ResourceLocation getTexture(EntityCocow par1EntityCocow) {
		return TEXTURE;
	}

	protected void renderCocowEquippedItems(EntityCocow par1EntityCocow,
			float par2) {
		super.renderEquippedItems(par1EntityCocow, par2);

		if (!par1EntityCocow.isChild()) {
			this.func_110776_a(TextureMap.field_110575_b);
			GL11.glEnable(GL11.GL_CULL_FACE);
			GL11.glPushMatrix();
			GL11.glScalef(1.0F, -1.0F, 1.0F);
			GL11.glTranslatef(0.2F, 0.4F, 0.5F);
			GL11.glRotatef(42.0F, 0.0F, 1.0F, 0.0F);
			this.renderBlocks.renderBlockAsItem(Block.cocoaPlant, 0, 1.0F);
			GL11.glTranslatef(0.1F, 0.0F, -0.6F);
			GL11.glRotatef(42.0F, 0.0F, 1.0F, 0.0F);
			this.renderBlocks.renderBlockAsItem(Block.cocoaPlant, 0, 1.0F);
			GL11.glPopMatrix();
			GL11.glPushMatrix();
			((ModelQuadruped) this.mainModel).head.postRender(0.0625F);
			GL11.glScalef(1.0F, -1.0F, 1.0F);
			GL11.glTranslatef(0.0F, 0.75F, -0.2F);
			GL11.glRotatef(12.0F, 0.0F, 1.0F, 0.0F);
			this.renderBlocks.renderBlockAsItem(Block.cocoaPlant, 0, 1.0F);
			GL11.glPopMatrix();
			GL11.glDisable(GL11.GL_CULL_FACE);
		}
	}

	@Override
	public void doRenderLiving(EntityLiving par1EntityLiving, double par2,
			double par4, double par6, float par8, float par9) {
		this.renderLivingCocow((EntityCocow) par1EntityLiving, par2, par4,
				par6, par8, par9);
	}

	@Override
	protected void renderEquippedItems(EntityLivingBase par1EntityLivingBase,
			float par2) {
		this.renderCocowEquippedItems((EntityCocow) par1EntityLivingBase, par2);
	}

	@Override
	public void renderPlayer(EntityLivingBase par1EntityLivingBase,
			double par2, double par4, double par6, float par8, float par9) {
		this.renderLivingCocow((EntityCocow) par1EntityLivingBase, par2, par4,
				par6, par8, par9);
	}

	@Override
	protected ResourceLocation func_110775_a(Entity par1Entity) {
		return this.getTexture((EntityCocow) par1Entity);
	}

	@Override
	public void doRender(Entity par1Entity, double par2, double par4,
			double par6, float par8, float par9) {
		this.renderLivingCocow((EntityCocow) par1Entity, par2, par4, par6,
				par8, par9);
	}
}
