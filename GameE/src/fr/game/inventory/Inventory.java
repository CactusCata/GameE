package fr.game.inventory;

import fr.game.entity.Entity;
import fr.game.items.Item;

public class Inventory {

	private Item[] items;
	private int maxSize;
	private String inventoryName;
	private InventoryType inventoryType;
	private Entity owner;

	public Inventory(Entity owner, InventoryType inventoryType) {
		this.inventoryType = inventoryType;
		this.items = new Item[this.inventoryType.getDefaultSize()];
		this.maxSize = this.items.length;
		this.owner = owner;
		this.inventoryName = this.inventoryType.getDefaultInventoryName();
	}

	public final Item[] getContent() {
		return this.items;
	}

	public final void addItem(Item item) {

	}

	public final void setItem(Item item, int slot) {
		if (slot > this.maxSize)
			throw new InternalError(
					"Vous avez dépassé la taille max de l'inventaire : " + slot + " --> " + this.maxSize + " !");
		this.items[slot] = item;
	}

	public final Entity getOwner() {
		return this.owner;
	}

	public final String getInventoryName() {
		return this.inventoryName;
	}

}
