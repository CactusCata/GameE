package fr.game.block;

import fr.game.location.Location;

public interface Block {

	public Location getLocation();

	public void setNewLocation(Location location);

	public void removeBlock();

	public void removeBlock(BlockType blockType);

	public BlockType getBlockType();

	public String getBlockName();

}
