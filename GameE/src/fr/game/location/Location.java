package fr.game.location;

import fr.game.block.Block;
import fr.game.location.world.World;

public class Location {

	private World world;
	private int x;
	private int y;
	private int z;
	private int yaw;
	private int pitch;

	public Location(World world, int x, int y, int z, int yaw, int pitch) {
		this.world = world;
		this.x = x;
		this.y = y;
		this.z = z;
		this.yaw = yaw;
		this.pitch = pitch;
	}

	public Location(World world, int x, int y, int z) {
		this(world, x, y, z, 0, 0);
	}

	public Block getBlockAt(Location location) {
		return this.world.getBlockAt(location);
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public int getZ() {
		return this.z;
	}

	public int getYaw() {
		return this.yaw;
	}

	public int getPitch() {
		return this.pitch;
	}

	public World getWorld() {
		return this.world;
	}
}
