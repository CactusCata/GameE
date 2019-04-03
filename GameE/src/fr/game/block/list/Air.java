package fr.game.block.list;

import fr.game.block.Block;
import fr.game.block.BlockType;
import fr.game.location.Location;

public class Air implements Block {

	private Location location;
	private BlockType blockType;

	{
		this.blockType = BlockType.AIR;
	}

	public Air(Location location) {
		this.location = location;
	}

	@Override
	public Location getLocation() {
		return this.location;
	}

	@Override
	public void setNewLocation(Location location) {
		removeBlock();
	}

	@Override
	public void removeBlock() {
		this.location.getWorld().removeBlock(this.location);

	}

	@Override
	public void removeBlock(BlockType blockType) {
		if (this.location.getWorld().getBlockAt(this.location).getBlockType() == blockType)
			this.location.getWorld().removeBlock(this.location);
	}

	@Override
	public BlockType getBlockType() {
		return this.blockType;
	}

	@Override
	public String getBlockName() {
		return this.blockType.getDefaultBlockName();
	}

}
