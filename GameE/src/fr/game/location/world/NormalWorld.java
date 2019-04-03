package fr.game.location.world;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import fr.game.block.Block;
import fr.game.block.BlockType;
import fr.game.block.list.Air;
import fr.game.block.list.Dirt;
import fr.game.block.list.Grass;
import fr.game.block.list.Stone;
import fr.game.entity.Entity;
import fr.game.location.Location;

public class NormalWorld implements World {

	private WorldType worldType;
	private List<Entity> onlineEntity;
	private Block[][][] block;

	{
		this.worldType = WorldType.DEFAULT;
		this.block = new Block[2048][2048][2048];
		this.onlineEntity = new ArrayList<>();
	}

	@Override
	public String getName() {
		return this.worldType.getDefaultWorldName();
	}

	@Override
	public WorldType getWorldType() {
		return this.worldType;
	}

	@Override
	public List<Entity> getOnlinEntity() {
		return this.onlineEntity;
	}

	@Override
	public void registerEntity(Entity entity) {
		this.onlineEntity.add(entity);

	}

	@Override
	public void removeEntity(Entity entity) {
		this.onlineEntity.remove(entity);

	}

	@Override
	public Block getBlockAt(Location location) {
		return this.block[location.getX()][location.getY()][location.getZ()];
	}

	@Override
	public void generate() {
		clear();
		for (int x = 0; x < 2048; x++)
			for (int z = 0; z < 2048; z++) {
				int y = 0;
				while (y <= 12) {

					while (y <= 10) {
						this.block[x][y][z] = new Stone(new Location(this, x, y, z));
						y++;
					}
					this.block[x][y][z] = new Dirt(new Location(this, x, y, z));
					y++;
					if (new Random().nextBoolean())
						this.block[x][y][z] = new Dirt(new Location(this, x, y, z));
					else
						this.block[x][y][z] = new Grass(new Location(this, x, y, z));

				}
				for (; y < 2048; y++)
					this.block[x][y][z] = new Air(new Location(this, x, y, z));
			}

	}

	@Override
	public void clear() {
		for (int x = 0; x < 2048; x++)
			for (int y = 0; y < 2048; y++)
				for (int z = 0; z < 2048; z++)
					this.block[x][y][z] = new Air(new Location(this, x, y, z));

	}

	@Override
	public Location getMaxHeight(int x, int z) {

		int y = 0;
		while (this.block[x][y][z].getBlockType() != BlockType.AIR)
			y++;

		return new Location(this, x, y, z);

	}

	@Override
	public void addBlock(Block block) {
		this.block[block.getLocation().getX()][block.getLocation().getY()][block.getLocation().getZ()] = block;

	}

	@Override
	public void removeBlock(Location location) {
		this.block[location.getX()][location.getY()][location.getZ()] = new Air(location);

	}

}
