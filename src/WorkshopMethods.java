
public class WorkshopMethods {
	final char OBSTACLE = 'O';
	final char VISITED = 'v';
	final char WAY = 'W';

	public char[][] activate(int width, int length) {
		char[][] playfield = new char[width][length];
		for (int i = 0; i < playfield[0].length; i++) {
			for (int j = 0; j < playfield.length; j++) {
				playfield[j][i] = WAY;
			}
		}
		return playfield;
	}

	public char[][] print(char[][] playfield) {
		for (int i = 0; i < playfield[0].length; i++) {
			for (int j = 0; j < playfield.length; j++) {
				System.out.print(playfield[j][i]+" ");
			}
			System.out.println(" ");
		}
		return playfield;
	}
	public void 
}
