package net.chemthunder.witchlight;

import net.chemthunder.witchlight.block.ModBlocks;
import net.chemthunder.witchlight.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Witchlight implements ModInitializer {
	public static final String MOD_ID = "witchlight";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		LOGGER.info("I cast furry upon vbinnie");
	}





}







