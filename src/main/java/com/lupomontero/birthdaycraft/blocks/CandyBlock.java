package com.lupomontero.birthdaycraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class CandyBlock extends Block {
  public CandyBlock() {
    super(
      Block.Properties.create(Material.IRON)
        .hardnessAndResistance(5.0f, 6.0f)
        .sound(SoundType.METAL)
        .harvestLevel(2) // 0 => madera, 1 => piedra, 2 => hierro, 3 => diamante
        .harvestTool(ToolType.PICKAXE)
    );
  }
}