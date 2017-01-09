package be.woutdev.clientworlds.api.location;

import be.woutdev.clientworlds.api.world.ClientWorld;
import org.bukkit.Location;
import org.bukkit.World;

/**
 * Created by Wout on 24/08/2016.
 */
public interface ClientLocation
{
    /**
     * Get the ClientWorld for this location.
     *
     * @return The ClientWorld for this location.
     */
    ClientWorld getWorld();

    /**
     * Get the x-coordinate for this location.
     *
     * @return The x-coordinate for this location.
     */
    int getX();

    /**
     * Set the x-coordinate for this location.
     *
     * @param x The x-coordinate
     */
    void setX(int x);

    /**
     * Get the y-coordinate for this location.
     *
     * @return The y-coordinate for this location.
     */
    int getY();

    /**
     * Set the y-coordinate for this location.
     *
     * @param y The y-coordinate
     */
    void setY(int y);

    /**
     * Get the z-coordinate for this location.
     *
     * @return The z-coordinate for this location.
     */
    int getZ();

    /**
     * Set the z-coordinate for this location.
     *
     * @param z The z-coordinate
     */
    void setZ(int z);

    /**
     * Construct a bukkit Location object from this object.
     *
     * @param world The world where this location should be in.
     *
     * @return The representing Bukkit Location object.
     */
    Location toLocation(World world);
}
