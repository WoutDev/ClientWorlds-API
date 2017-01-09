package be.woutdev.clientworlds.api.entity;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;

import java.util.List;

/**
 * Created by Wout on 27/08/2016.
 */
public interface EntityHandler
{
    /**
     * Spawn an entity only visible for the players inside this ClientWorld.
     *
     * @param location The location where to spawn the entity.
     * @param type The type of entity.
     *
     * @return The ClientEntity created.
     */
    ClientEntity addEntity(Location location, EntityType type);

    /**
     * Remove the specified ClientEntity from the ClientWorld.
     *
     * @param entity The ClientEntity to remove.
     */
    void removeEntity(ClientEntity entity);

    /**
     * Get all the ClientEntities currently in this ClientWorld.
     *
     * @return A list with all ClientEntities in this ClientWorld.
     */
    List<ClientEntity> getEntities();
}
