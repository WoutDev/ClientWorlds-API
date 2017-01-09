package be.woutdev.clientworlds.api.block;

import be.woutdev.clientworlds.api.location.ClientLocation;
import org.bukkit.Material;
import org.bukkit.material.MaterialData;

/**
 * Created by Wout on 24/08/2016.
 */
public interface ClientBlock
{
    /**
     * Get the type of the block.
     *
     * @return The Material of the block.
     */
    Material getType();

    /**
     * Set the type of the block.
     *
     * @param type The Material of the block.
     */
    void setType(Material type);

    /**
     * Get the MaterialData of this block.
     *
     * @return The MaterialData of this block.
     */
    MaterialData getData();

    /**
     * Set the MaterialData for this block.
     *
     * @param data The MaterialData to set.
     */
    void setData(MaterialData data);

    /**
     * Get the ClientLocation where this block is at.
     *
     * @return The ClientLocation
     */
    ClientLocation getLocation();

    /**
     * Check if this block is a block in the actual world or not.
     *
     * @return If this block is real, and therefor the same in the normal world.
     */
    boolean isReal();

    /**
     * Update this block to all players in the ClientWorld.
     *
     * @return If the update was successful.
     */
    boolean update();
}
