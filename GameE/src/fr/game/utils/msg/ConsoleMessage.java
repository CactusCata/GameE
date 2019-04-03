package fr.game.utils.msg;

import java.util.Scanner;

public class ConsoleMessage implements MessageType {

	private Scanner scanner = new Scanner(System.in);

	@Override
	public void sendMessage(String message) {
		System.out.println(message);
	}

	@Override
	public int getIntResponse(String message) {
		try {
			return this.scanner.nextInt();
		} catch (NumberFormatException e) {
			throw new NumberFormatException("Erreur : " + message + " n'est pas un nombre entier correct !");
		}
	}

	@Override
	public double getDoubleResponse(String message) {
		try {
			return this.scanner.nextDouble();
		} catch (NumberFormatException e) {
			throw new NumberFormatException("Erreur : " + message + " n'est pas un nombre à virgule correct !");
		}
	}

}
