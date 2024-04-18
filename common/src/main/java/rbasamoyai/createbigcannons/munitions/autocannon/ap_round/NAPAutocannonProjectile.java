package rbasamoyai.createbigcannons.munitions.autocannon.ap_round;

import com.mojang.logging.LogUtils;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import rbasamoyai.createbigcannons.munitions.autocannon.AbstractAutocannonProjectile;
import rbasamoyai.createbigcannons.munitions.autocannon.AutocannonProjectileProperties;

public class NAPAutocannonProjectile extends AbstractAutocannonProjectile<AutocannonProjectileProperties> {

    public NAPAutocannonProjectile(EntityType<? extends NAPAutocannonProjectile> type, Level level) {
        super(type, level);
		System.out.println(this.getProperties().toString());
    }

}
