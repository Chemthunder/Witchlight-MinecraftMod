package net.chemthunder.witchlight.item.custom;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector2d;
import org.joml.Vector2f;
import org.joml.Vector3d;


public class WitchlightStoneItem extends Block {

    public WitchlightStoneItem(Settings settings) {
        super(settings);
    }


    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        super.onPlaced(world, pos, state, placer, itemStack);


        if (!world.isClient() && placer.age % 100 <= 0) {

            ServerCommandSource silentSource = new ServerCommandSource(
                    world.getServer(),                                // MinecraftServer
                    Vec3d.ofCenter(pos),                             // Position
                    new Vec2f(0,0),                             // Rotation
                    world.getServer().getOverworld(),                 // World
                    4,                                     // Permission level (e.g., 4 for ops)
                    "silent_executor",                     // Name
                    Text.literal("silent_executor"),       // Display name
                    null,                                // Entity (null is okay)
                    null                                   // Entity as Command Output
            ).withSilent();                  // Suppress all output

            try {
                world.getServer().getCommandManager().getDispatcher().execute("damage @e[distance=50] 4 minecraft:magic", silentSource);
            } catch (CommandSyntaxException e) {
                throw new RuntimeException(e);
            }
        }
    }




}
