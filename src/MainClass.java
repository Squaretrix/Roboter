
public class MainClass {

	public static void main(String[] args) {
		WorkshopMethods master = new WorkshopMethods();

		char[][] player = master.activate(38, 7);		//(length, width)

		master.print(player);
		
	}

}
