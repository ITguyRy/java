import java.util.Scanner;
public class grocery {
	public static void main(String[] args) {
	Scanner answer = new Scanner(System.in);
	System.out.println("Would you like to see your grocery list? ");
	answer = nextLine();

	switch(answer){
		case "yes":

		String[] fruits = {"apples","bananas","grapes","oranges"};
		for(int i=0; i < fruits.length; i++){
			System.out.println(fruits[i]);
	}

		String[] meat = {"Steak","chicken","Sausages","pork"};
		for(int i = 0; i < meat.length; i++) {
			System.out.println(meat[i]);

	}

	case "no" :

	System.out.println("have a nice day");
}

}

}
