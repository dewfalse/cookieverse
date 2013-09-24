package cookieverse.entity;

import net.minecraft.client.model.ModelCow;
import cookieverse.Cookieverse;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Entities {


	public static void init() {
		LanguageRegistry.instance().addStringLocalization("entity.Cocow.name", "en_US", "Cocow");
		LanguageRegistry.instance().addStringLocalization("entity.Sughast.name", "en_US", "Sughast");
		LanguageRegistry.instance().addStringLocalization("entity.Milkreeper.name", "en_US", "Milkreeper");
		LanguageRegistry.instance().addStringLocalization("entity.Cocow.name", "ja_JP", "カカウ");
		LanguageRegistry.instance().addStringLocalization("entity.Sughast.name", "ja_JP", "シュガスト");
		LanguageRegistry.instance().addStringLocalization("entity.Milkreeper.name", "ja_JP", "ミルクリーパー");
		EntityRegistry.registerModEntity(EntityCocow.class, "Cocow", 0, Cookieverse.instance, 64, 2, true);
		EntityRegistry.registerModEntity(EntitySughast.class, "Sughast", 1, Cookieverse.instance, 64, 2, true);
		EntityRegistry.registerModEntity(EntityMilkreeper.class, "Milkreeper", 2, Cookieverse.instance, 64, 2, true);
//		EntityRegistry.registerGlobalEntityID(EntityCocow.class, "Cocow", 108, 0xCCCCCC, 0xFFFFFF);
//		EntityRegistry.registerGlobalEntityID(EntitySughast.class, "Sughast", 109, 0xCCCCCC, 0xFFFFFF);
//		EntityRegistry.registerGlobalEntityID(EntityMilkreeper.class, "Milkreeper", 110, 0xCCCCCC, 0xFFFFFF);
//		EntityRegistry.registerGlobalEntityID(EntitySugarBullet.class, "SugarBullet", 111);
		EntityRegistry.registerModEntity(EntitySugarBullet.class, "SugarBullet", 3, Cookieverse.instance, 80, 1, true);
	}

	@SideOnly(Side.CLIENT)
	public static void register() {
		RenderingRegistry.registerEntityRenderingHandler(EntityCocow.class, new RenderCocow(new ModelCow(), 0.7F));
		RenderingRegistry.registerEntityRenderingHandler(EntityMilkreeper.class, new RenderMilkreeper());
		RenderingRegistry.registerEntityRenderingHandler(EntitySugarBullet.class, new RenderSugarBullet());
	}

}
