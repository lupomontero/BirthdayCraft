package com.lupomontero.birthdaycraft.util;

import com.lupomontero.birthdaycraft.BirthdayCraft;
import com.lupomontero.birthdaycraft.items.ItemBase;
import com.lupomontero.birthdaycraft.blocks.BlockItemBase;
import com.lupomontero.birthdaycraft.blocks.CandyBlock;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

  public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, BirthdayCraft.MOD_ID);
  public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, BirthdayCraft.MOD_ID);

  public static void init() {
    ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
  }

  // Items
  public static final RegistryObject<Item> CANDY = ITEMS.register("candy", ItemBase::new);

  // Blocks
  public static final RegistryObject<Block> CANDY_BLOCK = BLOCKS.register("candy_block", CandyBlock::new);

  // Block items
  public static final RegistryObject<Item> CANDY_BLOCK_ITEM = ITEMS.register("candy_block", () -> new BlockItemBase(CANDY_BLOCK.get()));
}

