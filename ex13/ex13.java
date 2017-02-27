import java.util.Scanner;
public class ex13 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a command: ");
		String text = input.nextLine();

		switch(text) { // common uses for switches are for constants that are int or string
			case "start":

				System.out.println("Machine Started!");
				for (int count = 0; -1 < count; count++) {
					System.out.println(count);

					if (count == 50000) {
						break;
			}
}
			case "stop":

				System.out.println("Machine Stopped.");
				break;

			default:
				System.out.println("Command not recognized");
		}
}

}
