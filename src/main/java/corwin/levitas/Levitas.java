package corwin.levitas;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import corwin.levitas.block.LevitasBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Levitas implements ModInitializer {
    public static final String MOD_ID = "levitas";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final Block LEVITAS_BLOCK = new LevitasBlock();

    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "levitas_block"), LEVITAS_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "levitas_block"), LEVITAS_BLOCK_ITEM);
	}
}
