package com.lupomontero.birthdaycraft.items;

import com.lupomontero.birthdaycraft.BirthdayCraft;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Food;
import net.minecraft.item.GlassBottleItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.UseAction;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class ChichaMorada extends GlassBottleItem {
  public ChichaMorada() {
    super(
      new GlassBottleItem.Properties()
        .group(BirthdayCraft.TAB)
        .food(new Food.Builder().build())
    );
  }

  @Override
  public UseAction getUseAction(ItemStack stack) {
    return UseAction.DRINK;
  }

  public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
    System.out.println("onItemRightClick");
    System.out.println(playerIn.getHeldItem(handIn).getCount());
    // return playerIn.getHeldItem(handIn);
    // return new ActionResult<ItemStack>(ActionResultType.SUCCESS, playerIn.getHeldItem(handIn));
    return new ActionResult<ItemStack>(
      ActionResultType.SUCCESS,
      this.turnBottleIntoItem(
        playerIn.getHeldItem(handIn),
        playerIn,
        new ItemStack(Items.GLASS_BOTTLE)
      )
    );
  }

  // @Override
  protected ItemStack turnBottleIntoItem(ItemStack stackIn, PlayerEntity player, ItemStack stackOut) {
    System.out.println("turnBottleIntoItem");
    stackIn.shrink(1);

    if (stackIn.isEmpty()) {
      return stackOut;
    }

    if (!player.inventory.addItemStackToInventory(stackOut)) {
      player.dropItem(stackOut, false);
    }

    return stackIn;
  }
}