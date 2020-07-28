package com.lupomontero.birthdaycraft.items;

import com.lupomontero.birthdaycraft.BirthdayCraft;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Corn extends Item {
  public Corn() {
    super(
      new Item.Properties()
        .group(BirthdayCraft.TAB)
        .food(
          new Food.Builder()
            .hunger(2)
            .saturation(1.2f)
            .effect(new EffectInstance(Effects.HUNGER, 15 * 20, 1), 0.3f)
            .build()
        )
    );
  }
}