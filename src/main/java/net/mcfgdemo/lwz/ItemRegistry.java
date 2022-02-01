package net.mcfgdemo.lwz;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,Utils.MOD_ID);
    public static final RegistryObject<Item> emeraldIngot = ITEMS.register("emerald_ingot",EmeraldIngot::new);
    public static final RegistryObject<Item> emeraldApple = ITEMS.register("emerald_apple",EmeraldApple::new);
    public static final RegistryObject<Item> emeraldSword = ITEMS.register("emerald_sword",EmeraldSword::new);
    public static final RegistryObject<Item> emeraldPickaxe = ITEMS.register("emerald_pickaxe",EmeraldPickaxe::new);
}
