package fr.game.entity.other;

public class Stats {

	private int attack, defense, attackSpeed, health, maxHealth, experience, level, saturation;

	public Stats(int attack, int defense, int attackSpeed, int health, int maxHealth, int experience, int level) {
		setAttack(attack);
		setDefense(defense);
		setAttackSpeed(attackSpeed);
		setHealth(health);
		setMaxHealth(maxHealth);
		setExperience(experience);
		setLevel(level);
	}

	public Stats(int attack, int defense, int attackSpeed, int health, int maxHealth) {
		this(attack, defense, attackSpeed, maxHealth, maxHealth, 0, 1);
	}

	public Stats(int attack, int defense, int attackSpeed, int health) {
		this(attack, defense, attackSpeed, health, health);
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getAttackSpeed() {
		return attackSpeed;
	}

	public void setAttackSpeed(int attackSpeed) {
		this.attackSpeed = attackSpeed;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getSaturation() {
		return saturation;
	}

	public void setSaturation(int saturation) {
		this.saturation = saturation;
	}

}
