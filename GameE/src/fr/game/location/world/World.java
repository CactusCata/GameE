package fr.game.location.world;

import java.util.List;

import fr.game.block.Block;
import fr.game.entity.Entity;
import fr.game.location.Location;

public interface World {

	public String getName();

	public WorldType getWorldType();

	public List<Entity> getOnlinEntity();

	public void registerEntity(Entity entity);

	public void removeEntity(Entity entity);

	public void addBlock(Block block);

	public void removeBlock(Location location);

	public Block getBlockAt(Location location);

	public void generate();

	public void clear();

	public Location getMaxHeight(int x, int z);

}
