package be.woutdev.clientworlds.api.world;

import be.woutdev.clientworlds.api.block.BlockHandler;
import be.woutdev.clientworlds.api.entity.EntityHandler;
import be.woutdev.clientworlds.api.player.PlayerHandler;
import org.bukkit.World;
import org.bukkit.entity.Entity;

import java.util.Set;

/**
 * Created by Wout on 24/08/2016.
 */
public interface ClientWorld
{
    /**
     * Get the BlockHandler used in this ClientWorld.
     *
     * @return The BlockHandler used in this ClientWorld.
     */
    BlockHandler getBlockHandler();

    /**
     * Get the EntityHandler used in this ClientWorld.
     *
     * @return The EntityHandler used in this ClientWorld.
     */
    EntityHandler getEntityHandler();

    /**
     * Get the PlayerHandler used in this ClientWorld.
     *
     * @return The PlayerHandler used in this ClientWorld.
     */
    PlayerHandler getPlayerHandler();

    /**
     * Get a Set of all entities which are NOT part of this ClientWorld instance but are in the same bukkit world. This
     * Set could also include Players as Entity objects.
     *
     * @return A Set of all entities which are NOT part of this ClientWorld instance but are in the same bukkit world.
     */
    Set<Entity> getNonParticipants();

    /**
     * Get the Bukkit world associated with this ClientWorld.
     *
     * @return The Bukkit world associated with this ClientWorld.
     */
    World getBukkitWorld();
}
