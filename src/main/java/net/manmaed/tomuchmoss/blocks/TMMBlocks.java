package net.manmaed.tomuchmoss.blocks;

import net.manmaed.tomuchmoss.ToMuchMoss;
import net.manmaed.tomuchmoss.items.TMMItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * Created by manmaed on 23/06/2022.
 */
public class TMMBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ToMuchMoss.MOD_ID);
    /**
     * Example Block:
     * public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)));
     * public static final RegistryObject<Item> EXAMPLE_BLOCK_ITEM = PRItems.ITEMS.register("example_block", () -> new BlockItem(EXAMPLE_BLOCK.get(), new Item.Properties().tab(PetRock.itemGroup)));
     **/

    public static final RegistryObject<Block> MOSSY_DEEPSLATE = BLOCKS.register("mossy_deepslate", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).color(MaterialColor.DEEPSLATE).strength(3F, 6F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> COBBLED_MOSSY_DEEPSLATE = BLOCKS.register("cobbled_mossy_deepslate", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).color(MaterialColor.DEEPSLATE).strength(3.5F, 6F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));

    //Other Things
    public static final RegistryObject<Block> MOSSY_DEEPSLATE_SLAB = BLOCKS.register("mossy_deepslate_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(MOSSY_DEEPSLATE.get())));
    public static final RegistryObject<Block> MOSSY_DEEPSLATE_STAIR = BLOCKS.register("mossy_deepslate_stairs", () -> new StairBlock(MOSSY_DEEPSLATE.get().defaultBlockState(), BlockBehaviour.Properties.copy(MOSSY_DEEPSLATE.get())));
    public static final RegistryObject<Block> MOSSY_DEEPSLATE_WALL = BLOCKS.register("mossy_deepslate_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(MOSSY_DEEPSLATE.get())));

    //BlockItems
    private static final RegistryObject<Item> MOSSY_DEEPSLATE_ITEM = TMMItems.ITEMS.register("mossy_deepslate", () -> makeBlockItem(MOSSY_DEEPSLATE.get()));
    private static final RegistryObject<Item> COBBLED_MOSSY_DEEPSLATE_ITEM = TMMItems.ITEMS.register("cobbled_mossy_deepslate", () ->makeBlockItem(COBBLED_MOSSY_DEEPSLATE.get()));
    private static final RegistryObject<Item> MOSSY_DEEPSLATE_SLAB_ITEM = TMMItems.ITEMS.register("mossy_deepslate_slab", () -> makeBlockItem(MOSSY_DEEPSLATE_SLAB.get()));
    private static final RegistryObject<Item> MOSSY_DEEPSLATE_STAIR_ITEM = TMMItems.ITEMS.register("mossy_deepslate_stairs", () -> makeBlockItem(MOSSY_DEEPSLATE_STAIR.get()));
    private static final RegistryObject<Item> MOSSY_DEEPSLATE_WALL_ITEM = TMMItems.ITEMS.register("mossy_deepslate_wall", () -> makeBlockItem(MOSSY_DEEPSLATE_WALL.get()));

    private static BlockItem makeBlockItem(Block block) {
        return new BlockItem(block, new Item.Properties());
    }
}
