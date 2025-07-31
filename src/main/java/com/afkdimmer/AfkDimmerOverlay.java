package com.afkdimmer;

import net.runelite.api.Client;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;

import javax.inject.Inject;
import java.awt.*;

public class AfkDimmerOverlay extends Overlay {

    public final AfkDimmerConfig config;
    public final AfkDimmerPlugin plugin;
    public final Client client;

    @Inject
    public AfkDimmerOverlay(AfkDimmerPlugin plugin, AfkDimmerConfig config, Client client) {

        super(plugin);

        this.plugin = plugin;
        this.config = config;
        this.client = client;

        setPosition(OverlayPosition.DYNAMIC);
        setPriority(OverlayPriority.LOW);
        setLayer(OverlayLayer.ABOVE_SCENE);

    }

    public Dimension render(Graphics2D graphics) {

        if (plugin.dimmerEnabled) {
            int dimmerStrengthPercent = config.dimmerStrength()/100;
            graphics.setColor(new Color(0, 0, 0, (dimmerStrengthPercent)));
            graphics.fill(client.getCanvas().getBounds());

        }

        return null;
    }

}