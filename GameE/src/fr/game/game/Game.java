package fr.game.game;

import java.util.List;

import fr.game.entity.Entity;
import fr.game.location.world.World;
import fr.game.utils.Utils;
import fr.game.utils.msg.EMessage;
import fr.game.utils.msg.MessageType;

public class Game {

	private Running running;
	private Utils utils;
	private List<World> worlds;

	private Game(boolean running, MessageType messageType) {
		this.running = new Running(running);
		this.utils = new Utils(messageType);
	}

	private Game(MessageType messageFormat) {
		this(true, messageFormat);
	}

	public Game(EMessage messageFormat) {
		this(messageFormat.getMessageFormat());
	}

	public final Running getRunning() {
		return this.running;
	}

	public final Utils getUtils() {
		return this.utils;
	}

	public final void registerNewWorld(World world) {
		this.worlds.add(world);
	}
	
	public final void registerNewEntity(Entity entity, World world){
		world.registerEntity(entity);
	}

}
