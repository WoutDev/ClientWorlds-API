package be.woutdev.clientworlds.api.framework;

import be.woutdev.clientworlds.api.world.ClientWorld;
import org.bukkit.World;
import org.bukkit.entity.Player;

/**
 * Created by Wout on 24/08/2016.
 */
public interface API
{
    /**
     * Create a new ClientWorld instance if the current server version is supported.
     *
     * @param world The bukkit world where this ClientWorld will be played in.
     *
     * @return A new ClientWorld instance.
     */
    ClientWorld createWorld(World world);

    /**
     * Check if the current server version is supported by ClientWorlds.
     *
     * @return If the current server version is supported by ClientWorlds.
     */
    boolean isSupported();

    /**
     * Check if the specified player is currently in a ClientWorld.
     *
     * @param p The player to check.
     *
     * @return If the specified player is in a ClientWorld or not.
     */
    boolean isInClientWorld(Player p);

    /**
     * Get the ClientWorld where the specified player is currently in.
     *
     * @param player The player to check.
     *
     * @return The ClientWorld or null where the specified player is currently in.
     */
    ClientWorld getWorld(Player player);
}
