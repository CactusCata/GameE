package fr.game.utils;

import fr.game.utils.msg.MessageType;

public class Utils {

	private MessageType message;

	public Utils(MessageType message) {
		this.message = message;
	}

	public final void sendMessage(String message) {
		this.message.sendMessage(message);
	}

	public final int getIntResponse(String message) {
		return this.message.getIntResponse(message);
	}

	public final double getDoubleResponse(String message) {
		return this.message.getDoubleResponse(message);
	}

}
