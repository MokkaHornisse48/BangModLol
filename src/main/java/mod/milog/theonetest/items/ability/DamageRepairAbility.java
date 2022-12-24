package mod.milog.theonetest.items.ability;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;

public class DamageRepairAbility extends SwordAbility{
    public DamageRepairAbility() {
        super("DamageRepair");
    }

    @Override
    public boolean onExecuteHit(ItemStack item,LivingEntity target, LivingEntity attacker) {
        target.attackEntityFrom(DamageSource.MAGIC,item.getDamage()*0.5f);
        item.setDamage(item.getDamage()-50);
        return true;
    }
}
