package cookieverse.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelCreeper;
import net.minecraft.client.renderer.entity.RenderCreeper;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

public class RenderMilkreeper extends RenderCreeper {
	private static final ResourceLocation field_110831_a = new ResourceLocation(
			"cookieverse", "textures/entity/milkreeper_armor.png");
	private static final ResourceLocation field_110830_f = new ResourceLocation(
			"cookieverse", "textures/entity/milkreeper.png");
	private final ModelBase creeperModel = new ModelCreeper(2.0F);

	public RenderMilkreeper() {
		super();
	}

	@Override
	protected int shouldRenderPass(EntityCreeper par1EntityCreeper,
			int par2, float par3) {
		if (par1EntityCreeper.getPowered()) {
			if (par1EntityCreeper.isInvisible()) {
				GL11.glDepthMask(false);
			} else {
				GL11.glDepthMask(true);
			}

			if (par2 == 1) {
				float f1 = par1EntityCreeper.ticksExisted + par3;
				this.bindTexture(field_110831_a);
				GL11.glMatrixMode(GL11.GL_TEXTURE);
				GL11.glLoadIdentity();
				float f2 = f1 * 0.01F;
				float f3 = f1 * 0.01F;
				GL11.glTranslatef(f2, f3, 0.0F);
				this.setRenderPassModel(this.creeperModel);
				GL11.glMatrixMode(GL11.GL_MODELVIEW);
				GL11.glEnable(GL11.GL_BLEND);
				float f4 = 0.5F;
				GL11.glColor4f(f4, f4, f4, 1.0F);
				GL11.glDisable(GL11.GL_LIGHTING);
				GL11.glBlendFunc(GL11.GL_ONE, GL11.GL_ONE);
				return 1;
			}

			if (par2 == 2) {
				GL11.glMatrixMode(GL11.GL_TEXTURE);
				GL11.glLoadIdentity();
				GL11.glMatrixMode(GL11.GL_MODELVIEW);
				GL11.glEnable(GL11.GL_LIGHTING);
				GL11.glDisable(GL11.GL_BLEND);
			}
		}

		return -1;
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityCreeper par1EntityCreeper) {
		return field_110830_f;
	}

}
