package com.lupomontero.birthdaycraft.util;

import com.lupomontero.birthdaycraft.BirthdayCraft;
import com.lupomontero.birthdaycraft.blocks.BlockItemBase;
import com.lupomontero.birthdaycraft.blocks.CandyBlock;
import com.lupomontero.birthdaycraft.items.Corn;
import com.lupomontero.birthdaycraft.items.ChichaMorada;
import com.lupomontero.birthdaycraft.items.PopCorn;
import com.lupomontero.birthdaycraft.items.PurpleCorn;
import com.lupomontero.birthdaycraft.items.ItemBase;
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
  public static final RegistryObject<Corn> CORN = ITEMS.register("corn", Corn::new);
  public static final RegistryObject<PurpleCorn> PURPLE_CORN = ITEMS.register("purple_corn", PurpleCorn::new);
  public static final RegistryObject<PopCorn> POP_CORN = ITEMS.register("pop_corn", PopCorn::new);
  // cocoa, chocolate, ...

  // Pokeballs...
  public static final RegistryObject<Item> POKEBALL = ITEMS.register("pokeball", ItemBase::new);
  public static final RegistryObject<Item> POKEBALL_GOLD = ITEMS.register("pokeball_gold", ItemBase::new);
  public static final RegistryObject<Item> POKEBALL_MASTER = ITEMS.register("pokeball_master", ItemBase::new);

  // Fluids??
  public static final RegistryObject<ChichaMorada> CHICHA_MORADA = ITEMS.register("chicha_morada", ChichaMorada::new);

  // Tools & weapons?
  public static final RegistryObject<Item> MAGIC_SWORD = ITEMS.register("magic_sword", ItemBase::new);
  public static final RegistryObject<Item> SWORD_OF_DESTRUCTION = ITEMS.register("sword_of_destruction", ItemBase::new);
  public static final RegistryObject<Item> SWORD_OF_LAVA = ITEMS.register("sword_of_lava", ItemBase::new);
  public static final RegistryObject<Item> HAMMER_OF_POWER = ITEMS.register("hammer_of_power", ItemBase::new);

  // Blocks
  public static final RegistryObject<Block> CANDY_BLOCK = BLOCKS.register("candy_block", CandyBlock::new);

  // Block items
  public static final RegistryObject<Item> CANDY_BLOCK_ITEM = ITEMS.register(
    "candy_block",
    () -> new BlockItemBase(CANDY_BLOCK.get())
  );
}

