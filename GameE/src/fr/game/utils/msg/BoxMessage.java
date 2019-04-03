package fr.game.utils.msg;

import javax.swing.JOptionPane;

public class BoxMessage implements MessageType {

	@Override
	public void sendMessage(String message) {
		JOptionPane.showMessageDialog(null, message);
	}

	@Override
	public int getIntResponse(String message) {
		try {
			return Integer.parseInt(JOptionPane.showInputDialog(message));
		} catch (NumberFormatException e) {
			throw new NumberFormatException("Erreur : " + message + " n'est pas un nombre entier correct !");
		}
	}

	@Override
	public double getDoubleResponse(String message) {
		try {
			return Double.parseDouble(JOptionPane.showInputDialog(message));
		} catch (NumberFormatException e) {
			throw new NumberFormatException("Erreur : " + message + " n'est pas un nombre à virgule correct !");
		}
	}

}
