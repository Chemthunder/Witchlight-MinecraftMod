package net.chemthunder.witchlight.item;

import net.chemthunder.witchlight.Witchlight;
import net.chemthunder.witchlight.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup WITCHLIGHT_CLOCKSHIFT_GROUP = Registry.register(Registries.ITEM_GROUP,
    new Identifier(Witchlight.MOD_ID, "blind_obedience"),
        FabricItemGroup.builder().displayName(Text.translatable("itemgroup.witchlight_clockshift"))
            .icon(() -> new ItemStack(ModItems.BLIND_OBEDIENCE)).entries((displayContext, entries) -> {
                entries.add(ModItems.BLIND_OBEDIENCE);
                    entries.add(ModItems.WILL_OF_DAMNATION);
                    entries.add(ModItems.UNDEFINED);
                    entries.add(ModBlocks.WITCHLIGHT_STONE);
    }).build());



public static void registerItemGroups() {
    Witchlight.LOGGER.info("registering item groups");
}
}
