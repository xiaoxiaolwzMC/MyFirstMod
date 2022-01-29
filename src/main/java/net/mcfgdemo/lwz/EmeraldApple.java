package net.mcfgdemo.lwz;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.FoodStats;

public class EmeraldApple extends Item {
    private static final Food food = (new Food.Builder())
            .saturation(10)
            .hunger(20)
            .effect(() -> new EffectInstance(Effects.HEALTH_BOOST, 3*20, 1), 1)
            .build();
    public EmeraldApple() {
        super(new Properties().food(food).group(ItemGroup.FOOD));
    }
}
