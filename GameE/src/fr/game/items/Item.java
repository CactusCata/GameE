package fr.game.items;

import fr.game.items.lore.Lore;

public interface Item {

	public String getDefaultName();

	public String getDisplayName();

	public void setDisplayName(String displayName);

	public Lore getLore();

	public ItemType getItemType();

}
