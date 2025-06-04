package net.chemthunder.witchlight.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;


public class WitchlightStoneItem extends Block {

    public WitchlightStoneItem(Settings settings) {
        super(settings);
    }


    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        super.onPlaced(world, pos, state, placer, itemStack);


        if (!world.isClient() && placer.age % 100 <= 0) {

            if (pos.getX() >= 1 && pos.getX() <= 1 + 1 - 1 &&
                    pos.getY() >= 1 && pos.getY() <= 1 + 1 - 1 &&
                    pos.getZ() >= 1 && pos.getZ() <= 1 + 1 - 1) {
                // Entity is within the area, apply effects here




            }
        }
    }




}
