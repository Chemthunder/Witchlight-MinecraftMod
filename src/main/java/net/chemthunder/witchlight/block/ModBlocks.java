package net.chemthunder.witchlight.block;

import net.chemthunder.witchlight.Witchlight;
import net.chemthunder.witchlight.item.custom.WitchlightStoneItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModBlocks  {
    public static final Block WITCHLIGHT_STONE = registerBlock("witchlight_stone",
            new WitchlightStoneItem(Block.Settings.create()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Witchlight.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, new Identifier(Witchlight.MOD_ID, name),
                new BlockItem(block, new Item.Settings().maxCount(1).rarity(Rarity.UNCOMMON)));
    }

    public static void registerModBlocks() {
        Witchlight.LOGGER.info("No. " + Witchlight.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
        });
    }
}
