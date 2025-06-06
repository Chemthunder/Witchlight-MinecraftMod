package net.chemthunder.witchlight.item;


import net.chemthunder.witchlight.Witchlight;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;


public class ModItems {

    public static final Item BLIND_OBEDIENCE = registerItem("blind_obedience", new SwordItem(ModToolMaterial.UNDEFINED, 10,-3.1f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item WILL_OF_DAMNATION = registerItem("will_of_damnation", new Item(new FabricItemSettings().maxCount(1).rarity(Rarity.UNCOMMON)));





    public static final Item RIFTED_SHARD = registerItem("rifted_shard", new Item(new FabricItemSettings()));
    public static final Item RIFTED_LEXICON = registerItem("rifted_lexicon", new Item(new FabricItemSettings().maxCount(1).rarity(Rarity.UNCOMMON)));



    public static final Item CANCEROUS_EMANENCE = registerItem("cancerous_emanence", new Item(new FabricItemSettings()));

    // useless
    public static final Item UNDEFINED = registerItem("undefined", new Item(new FabricItemSettings()));

    // helper methods, the sillies. DO NOT DELETE
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Witchlight.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Witchlight.LOGGER.info("Commiting heinous war crimes with the wingman of " + Witchlight.MOD_ID);

    }
}
