package fr.game.potion;

public interface PotionEffect {

	public String getEffectName();

	public int getLevel();

	public void setLevel();

	public PotionEffectType getPotionEffectType();

	public long getDuration();

	public void setDuration(long duration);

}
