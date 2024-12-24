package dev.geco.gsit.api.event;

import org.jetbrains.annotations.*;

import org.bukkit.event.*;
import org.bukkit.event.server.*;

import dev.geco.gsit.GSitMain;

public class GSitReloadEvent extends PluginEvent implements Cancellable {

    private static final HandlerList HANDLERS = new HandlerList();
    private boolean cancel = false;

    private final GSitMain GPM;

    public GSitReloadEvent(GSitMain GPluginMain) {
        super(GPluginMain);
        GPM = GPluginMain;
    }

    public @NotNull GSitMain getPlugin() { return GPM; }

    public @NotNull HandlerList getHandlers() { return HANDLERS; }

    public static HandlerList getHandlerList() { return HANDLERS; }

    public boolean isCancelled() { return cancel; }

    public void setCancelled(boolean Cancel) { cancel = Cancel; }

}