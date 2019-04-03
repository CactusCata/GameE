package fr.game.entity;

public interface EntityExp extends Entity {

	public int getLevel();

	public int getExperience();

	public void setLevel(int level);

	public void setExperience(int experience);

	public void addLevel(int level);

	public void addExperience(int experience);

}
