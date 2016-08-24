package be.woutdev.clientworlds.api.framework;

import be.woutdev.clientworlds.api.world.ClientWorld;

/**
 * Created by Wout on 24/08/2016.
 */
public interface API
{
    /**
     * Create a new ClientWorld instance if the current server version is supported.
     * @return A new ClientWorld instance.
     */
    ClientWorld createWorld();

    /**
     * Check if the current server version is supported by ClientWorlds.
     * @return If the current server version is supported by ClientWorlds.
     */
    boolean isSupported();
}
