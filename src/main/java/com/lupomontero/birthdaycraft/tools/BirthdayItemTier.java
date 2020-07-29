package com.lupomontero.birthdaycraft.tools;

import com.lupomontero.birthdaycraft.util.RegistryHandler;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum BirthdayItemTier implements IItemTier {
  MAGIC(
    3, // harvestLevel
    800, // maxUses
    7.0f, // efficiency
    3.0f, // attackDamage
    12, // enchantability
    () -> {
      return Ingredient.fromItems(RegistryHandler.MAGIC_SWORD.get());
    } // repairMaterial
  ),

  TITANIUM(
    3, // harvestLevel
    800, // maxUses
    7.0f, // efficiency
    3.0f, // attackDamage
    12, // enchantability
    () -> {
      return Ingredient.fromItems(RegistryHandler.MAGIC_SWORD.get());
    } // repairMaterial
  );

  private final int harvestLevel;
  private final int maxUses;
  private final float efficiency;
  private final float attackDamage;
  private final int enchantability;
  private final Supplier<Ingredient> repairMaterial;

  BirthdayItemTier(
    int harvestLevel,
    int maxUses,
    float efficiency,
    float attackDamage,
    int enchantability,
    Supplier<Ingredient> repairMaterial
  ) {
    this.harvestLevel = harvestLevel;
    this.maxUses = maxUses;
    this.efficiency = efficiency;
    this.attackDamage = attackDamage;
    this.enchantability = enchantability;
    this.repairMaterial = repairMaterial;
  }

  @Override
  public float getAttackDamage() {
    return attackDamage;
  }

  @Override
  public float getEfficiency() {
    return efficiency;
  }

  @Override
  public int getEnchantability() {
    return enchantability;
  }

  @Override
  public int getHarvestLevel() {
    return harvestLevel;
  }

  @Override
  public int getMaxUses() {
    return maxUses;
  }

  @Override
  public Ingredient getRepairMaterial() {
    return repairMaterial.get();
  }
}