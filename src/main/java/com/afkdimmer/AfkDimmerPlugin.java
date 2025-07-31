package com.afkdimmer;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

@Slf4j
@PluginDescriptor(
	name = "Afk Dimmer"
)
public class AfkDimmerPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private AfkDimmerConfig config;

	public boolean dimmerEnabled;

	@Override
	protected void startUp() throws Exception
	{
		log.info("Example started!");
	}

	@Override
	protected void shutDown() throws Exception
	{
		log.info("Example stopped!");
	}


	@Provides
	AfkDimmerConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(AfkDimmerConfig.class);
	}
}
