package legendarium.replacer;

import legendarium.LIRegistry;
import lotr.common.item.LOTRItemSauronMace;

public class LIItemMace extends LOTRItemSauronMace {
	public LIItemMace() {
		super();
		initialize();
	}

	public void initialize() {
		LIRegistry.CONTENT.add(this);
	}
}