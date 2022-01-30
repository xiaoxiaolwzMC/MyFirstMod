package net.mcfgdemo.lwz;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;

public class EmeraldSword extends SwordItem {
    public EmeraldSword(){
        super(EmeraldItemTier.EMERALD,4,-2.2F,new Item.Properties().group(ItemGroup.COMBAT));
    }
}
