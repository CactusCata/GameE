package fr.game.location.world;

public enum WorldType {

	DEFAULT("Monde normal"), HELL("Enfer"), HEAVEN("Paradis");

	private final String defaultWorldName;

	private WorldType(final String defaultWorldName) {
		this.defaultWorldName = defaultWorldName;
	}

	public final String getDefaultWorldName() {
		return this.defaultWorldName;
	}

}
