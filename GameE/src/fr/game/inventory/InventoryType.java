package fr.game.inventory;

public enum InventoryType {

	PLAYER("Inventaire de joueur", 45), CHEST("Inventaire de coffre", 54), ENTITY("Inventaire", 9000000);

	private final String defaultInventoryName;
	private final int defaultSize;

	private InventoryType(final String defaultInventoryName, final int defaultSize) {
		this.defaultInventoryName = defaultInventoryName;
		this.defaultSize = defaultSize;
	}

	public final String getDefaultInventoryName() {
		return this.defaultInventoryName;
	}

	public final int getDefaultSize() {
		return this.defaultSize;
	}

}
