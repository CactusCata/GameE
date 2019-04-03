package fr.game.entity;

import fr.game.entity.list.Player;
import fr.game.entity.list.Zombie;

public enum EntityType {

	PLAYER("Joueur", 1, Player.class), ZOMBIE("Zombie", 2, Zombie.class);

	private final String defaultName;
	private final int id;
	private final Class<? extends Entity> entityClass;

	private EntityType(final String defaultName, final int id, final Class<? extends Entity> entityClass) {
		this.defaultName = defaultName;
		this.id = id;
		this.entityClass = entityClass;
	}

	public final String getDefaultName() {
		return this.defaultName;
	}

	public final int getID() {
		return this.id;
	}

	public final Class<? extends Entity> getEntityClass() {
		return this.entityClass;
	}

}
