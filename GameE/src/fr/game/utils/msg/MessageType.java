package fr.game.utils.msg;

public interface MessageType {

	public void sendMessage(String message);

	public int getIntResponse(String message);

	public double getDoubleResponse(String message);

}
