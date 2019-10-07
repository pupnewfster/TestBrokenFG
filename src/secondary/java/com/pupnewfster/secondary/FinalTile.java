package com.pupnewfster.secondary;

import com.pupnewfster.testfg.IntermediaryTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.world.World;

public class FinalTile extends IntermediaryTileEntity {

    public FinalTile(TileEntityType<?> type) {
        super(type);
    }

    private void test() {
        //This getWorld() fails to be reobfuscated
        World world = getWorld();
        //This getWorld() gets reobfuscated
        World other = ((TileEntity) this).getWorld();
    }
}