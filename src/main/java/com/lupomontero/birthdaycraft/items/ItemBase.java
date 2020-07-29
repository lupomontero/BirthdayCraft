package com.lupomontero.birthdaycraft.items;

import com.lupomontero.birthdaycraft.BirthdayCraft;

import net.minecraft.item.Item;
// import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {
  public ItemBase() {
    // super(new Item.Properties().group(ItemGroup.MATERIALS));
    super(new Item.Properties().group(BirthdayCraft.TAB));
  }
}