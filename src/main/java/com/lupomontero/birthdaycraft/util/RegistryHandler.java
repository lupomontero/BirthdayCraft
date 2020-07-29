package com.lupomontero.birthdaycraft.util;

import com.lupomontero.birthdaycraft.BirthdayCraft;
import com.lupomontero.birthdaycraft.armor.BirthdayArmorMaterial;
import com.lupomontero.birthdaycraft.blocks.BlockItemBase;
import com.lupomontero.birthdaycraft.blocks.CandyBlock;
import com.lupomontero.birthdaycraft.items.Corn;
import com.lupomontero.birthdaycraft.items.ChichaMorada;
import com.lupomontero.birthdaycraft.items.PopCorn;
import com.lupomontero.birthdaycraft.items.PurpleCorn;
import com.lupomontero.birthdaycraft.tools.BirthdayItemTier;
import com.lupomontero.birthdaycraft.items.ItemBase;

import net.minecraft.item.Item;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.PickaxeItem;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;

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

  // Tools
  public static final RegistryObject<SwordItem> MAGIC_SWORD = ITEMS.register(
    "magic_sword",
    () -> new SwordItem(
      BirthdayItemTier.MAGIC,
      2, // attackDamage (minecraft base is 1, MagicItemTier is 3)
      -3.0f, // attackSpeedIn (minecraft base is 4)
      new Item.Properties().group(BirthdayCraft.TAB) // Creative tab group
    )
  );
  public static final RegistryObject<SwordItem> MAGIC_SWORD_OF_TERROR = ITEMS.register(
    "magic_sword_of_terror",
    () -> new SwordItem(
      BirthdayItemTier.MAGIC,
      3, // attackDamage (minecraft base is 1, MagicItemTier is 3)
      -3.0f, // attackSpeedIn (minecraft base is 4)
      new Item.Properties().group(BirthdayCraft.TAB) // Creative tab group
    )
  );
  public static final RegistryObject<SwordItem> SWORD_OF_DESTRUCTION = ITEMS.register(
    "sword_of_destruction",
    () -> new SwordItem(
      BirthdayItemTier.MAGIC,
      4, // attackDamage (minecraft base is 1, MagicItemTier is 3)
      -2.8f, // attackSpeedIn (minecraft base is 4)
      new Item.Properties().group(BirthdayCraft.TAB) // Creative tab group
    )
  );
  public static final RegistryObject<SwordItem> SWORD_OF_LAVA = ITEMS.register(
    "sword_of_lava",
    () -> new SwordItem(
      BirthdayItemTier.MAGIC,
      1, // attackDamage (minecraft base is 1, MagicItemTier is 3)
      -1.4f, // attackSpeedIn (minecraft base is 4)
      new Item.Properties().group(BirthdayCraft.TAB) // Creative tab group
    )
  );
  public static final RegistryObject<PickaxeItem> HAMMER_OF_POWER = ITEMS.register(
    "hammer_of_power",
    () -> new PickaxeItem(
      BirthdayItemTier.MAGIC,
      1, // attackDamage (minecraft base is 1, MagicItemTier is 3)
      -1.4f, // attackSpeedIn (minecraft base is 4)
      new Item.Properties().group(BirthdayCraft.TAB) // Creative tab group
    )
  );

  // Armor
  public static final RegistryObject<ArmorItem> MAGIC_HELMET = ITEMS.register(
    "magic_helmet",
    () -> new ArmorItem(
      BirthdayArmorMaterial.MAGIC,
      EquipmentSlotType.HEAD,
      new Item.Properties().group(BirthdayCraft.TAB)
    )
  );
  public static final RegistryObject<ArmorItem> MAGIC_CHESTPLATE = ITEMS.register(
    "magic_chestplate",
    () -> new ArmorItem(
      BirthdayArmorMaterial.MAGIC,
      EquipmentSlotType.CHEST,
      new Item.Properties().group(BirthdayCraft.TAB)
    )
  );
  public static final RegistryObject<ArmorItem> MAGIC_LEGGINGS = ITEMS.register(
    "magic_leggings",
    () -> new ArmorItem(
      BirthdayArmorMaterial.MAGIC,
      EquipmentSlotType.LEGS,
      new Item.Properties().group(BirthdayCraft.TAB)
    )
  );
  public static final RegistryObject<ArmorItem> MAGIC_BOOTS = ITEMS.register(
    "magic_boots",
    () -> new ArmorItem(
      BirthdayArmorMaterial.MAGIC,
      EquipmentSlotType.FEET,
      new Item.Properties().group(BirthdayCraft.TAB)
    )
  );

  // Blocks
  public static final RegistryObject<Block> CANDY_BLOCK = BLOCKS.register("candy_block", CandyBlock::new);

  // Block items
  public static final RegistryObject<Item> CANDY_BLOCK_ITEM = ITEMS.register(
    "candy_block",
    () -> new BlockItemBase(CANDY_BLOCK.get())
  );
}

