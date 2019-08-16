package uk.gaz492.bambooeverything.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BambooFenceGateBlock extends FenceGateBlockOverride {
    public BambooFenceGateBlock() {
        super(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.BAMBOO));
    }
}
