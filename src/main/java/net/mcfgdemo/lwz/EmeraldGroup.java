package net.mcfgdemo.lwz;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class EmeraldGroup extends ItemGroup {
    public EmeraldGroup() {
        super("emerald_group");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemRegistry.emeraldIngot.get());
    }
}
