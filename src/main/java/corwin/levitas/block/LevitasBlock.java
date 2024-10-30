package corwin.levitas.block;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.block.AbstractBlock;

public class LevitasBlock extends Block {
    public LevitasBlock() {
        super(AbstractBlock.Settings.of(Material.METAL)
            .strength(4.0f)  // Adjust the hardness as desired
            .requiresTool()
            .sounds(BlockSoundGroup.METAL));
    }
}
