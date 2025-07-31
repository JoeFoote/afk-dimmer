package com.afkdimmer;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;

@ConfigGroup("example")
public interface AfkDimmerConfig extends Config
{
	String GROUP = "afkDimmer";
	@ConfigItem(
		position = 1,
		keyName = "dimmerStrength",
		name = "Dimmer Strength",
		description = "Sets the strength of the dimmer."
	)
	@Range(
			min = 0,
			max = 100
	)

	default int dimmerStrength(){
		return 0;
	}
}
