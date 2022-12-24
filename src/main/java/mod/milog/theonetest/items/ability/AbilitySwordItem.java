package mod.milog.theonetest.items.ability;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class AbilitySwordItem extends SwordItem {

    private SwordAbility[] abilitys;

    public AbilitySwordItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Item.Properties builderIn,SwordAbility[] abilitys) {
        super(tier, attackDamageIn, attackSpeedIn, builderIn);
        this.abilitys = abilitys;
    }

    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {

        if(this.getAbility(stack).onExecuteHit(stack,target,attacker)) {
            return super.hitEntity(stack, target, attacker);
        }else {
            return false;
        }
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ActionResult<ItemStack> actionResult = super.onItemRightClick(worldIn, playerIn, handIn);


        this.getAbility(playerIn.getHeldItem(handIn)).onExecuteUse(worldIn, playerIn, handIn);
        return actionResult;
    }

    @Override
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, BlockState state, BlockPos pos, LivingEntity entityLiving) {
        return super.onBlockDestroyed(stack,worldIn,state,pos,entityLiving);
    }

    public SwordAbility[] getAbilitys(){
        return abilitys;
    }

    public int getCurrentAbility(ItemStack stack){
        CompoundNBT compoundnbt = stack.getOrCreateTag();
        return compoundnbt.getInt("CurrentAbility");
    }

    public void setCurrentAbility(ItemStack stack,int currentAbility){
        CompoundNBT compoundnbt = stack.getOrCreateTag();
        compoundnbt.putInt("CurrentAbility",currentAbility);
    }

    public SwordAbility getAbility(ItemStack stack){
        return abilitys[getCurrentAbility(stack)];
    }
}
