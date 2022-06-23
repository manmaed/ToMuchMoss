package net.manmaed.tomuchmoss.blocks;

import net.manmaed.tomuchmoss.ToMuchMoss;
import net.manmaed.tomuchmoss.items.TMMItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
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
    public static final RegistryObject<Item> MOSSY_DEEPSLATE_ITEM = TMMItems.ITEMS.register("mossy_deepslate", () -> new BlockItem(MOSSY_DEEPSLATE.get(), new Item.Properties().tab(ToMuchMoss.TAB)));

    public static final RegistryObject<Block> COBBLED_MOSSY_DEEPSLATE = BLOCKS.register("cobbled_mossy_deepslate", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).color(MaterialColor.DEEPSLATE).strength(3.5F, 6F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Item> COBBLED_MOSSY_DEEPSLATE_ITEM = TMMItems.ITEMS.register("cobbled_mossy_deepslate", () -> new BlockItem(COBBLED_MOSSY_DEEPSLATE.get(), new Item.Properties().tab(ToMuchMoss.TAB)));


}
