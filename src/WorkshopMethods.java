
public class WorkshopMethods {
	final char OBSTACLE = 'O';
	final char VISITED = 'v';
	final char WAY = 'W';

	public char[][] activate(int width, int length) {
		char[][] playfield = new char[length][width];
		for (int i = 0; i < playfield[0].length; i++) {
			for (int j = 0; j < playfield.length; j++) {
				playfield[j][i] = WAY;
				setObstacle(playfield);
			}
		}
		return playfield;
	}

	public char[][] print(char[][] playfield) {
		for (int i = 0; i < playfield[0].length; i++) {
			for (int j = 0; j < playfield.length; j++) {
				System.out.print(playfield[j][i] + " ");
			}
			System.out.println(" ");
		}
		return playfield;
	}

	public void setObstacle(char[][] playfield) {
		// left -> right top
		for (int i = 0; i < playfield.length; i++) {
			playfield[i][0] = OBSTACLE;
		}
		// left -> left down
		for (int i = 0; i < playfield[0].length; i++) {
			playfield[0][i] = OBSTACLE;
		}
		// right top -> right down
		for (int i = 0; i < playfield.length; i++) {
			playfield[playfield[0].length - 1][i] = OBSTACLE;
		}
		// left -> right bottom
		for (int i = 0; i < playfield.length; i++) {
			playfield[i][playfield.length-1] = OBSTACLE;
		}
	}
}
