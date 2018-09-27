
public class MainClass {

	public static void main(String[] args) {
		WorkshopMethods master = new WorkshopMethods();

		char[][] player = master.activate(5, 5);

		master.print(player);
	}

}
