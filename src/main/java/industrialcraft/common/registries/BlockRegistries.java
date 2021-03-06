package industrialcraft.common.registries;

import java.util.Collection;
import java.util.function.Supplier;

import com.google.common.collect.ImmutableMap;

import industrialcraft.IndustrialCraft;
import industrialcraft.common.block.misc.RubberLogBlock;
import industrialcraft.common.feature.vegetation.rubber.RubberTreeGrower;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ButtonBlock;
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
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WoodButtonBlock;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistries {
    protected static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            IndustrialCraft.MOD_ID);

    public static final WoodType RUBBER = WoodType.create(IndustrialCraft.modPrefix("rubber").toString());

    // @formatter:off
    public static final RegistryObject<OreBlock> TIN_ORE = register("tin_ore", () -> new OreBlock(Block.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<OreBlock> DEEPSLATE_TIN_ORE = register("deepslate_tin_ore", () -> new OreBlock(Block.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)));
    public static final RegistryObject<OreBlock> LEAD_ORE = register("lead_ore", () -> new OreBlock(Block.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<OreBlock> DEEPSLATE_LEAD_ORE = register("deepslate_lead_ore", () -> new OreBlock(Block.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)));
    public static final RegistryObject<OreBlock> BAUXITE_ORE = register("bauxite_ore", () -> new OreBlock(Block.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<OreBlock> DEEPSLATE_BAUXITE_ORE = register("deepslate_bauxite_ore", () -> new OreBlock(Block.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)));

    public static final RegistryObject<Block> RAW_TIN_BLOCK = register("raw_tin_block", () -> new Block(Block.Properties.copy(Blocks.RAW_IRON_BLOCK)));
    public static final RegistryObject<Block> RAW_LEAD_BLOCK = register("raw_lead_block", () -> new Block(Block.Properties.copy(Blocks.RAW_IRON_BLOCK)));
    public static final RegistryObject<Block> RAW_BAUXITE_BLOCK = register("raw_bauxite_block", () -> new Block(Block.Properties.copy(Blocks.RAW_IRON_BLOCK)));

    public static final RegistryObject<Block> TIN_BLOCK = register("tin_block", () -> new Block(Block.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> LEAD_BLOCK = register("lead_block", () -> new Block(Block.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> ALUMINUM_BLOCK = register("aluminum_block", () -> new Block(Block.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> BRONZE_BLOCK = register("bronze_block", () -> new Block(Block.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> STEEL_BLOCK = register("steel_block", () -> new Block(Block.Properties.copy(Blocks.DIAMOND_BLOCK)));

    public static final RegistryObject<RubberLogBlock> RUBBER_LOG = register("rubber_log", () -> new RubberLogBlock(Block.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<RotatedPillarBlock> STRIPPED_RUBBER_LOG = register("stripped_rubber_log", () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<RotatedPillarBlock> RUBBER_WOOD = register("rubber_wood", () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<RotatedPillarBlock> STRIPPED_RUBBER_WOOD = register("stripped_rubber_wood", () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<LeavesBlock> RUBBER_LEAVES = register("rubber_leaves", () -> new LeavesBlock(Block.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<SaplingBlock> RUBBER_SAPLING = register("rubber_sapling", () -> new SaplingBlock(new RubberTreeGrower(), Block.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<FlowerPotBlock> POTTED_RUBBER_SAPLING = register("potted_rubber_sapling", () -> new FlowerPotBlock(null, () -> RUBBER_SAPLING.get(), Block.Properties.copy(Blocks.FLOWER_POT)));
    public static final RegistryObject<Block> RUBBER_PLANKS = register("rubber_planks", () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<StairBlock> RUBBER_STAIRS = register("rubber_stairs", () -> new StairBlock(() -> Blocks.OAK_PLANKS.defaultBlockState(), Block.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<SlabBlock> RUBBER_SLAB = register("rubber_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.OAK_SLAB)));
    // public static final RegistryObject<Block> RUBBER_DOOR = register("rubber_door", () -> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR)));
    // public static final RegistryObject<Block> RUBBER_TRAPDOOR = register("rubber_trapdoor", () -> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR)));
    public static final RegistryObject<FenceBlock> RUBBER_FENCE = register("rubber_fence", () -> new FenceBlock(Block.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<FenceGateBlock> RUBBER_FENCE_GATE = register("rubber_fence_gate", () -> new FenceGateBlock(Block.Properties.copy(Blocks.OAK_FENCE_GATE)));
    public static final RegistryObject<PressurePlateBlock> RUBBER_PRESSURE_PLATE = register("rubber_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.copy(Blocks.OAK_PRESSURE_PLATE)));
    public static final RegistryObject<ButtonBlock> RUBBER_BUTTON = register("rubber_button", () -> new WoodButtonBlock(Block.Properties.copy(Blocks.OAK_BUTTON)));

    // public static final RegistryObject<Block> RUBBER_SIGN =
    // BLOCKS.register("rubber_sign",
    // () -> new StandingSignBlock(p_56990_, p_56991_));

    // public static final RegistryObject<Block> RUBBER_WALL_SIGN =
    // BLOCKS.register("rubber_wall_sign",
    // () -> new WallSignBlock(p_56990_, p_56991_));

    // @formatter:on
    private static final <T extends Block> RegistryObject<T> register(String name, Supplier<T> sup) {
        final RegistryObject<T> registryObject = BLOCKS.register(name, sup);
        return registryObject;
    }

    public static void setupPots() {
        final FlowerPotBlock pot = (FlowerPotBlock) Blocks.FLOWER_POT;

        pot.addPlant(RUBBER_SAPLING.get().getRegistryName(), () -> POTTED_RUBBER_SAPLING.get());
    }

    public static void setupFlammables() {
        final FireBlock fireBlock = (FireBlock) Blocks.FIRE;

        fireBlock.setFlammable(RUBBER_LOG.get(), 5, 20);
        fireBlock.setFlammable(RUBBER_WOOD.get(), 5, 20);
        fireBlock.setFlammable(RUBBER_PLANKS.get(), 5, 20);
        fireBlock.setFlammable(RUBBER_STAIRS.get(), 5, 20);
        fireBlock.setFlammable(RUBBER_SLAB.get(), 5, 20);
        fireBlock.setFlammable(RUBBER_FENCE.get(), 5, 20);
        fireBlock.setFlammable(RUBBER_FENCE_GATE.get(), 5, 20);

        fireBlock.setFlammable(STRIPPED_RUBBER_LOG.get(), 5, 5);
        fireBlock.setFlammable(STRIPPED_RUBBER_WOOD.get(), 5, 5);

        fireBlock.setFlammable(RUBBER_LEAVES.get(), 30, 60);
    }

    public static void setupStrippables() {
        AxeItem.STRIPPABLES = new ImmutableMap.Builder<Block, Block>()
                .putAll(AxeItem.STRIPPABLES)
                .put(RUBBER_LOG.get(), STRIPPED_RUBBER_LOG.get())
                .put(RUBBER_WOOD.get(), STRIPPED_RUBBER_WOOD.get())
                .build();
    }

    public static void setup(final IEventBus bus) {
        BLOCKS.register(bus);
    }

    public static Collection<RegistryObject<Block>> getCollection() {
        return BLOCKS.getEntries();
    }
}
