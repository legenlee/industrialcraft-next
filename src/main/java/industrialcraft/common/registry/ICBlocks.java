package industrialcraft.common.registry;

import industrialcraft.IndustrialCraft;
import industrialcraft.common.block.RubberLogBlock;
import industrialcraft.common.world.grower.RubberTreeGrower;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.FireBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.WoodButtonBlock;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ICBlocks {
    protected static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            IndustrialCraft.MOD_ID);

    public static void setup(final IEventBus bus) {
        BLOCKS.register(bus);
    }

    public static void setupPots() {
        final FlowerPotBlock POT = (FlowerPotBlock) Blocks.FLOWER_POT;

        POT.addPlant(RUBBER_SAPLING.get().getRegistryName(), () -> POTTED_RUBBER_SAPLING.get());
    }

    public static final WoodType RUBBER = WoodType.create(IndustrialCraft.modPrefix("rubber").toString());

    public static final RegistryObject<Block> TIN_ORE = BLOCKS.register("tin_ore",
            () -> new OreBlock(Block.Properties.of(Material.STONE).strength(3, 3)));

    public static final RegistryObject<Block> DEEPSLATE_TIN_ORE = BLOCKS.register("deepslate_tin_ore",
            () -> new OreBlock(Block.Properties.copy(TIN_ORE.get()).strength(4.5f, 4.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> LEAD_ORE = BLOCKS.register("lead_ore",
            () -> new OreBlock(Block.Properties.of(Material.STONE).strength(3, 3)));

    public static final RegistryObject<Block> DEEPSLATE_LEAD_ORE = BLOCKS.register("deepslate_lead_ore",
            () -> new OreBlock(Block.Properties.copy(LEAD_ORE.get()).strength(4.5f, 4.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> BAUXITE_ORE = BLOCKS.register("bauxite_ore",
            () -> new OreBlock(Block.Properties.of(Material.STONE).strength(3, 3)));

    public static final RegistryObject<Block> DEEPSLATE_BAUXITE_ORE = BLOCKS.register("deepslate_bauxite_ore",
            () -> new OreBlock(Block.Properties.copy(BAUXITE_ORE.get()).strength(4.5f, 4.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> RAW_TIN_BLOCK = BLOCKS.register("raw_tin_block",
            () -> new Block(Block.Properties.copy(Blocks.RAW_IRON_BLOCK)));

    public static final RegistryObject<Block> TIN_BLOCK = BLOCKS.register("tin_block",
            () -> new Block(Block.Properties.of(Material.METAL).strength(5, 5)));

    public static final RegistryObject<Block> RAW_LEAD_BLOCK = BLOCKS.register("raw_lead_block",
            () -> new Block(Block.Properties.copy(Blocks.RAW_IRON_BLOCK)));

    public static final RegistryObject<Block> LEAD_BLOCK = BLOCKS.register("lead_block",
            () -> new Block(Block.Properties.of(Material.METAL).strength(5, 5)));

    public static final RegistryObject<Block> RAW_ALUMINIUM_BLOCK = BLOCKS.register("raw_aluminium_block",
            () -> new Block(Block.Properties.copy(Blocks.RAW_IRON_BLOCK)));

    public static final RegistryObject<Block> ALUMINIUM_BLOCK = BLOCKS.register("aluminium_block",
            () -> new Block(Block.Properties.of(Material.METAL).strength(5, 5)));

    public static final RegistryObject<Block> BRONZE_BLOCK = BLOCKS.register("bronze_block",
            () -> new Block(Block.Properties.of(Material.METAL).strength(5, 5)));

    public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register("steel_block",
            () -> new Block(Block.Properties.of(Material.METAL).strength(5, 5)));

    public static final RegistryObject<Block> RUBBER_LOG = BLOCKS.register("rubber_log",
            () -> new RubberLogBlock(Block.Properties.copy(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> STRIPPED_RUBBER_LOG = BLOCKS.register("stripped_rubber_log",
            () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.STRIPPED_OAK_LOG)));

    public static final RegistryObject<Block> RUBBER_WOOD = BLOCKS.register("rubber_wood",
            () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> STRIPPED_RUBBER_WOOD = BLOCKS.register("stripped_rubber_wood",
            () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final RegistryObject<Block> RUBBER_LEAVES = BLOCKS.register("rubber_leaves",
            () -> new LeavesBlock(Block.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> RUBBER_SAPLING = BLOCKS.register("rubber_sapling",
            () -> new SaplingBlock(new RubberTreeGrower(), Block.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> POTTED_RUBBER_SAPLING = BLOCKS.register("potted_rubber_sapling",
            () -> new FlowerPotBlock(null, () -> RUBBER_SAPLING.get(),
                    Block.Properties.copy(Blocks.FLOWER_POT)));

    public static final RegistryObject<Block> RUBBER_PLANKS = BLOCKS.register("rubber_planks",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> RUBBER_STAIRS = BLOCKS.register("rubber_stairs",
            () -> new StairBlock(() -> Blocks.OAK_PLANKS.defaultBlockState(),
                    Block.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> RUBBER_SLAB = BLOCKS.register("rubber_slab",
            () -> new SlabBlock(Block.Properties.copy(Blocks.OAK_SLAB)));

    public static final RegistryObject<Block> RUBBER_DOOR = BLOCKS.register("rubber_door",
            () -> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR)));

    public static final RegistryObject<Block> RUBBER_TRAPDOOR = BLOCKS.register("rubber_trapdoor",
            () -> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR)));

    public static final RegistryObject<Block> RUBBER_FENCE = BLOCKS.register("rubber_fence",
            () -> new FenceBlock(Block.Properties.copy(Blocks.OAK_FENCE)));

    public static final RegistryObject<Block> RUBBER_FENCE_GATE = BLOCKS.register("rubber_fence_gate",
            () -> new FenceGateBlock(Block.Properties.copy(Blocks.OAK_FENCE_GATE)));

    public static final RegistryObject<Block> RUBBER_PRESSURE_PLATE = BLOCKS.register("rubber_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    Block.Properties.copy(Blocks.OAK_PRESSURE_PLATE)));

    public static final RegistryObject<Block> RUBBER_BUTTON = BLOCKS.register("rubber_button",
            () -> new WoodButtonBlock(Block.Properties.copy(Blocks.OAK_BUTTON)));

    // public static final RegistryObject<Block> RUBBER_SIGN =
    // BLOCKS.register("rubber_sign",
    // () -> new StandingSignBlock(p_56990_, p_56991_));

    // public static final RegistryObject<Block> RUBBER_WALL_SIGN =
    // BLOCKS.register("rubber_wall_sign",
    // () -> new WallSignBlock(p_56990_, p_56991_));

}
