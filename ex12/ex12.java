import java.util.Scanner;
public class ex12 {
	public static void main(String[] args) {


	Scanner scanner = new Scanner(System.in);
/*
	System.out.println("Enter a number: ");
	int value = scanner.nextInt();
	while(value != 5) {
	
		System.out.println("Enter a number: ");
		value = scanner.nextInt();
	}
	System.out.println("Nice! we got 5!");

*/
	int value = 0;
	do {
	System.out.println("enter a number: ");
	value = scanner.nextInt();
}
	while(value != 5);
	System.out.println("got 5!");
	}
}
