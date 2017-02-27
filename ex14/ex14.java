public class ex14 {
	public static void main(String[] args) {

	int value = 7;

	int[] values;

	values = new int[3];

	System.out.println(values[0]);

	values[0] = 10;
	values[1] = 20;
	values[2] = 30;

	System.out.println(values[0]);
	System.out.println(values[1]);
	System.out.println(values[2]);

	for(int i = 0; i < values.length; i++) {
		System.out.println(values[i]);
	}

	int[] numbers = {100,200,300,400};

	for(int b=0; b < numbers.length; b++){
		System.out.println(numbers[b]);

	}
}

}
