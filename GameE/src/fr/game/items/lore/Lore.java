package fr.game.items.lore;

import java.util.ArrayList;
import java.util.List;

public class Lore {

	private List<String> lore;

	{
		this.lore = new ArrayList<>();
	}

	public Lore(List<String> lore) {
		this.lore = lore;
	}

	public Lore() {

	}

	public void addLore(String lore) {
		this.lore.add(lore);
	}

	public void removeLore(String lore) {
		this.lore.remove(lore);
	}

	public void removeLore(int height) {
		this.lore.remove(height);
	}

	public List<String> getLore() {
		return this.lore;
	}

	public String getLine(int height) {
		return this.lore.get(height);
	}

	public void setLore(List<String> lore) {
		this.lore = lore;
	}

}
