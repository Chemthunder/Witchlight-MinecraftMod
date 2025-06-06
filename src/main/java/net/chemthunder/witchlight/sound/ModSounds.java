package net.chemthunder.witchlight.sound;

import net.chemthunder.witchlight.Witchlight;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent WITCHLIGHT_STONE_PLACE = registerSoundEvent("witchlight_stone_place");





private static SoundEvent registerSoundEvent(String name) {
    Identifier id = new Identifier(Witchlight.MOD_ID, name);
    return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
}

    public static void registerSounds() {
        Witchlight.LOGGER.info("Registering Sounds!");
    }
}
