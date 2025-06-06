package net.chemthunder.witchlight.item.custom;


import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.particle.Particle;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

import net.minecraft.network.packet.s2c.play.PositionFlag;
import net.minecraft.predicate.entity.EntityPredicates;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.EnumSet;
import java.util.List;
import java.util.Set;


public class WitchlightStoneItem extends Block {

    public WitchlightStoneItem(Settings settings) {
        super(settings);
    }


    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        super.onPlaced(world, pos, state, placer, itemStack);;
       world.scheduleBlockTick(pos,this,20000);
              if (!world.isClient) {
                  List<PlayerEntity> entities = world.getEntitiesByType(EntityType.PLAYER, new Box(placer.getX()-10,placer.getY()-10,placer.getZ()-10,placer.getX()+10,placer.getY()+10,placer.getZ()+10), EntityPredicates.VALID_ENTITY);

        for (PlayerEntity player : entities) {

            player.moveToWorld(world.getServer().getWorld(RegistryKey.of(RegistryKeys.WORLD, new Identifier("witchlight:damnation"))));
            Set<PositionFlag> flags = EnumSet.noneOf(PositionFlag.class);
            player.teleport(world.getServer().getWorld(RegistryKey.of(RegistryKeys.WORLD, new Identifier("witchlight:damnation"))), player.getX() + 0.5, player.getY(), player.getZ() + 0.5, flags, player.getYaw(), player.getPitch());
        }

        }
    }
}
