package industrialcraft.api.energy;

import industrialcraft.api.Action;
import industrialcraft.api.constants.NBTConstants;
import net.minecraft.nbt.CompoundTag;
import net.minecraftforge.common.util.INBTSerializable;

public interface IEnergyContainer extends INBTSerializable<CompoundTag> {
    /**
     * Returns the maximum amount of energy that can be stored into this
     * {@link IEnergyContainer}.
     * 
     * @return Maximum amount of energy that can be stored.
     */
    long getCapacity();

    /**
     * Returns the available capacity that energy can be stored into this
     * {@link IEnergyContainer}.
     * 
     * @return
     */
    default long getAvailableCapacity() {
        return getCapacity() - getEnergy();
    }

    /**
     * Gets energy currently stored from this {@link IEnergyContainer}.
     * 
     * @return energy currently stored.
     */
    long getEnergy();

    /**
     * Sets amount of energy currently stored from this {@link IEnergyContainer}.
     * 
     * @param amount Amount of energy to be stored.
     */
    void setEnergy(long amount);

    /**
     * Receives energy into this {@link IEnergyContainer}.
     * 
     * @param amount Amount of energy to receive.
     * @param action The action to perform.
     * @return Amount that cannot received into this
     *         {@link IEnergyContainer}.
     */
    default long receive(long amount, Action action) {
        if (amount == 0l) {
            return amount;
        }

        long availableCapacity = getAvailableCapacity();
        if (availableCapacity == 0l) {
            return amount;
        }

        long amountToReceive = Math.min(availableCapacity, amount);
        if (amountToReceive != 0l && action.execute()) {
            setEnergy(amountToReceive);
        }

        return amount - amountToReceive;
    }

    /**
     * Extracts energy from this {@link IEnergyContainer}.
     * 
     * @param amount Amount of energy to extract from this {@link IEnergyContainer}.
     * @param action
     * @return The amount that successfully extracted from this
     *         {@link IEnergyContainer}.
     */
    default long extract(long amount, Action action) {
        if (isEmpty() || amount == 0l) {
            return 0l;
        }

        long currentEnergy = getEnergy();
        long amountToExtract = Math.min(currentEnergy, amount);
        if (action.execute()) {
            setEnergy(currentEnergy - amountToExtract);
        }

        return amountToExtract;
    }

    /**
     * Checks if this container is empty.
     * 
     * @return True if this container has no energy. false otherwise.
     */
    default boolean isEmpty() {
        return getEnergy() == 0l;
    };

    /**
     * Clear the energy from this container.
     */
    default void setEmpty() {
        setEnergy(0l);
    }

    @Override
    default CompoundTag serializeNBT() {
        CompoundTag compoundTag = new CompoundTag();
        if (!isEmpty()) {
            compoundTag.putLong(NBTConstants.ENERGY, getEnergy());
        }

        return compoundTag;
    }
}
