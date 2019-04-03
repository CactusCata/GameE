package fr.game.main;

import fr.game.game.Game;
import fr.game.utils.msg.EMessage;

public class Start {

	public final static void main(String[] args) {
		new Start();
	}

	public Start() {

		Game game = new Game(EMessage.CONSOLE_MESSAGE);
	
		game.getUtils().sendMessage("Bonjour");

	}

}
