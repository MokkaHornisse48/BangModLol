package mod.milog.theonetest.items.ability;

import net.minecraft.entity.CreatureAttribute;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class SwordAbility {

    private String name;

    public SwordAbility(String pname){
        this.name = pname;
    }

    public String getName(){
        return name;
    }

    public void onExecuteUse(World world, PlayerEntity player, Hand hand) {

    }

    public boolean onExecuteHit(ItemStack item, LivingEntity target, LivingEntity attacker) {
        return true;
    }

    public boolean beforeHit(ItemStack stack, PlayerEntity player, Entity target){
        return true;
    }

    public void onExecuteBreak(ItemStack item) {

    }
}
