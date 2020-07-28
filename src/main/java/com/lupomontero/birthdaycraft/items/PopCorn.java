package com.lupomontero.birthdaycraft.items;

import com.lupomontero.birthdaycraft.BirthdayCraft;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class PopCorn extends Item {
  public PopCorn() {
    super(
      new Item.Properties()
        .group(BirthdayCraft.TAB)
        .food(
          new Food.Builder()
            .hunger(2)
            .saturation(1.2f)
            .setAlwaysEdible() // eat even when not hungry!
            .build()
        )
    );
  }
}