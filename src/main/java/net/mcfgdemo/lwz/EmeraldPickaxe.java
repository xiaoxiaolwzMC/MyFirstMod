package net.mcfgdemo.lwz;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;

public class EmeraldPickaxe extends PickaxeItem {
    public EmeraldPickaxe(){
        super(EmeraldItemTier.EMERALD,2,-2.6F,(new Item.Properties().group(ItemGroup.TOOLS)));
    }
}
