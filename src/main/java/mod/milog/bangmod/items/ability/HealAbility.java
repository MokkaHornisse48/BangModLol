package mod.milog.bangmod.items.ability;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class HealAbility extends SwordAbility{
    public HealAbility() {
        super("Heal");
    }

    @Override
    public void onExecuteUse(World world, PlayerEntity player, Hand hand) {
        //System.out.println("Nö");
        if(player.getMaxHealth()>= player.getHealth()) {
            player.heal(1);
            player.getHeldItem(hand).damageItem(10, player, (playerEntity) -> {
                playerEntity.sendBreakAnimation(hand);
            });
        }
    }

    @Override
    public boolean beforeHit(ItemStack stack, PlayerEntity player, Entity target){
        if (target instanceof LivingEntity) {
            LivingEntity livingTarget = ((LivingEntity)target);
            if(livingTarget.getMaxHealth()>=livingTarget.getHealth()) {
                livingTarget.heal(1);
                stack.damageItem(10, player, (playerEntity) -> {
                    playerEntity.sendBreakAnimation(Hand.MAIN_HAND);
                });
            }
        }
        return false;
    }
}
