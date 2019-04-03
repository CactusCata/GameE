package fr.game.game;

public class Running {

	private boolean running;

	public Running(boolean running) {
		setRunning(running);
	}

	public Running() {
		this(true);
	}

	public final void setRunning(boolean running) {
		this.running = running;
	}

	public final void toggleRunning() {
		setRunning(!this.running);
	}

	public final boolean isRunning() {
		return this.running;
	}

}
