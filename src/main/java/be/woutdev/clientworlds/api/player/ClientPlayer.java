package be.woutdev.clientworlds.api.player;

import be.woutdev.clientworlds.api.world.ClientWorld;
import org.bukkit.entity.Player;

/**
 * Created by Wout on 27/08/2016.
 */
public interface ClientPlayer
{
    /**
     * Get the ClientWorld this player is currently in.
     *
     * @return The ClientWorld this player is currently in.
     */
    ClientWorld getWorld();

    /**
     * Get the Bukkit Player instance for this ClientPlayer.
     *
     * @return The Bukkit Player instance for this ClientPlayer.
     */
    Player getPlayer();
}
