package industrialcraft.api;

import net.minecraftforge.fluids.capability.IFluidHandler.FluidAction;

public enum Action {
    EXECUTE(FluidAction.EXECUTE),
    SIMULATE(FluidAction.SIMULATE);

    private final FluidAction fluidAction;

    Action(FluidAction fluidAction) {
        this.fluidAction = fluidAction;
    }

    public boolean execute() {
        return this == EXECUTE;
    }

    public boolean simulate() {
        return this == SIMULATE;
    }

    public static Action fromFluidAction(FluidAction fluidAction) {
        return fluidAction == FluidAction.EXECUTE ? EXECUTE : SIMULATE;
    }
}
