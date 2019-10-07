package com.pupnewfster.testfg;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.world.World;

public class IntermediaryTileEntity extends TileEntity {

    public IntermediaryTileEntity(TileEntityType<?> type) {
        super(type);
    }

    private void test() {
        //This getWorld() gets reobfuscated
        World world = getWorld();
    }
}