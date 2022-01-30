package net.mcfgdemo.lwz;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum EmeraldItemTier implements IItemTier {

    EMERALD(3,1000,9.0F,3.5F,20);

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;

    EmeraldItemTier(int harvestLevelIn,int maxUsesIn,float efficiencyIn,float attackDamageIn,int enchantabilityIn){
        this.harvestLevel=harvestLevelIn;
        this.maxUses=maxUsesIn;
        this.efficiency=efficiencyIn;
        this.attackDamage=attackDamageIn;
        this.enchantability=enchantabilityIn;
    }

    @Override
    public int getMaxUses(){
        return this.maxUses;
    }

    @Override
    public float getEfficiency(){
        return this.efficiency;
    }

    @Override
    public float getAttackDamage(){
        return this.attackDamage;
    }

    @Override
    public int getHarvestLevel(){
        return this.harvestLevel;
    }

    @Override
    public int getEnchantability(){
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairMaterial(){
        return Ingredient.fromItems(ItemRegistry.emeraldIngot.get());
    }
}
