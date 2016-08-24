package be.woutdev.clientworlds.api.location;

import be.woutdev.clientworlds.api.world.ClientWorld;

/**
 * Created by Wout on 24/08/2016.
 */
public interface ClientLocation
{
    /**
     * Get the ClientWorld for this location.
     * @return The ClientWorld for this location.
     */
    ClientWorld getWorld();

    /**
     * Get the x-coordinate for this location.
     * @return The x-coordinate for this location.
     */
    int getX();

    /**
     * Get the y-coordinate for this location.
     * @return The y-coordinate for this location.
     */
    int getY();

    /**
     * Get the z-coordinate for this location.
     * @return The z-coordinate for this location.
     */
    int getZ();

    /**
     * Set the x-coordinate for this location.
     * @param x The x-coordinate
     */
    void setX(int x);

    /**
     * Set the y-coordinate for this location.
     * @param y The y-coordinate
     */
    void setY(int y);

    /**
     * Set the z-coordinate for this location.
     * @param z The z-coordinate
     */
    void setZ(int z);
}
