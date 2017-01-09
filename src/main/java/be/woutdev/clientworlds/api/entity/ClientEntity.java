package be.woutdev.clientworlds.api.entity;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;

import java.util.UUID;

/**
 * Created by Wout on 27/08/2016.
 */
public interface ClientEntity
{
    /**
     * Get the unique identifier used in ClientWorlds to differentiate different entities.
     *
     * @return The unique identifier of this ClientEntity.
     */
    UUID getId();

    /**
     * Get the EntityType of this ClientEntity.
     *
     * @return The EntityType of this ClientEntity.
     */
    EntityType getType();

    /**
     * Get the current location of this ClientEntity.
     *
     * @return The Location of this ClientEntity.
     */
    Location getLocation();
}
