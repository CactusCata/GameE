package fr.game.entity;

import fr.game.inventory.Inventory;
import fr.game.items.Item;
import fr.game.location.Location;
import fr.game.potion.PotionEffect;
import fr.game.potion.PotionEffectType;

public interface Entity {

	public String getDefaultName();

	public String getCustomName();

	public void setCustomName(String newCustomName);

	public double getAttack();

	public double getDefense();

	public double getSpeedAction();

	public double getHealth();

	public double getMaxHealth();

	public int getSaturations();

	public void setAttack(double newAttack);

	public void setDefense(double newDefense);

	public void setSpeedAction(double newSpeedAttack);

	public void setHealth(double newHealth);

	public void setMaxHealth(double newMaxHealth);

	public void setSaturation(int newSaturation);

	public Inventory getInventory();

	public Item getItemInMainHand();

	public Item getItemInOffHand();

	public Item[] getArmorItem();

	public void setItemInMainHand(Item newItemInHand);

	public void setItemInOffHand(Item newItemInOffHand);

	public void setArmorItem(Item[] newArmorsItems);

	public boolean isDead();

	public void setDeath();

	public void addPotionEffect(PotionEffectType newPotionEffect);

	public void addPotionEffect(PotionEffect newPotionEffect);

	public void removePotionEffect(PotionEffectType potionEffectType);

	public void setRandomStats();

	public void sendDamageEntity(Entity entity);

	public void takeDamageEntity(Entity entiry);

	public Location getLocation();

	public void teleport(Location newLocation);

	public void sendMessage(String message);

}
