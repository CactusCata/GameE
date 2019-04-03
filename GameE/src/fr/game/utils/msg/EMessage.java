package fr.game.utils.msg;

public enum EMessage {

	BOX_MESSAGE(new BoxMessage()), CONSOLE_MESSAGE(new BoxMessage());

	private final MessageType messageType;

	private EMessage(final MessageType messageType) {
		this.messageType = messageType;
	}

	public final MessageType getMessageFormat() {
		return this.messageType;
	}

}
