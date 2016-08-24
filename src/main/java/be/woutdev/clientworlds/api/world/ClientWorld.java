package be.woutdev.clientworlds.api.world;

import be.woutdev.clientworlds.api.block.ClientBlock;
import org.bukkit.Location;
import org.bukkit.entity.Player;

/**
 * Created by Wout on 24/08/2016.
 */
public interface ClientWorld
{
    /**
     * Add a player to the ClientWorld. This will directly send updates to the player.
     * @param player The player to add.
     * @return If adding the player was successful or not.
     */
    boolean addPlayer(Player player);

    /**
     * Remove a player from the ClientWorld. This will directly update the world to its normal state. Be careful with the players location when using this.
     * @param player The player to remove.
     * @return If removing the player was successful or not.
     */
    boolean removePlayer(Player player);

    /**
     * Get a ClientBlock by location.
     * @param location The location.
     * @return The ClientBlock at that location.
     */
    ClientBlock getBlockAt(Location location);

    /**
     * Get a ClientBlock by coordinates.
     * @param x The x-coordinate.
     * @param y The y-coordinate.
     * @param z The z-coordinate.
     * @return The ClientBlock at the given coordinates.
     */
    ClientBlock getBlockAt(int x, int y, int z);

    /**
     * Hide the player from the observer.
     * @param observer The observer where the player should be hidden from.
     * @param player The player that should be hidden for the observer.
     * @return If this action went successful.
     */
    boolean hide(Player observer, Player player);

    /**
     * Show the player to the observer.
     * @param observer The observer where the player should be shown for.
     * @param player The player that should be shown for the observer.
     * @return If this action went successful.
     */
    boolean show(Player observer, Player player);
}
