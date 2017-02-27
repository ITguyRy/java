import java.util.Scanner;
public class counting {
  public static void main(String[] args) {
    int count = 0;
    Scanner input = new Scanner(System.in);

    System.out.println("This is a counting application.\n \nEnter a number you would like to count up to.");
    int num = input.nextInt();

    if(num % 2 == 0){
      count = 0;
    }
    else if(num % 1 == 1){
      count = 1;
    }

    while(num >= count) {

      System.out.println(count);

      count++;
    }
  }
}
