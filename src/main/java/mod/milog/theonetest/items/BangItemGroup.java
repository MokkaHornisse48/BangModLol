package mod.milog.theonetest.items;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class BangItemGroup extends ItemGroup {

    public static final BangItemGroup BANG_ITEM_GROUP = new BangItemGroup(ItemGroup.GROUPS.length,"bang");

    public BangItemGroup(int p_i1853_1_, String p_i1853_2_) {
        super(p_i1853_1_, p_i1853_2_);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(Items.SEA_SALT_STUFF);
    }


}
