import java.awt.BorderLayout;

import javax.swing.JFrame;

import my.games.geometry.game.Client;

public class Application {
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		Client client = new Client();
		JFrame frame = new JFrame("Geometry game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 700);
		frame.setResizable(false);
		frame.add(client.getRenderEngine().getCamera(1), BorderLayout.LINE_START);
		frame.add(client.getRenderEngine().getCamera(2), BorderLayout.LINE_END);
		frame.add(client.getRenderEngine().getCamera(3), BorderLayout.PAGE_END);
		frame.setVisible(true);
		frame.setFocusable(true); // important call to allow listening to keys
		frame.addKeyListener(client.getController());
		client.start();
	}
}
