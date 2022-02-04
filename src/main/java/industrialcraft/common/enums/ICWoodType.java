package industrialcraft.common.enums;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.WoodType;

import industrialcraft.IndustrialCraft;

public class ICWoodType {
    public static final WoodType RUBBER = WoodType
            .create(new ResourceLocation(IndustrialCraft.MOD_ID, "rubber").toString());
}
