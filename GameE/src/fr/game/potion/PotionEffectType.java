package fr.game.potion;

public enum PotionEffectType {

	HEALTH("Soins"), RESISTANCE("Resistance"), STRENGH("Force");

	private final String effectName;

	private PotionEffectType(final String effectName) {
		this.effectName = effectName;
	}

	public final String getEffectName() {
		return this.effectName;
	}

}
