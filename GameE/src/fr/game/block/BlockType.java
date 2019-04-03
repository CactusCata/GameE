package fr.game.block;

public enum BlockType {

	AIR("Air", 0), STONE("Pierre", 1), DIRT("Terre", 2), GRASS("Herbe", 3), COAL_ORE("Minerais de charbon",
			10), IRON_ORE("Minerais de fer", 11);

	private final String defaultBlockName;
	private final int ID;

	private BlockType(final String defaultBlockName, final int ID) {
		this.defaultBlockName = defaultBlockName;
		this.ID = ID;
	}

	public final String getDefaultBlockName() {
		return this.defaultBlockName;
	}

	public final int getID() {
		return this.ID;
	}

}
