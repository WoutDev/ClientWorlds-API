package be.woutdev.clientworlds.api.block;

import org.bukkit.Chunk;
import org.bukkit.Location;

import java.util.Map;
import java.util.Set;

/**
 * Created by Wout on 27/08/2016.
 */
public interface BlockHandler
{
    /**
     * Get a ClientBlock by location.
     *
     * @param location The location.
     *
     * @return The ClientBlock at that location.
     */
    ClientBlock getBlockAt(Location location);

    /**
     * Get all ClientBlocks.
     *
     * @return A list with all the ClientBlocks for this ClientWorld.
     */
    Set<ClientBlock> getBlocks();

    /**
     * Get all ClientBlocks, but sorted by Chunk.
     *
     * @return A map with all the ClientBlocks for this ClientWorld, sorted by Chunk.
     */
    Map<Chunk, Set<ClientBlock>> getBlocksSorted();
}
