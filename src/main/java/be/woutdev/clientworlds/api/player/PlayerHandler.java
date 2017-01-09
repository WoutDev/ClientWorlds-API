package be.woutdev.clientworlds.api.player;

import org.bukkit.entity.Player;

import java.util.List;

/**
 * Created by Wout on 27/08/2016.
 */
public interface PlayerHandler
{
    /**
     * Add a player to the ClientWorld. This will directly send updates to the player.
     *
     * @param player The player to add.
     *
     * @return The ClientPlayer instance.
     */
    ClientPlayer addPlayer(Player player);

    /**
     * Remove a player from the ClientWorld. This will directly update the world to its normal state. Be careful with
     * the players location when using this.
     *
     * @param player The player to remove.
     */
    void removePlayer(Player player);

    /**
     * Get all the players currently in this ClientWorld.
     *
     * @return A list with all current players inside this ClientWorld.
     */
    List<ClientPlayer> getPlayers();
}
