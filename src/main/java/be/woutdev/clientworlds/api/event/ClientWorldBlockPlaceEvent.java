package be.woutdev.clientworlds.api.event;

import be.woutdev.clientworlds.api.block.ClientBlock;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Created by Wout on 24/08/2016.
 */
public class ClientWorldBlockPlaceEvent extends Event implements Cancellable
{
    private static final HandlerList handlers = new HandlerList();
    private final Player player;
    private final ClientBlock block;
    private boolean cancelled;
    private String cancelMessage;

    public ClientWorldBlockPlaceEvent(Player player, ClientBlock block)
    {
        this.player = player;
        this.block = block;
        this.cancelled = false;
        this.cancelMessage = "";
    }

    @Override
    public boolean isCancelled()
    {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean b)
    {
        cancelled = b;
    }

    public String getCancelMessage()
    {
        return cancelMessage;
    }

    public void setCancelMessage(String cancelMessage)
    {
        this.cancelMessage = cancelMessage;
    }

    public Player getPlayer()
    {
        return player;
    }

    public ClientBlock getBlock()
    {
        return block;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}
