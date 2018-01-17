
public class Badgers {

	public static void main(String[] args) {
		for (int j = 0; j < 3; j++) {

			for (int i = 0; i < 10; i++) {
				System.out.print("badger");
				if (i != 9) {
					System.out.print(",");

				}
			}
			System.out.println();

			for (int i = 0; i < 2; i++) {
				if (j == 2 && i != 1) {
					System.out.print("Mush-");}
				else {
					System.out.print("mushroom, ");
				}
			}
			System.out.println("a");
		}

	}
}
