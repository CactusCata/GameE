package fr.game.entity.list;

import fr.game.entity.Entity;
import fr.game.entity.EntityExp;
import fr.game.inventory.Inventory;
import fr.game.items.Item;
import fr.game.location.Location;
import fr.game.potion.PotionEffect;
import fr.game.potion.PotionEffectType;

public class Zombie implements EntityExp {

	@Override
	public String getDefaultName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCustomName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCustomName(String newCustomName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getAttack() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getDefense() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getSpeedAction() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getHealth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getMaxHealth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSaturations() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setAttack(double newAttack) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDefense(double newDefense) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSpeedAction(double newSpeedAttack) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setHealth(double newHealth) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMaxHealth(double newMaxHealth) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSaturation(int newSaturation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Inventory getInventory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item getItemInMainHand() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item getItemInOffHand() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item[] getArmorItem() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setItemInMainHand(Item newItemInHand) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setItemInOffHand(Item newItemInOffHand) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setArmorItem(Item[] newArmorsItems) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isDead() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setDeath() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPotionEffect(PotionEffectType newPotionEffect) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPotionEffect(PotionEffect newPotionEffect) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePotionEffect(PotionEffectType potionEffectType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setRandomStats() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendDamageEntity(Entity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void takeDamageEntity(Entity entiry) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Location getLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void teleport(Location newLocation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendMessage(String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getLevel() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getExperience() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setLevel(int level) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setExperience(int experience) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addLevel(int level) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addExperience(int experience) {
		// TODO Auto-generated method stub
		
	}

}
