package dev.wuffs.blocks.block;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.material.Material;

public class BambooTrapDoorBlock extends TrapDoorBlock
{

    public BambooTrapDoorBlock() {
        super(Properties.of(Material.BAMBOO)
                .strength(3.0F, 3.0F)
                .sound(SoundType.BAMBOO),
                SoundEvents.BAMBOO_WOOD_TRAPDOOR_CLOSE, SoundEvents.BAMBOO_WOOD_TRAPDOOR_OPEN
        );
    }
}
