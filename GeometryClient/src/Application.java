import javax.swing.SwingUtilities;

import my.games.geometry.game.Client;
import my.games.geometry.game.ClientWindow;

public class Application {
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		// LoginWindow loginWindow = new LoginWindow();
		// SwingUtilities.invokeLater(loginWindow);
		// while (loginWindow.isLogButtClicked() == false) {
		// }
		Client client = new Client();
		client.start();
		ClientWindow window = new ClientWindow(client);
		SwingUtilities.invokeLater(window);

	}
}
