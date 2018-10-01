
public class WorkshopMethods {
	final char OBSTACLE = 'O';
	final char VISITED = 'v';
	final char WAY = 'W';

	public char[][] activate(int length, int width) {
		char[][] playfield = new char[width][length];
		for (int i = 0; i < playfield.length; i++) {
			for (int j = 0; j < playfield[0].length; j++) {
				playfield[i][j] = WAY;
				setObstacle(playfield);
			}
		}
		return playfield;
	}

	public char[][] print(char[][] playfield) {
		for (int i = 0; i < playfield.length; i++) {
			for (int j = 0; j < playfield[0].length; j++) {
				System.out.print(playfield[i][j] + " ");
			}
			System.out.println(" ");
		}
		return playfield;
	}

	public void setObstacle(char[][] playfield) {
		// left top -> right top
		for (int i = 0; i < playfield[0].length; i++) {
			playfield[0][i] = OBSTACLE;
		}
		// top left -> bottom left
		for (int i = 0; i < playfield.length; i++) {
			playfield[i][0] = OBSTACLE;
		}
		// top right -> bottom right
		for (int i = 0; i < playfield.length; i++) {
			playfield[i][playfield[0].length - 1] = OBSTACLE;
		}
		// bottom left -> bottom right
		for (int i = 0; i < playfield[0].length; i++) {
			playfield[playfield.length - 1][i] = OBSTACLE;
		}
	}
}
