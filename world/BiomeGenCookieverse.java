package cookieverse.world;

import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import cookieverse.entity.EntityCocow;
import cookieverse.entity.EntityMilkreeper;
import cookieverse.entity.EntitySughast;

public class BiomeGenCookieverse extends BiomeGenBase {

	public int mainBlockID;
	public BiomeGenCookieverse(int par1) {
		super(par1);
		this.spawnableMonsterList.add(new SpawnListEntry(EntityMilkreeper.class, 10, 4, 4));
		this.spawnableMonsterList.add(new SpawnListEntry(EntitySughast.class, 3, 3, 4));
		this.spawnableCreatureList.clear();
		this.spawnableCreatureList.add(new SpawnListEntry(EntityCocow.class, 8, 4, 4));
		this.spawnableCreatureList.add(new SpawnListEntry(EntitySheep.class, 12, 4, 4));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityPig.class, 10, 4, 4));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityChicken.class, 10, 4, 4));
	}

}
