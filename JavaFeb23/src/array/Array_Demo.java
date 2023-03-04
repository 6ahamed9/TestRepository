package array;

public class Array_Demo {

	public static void main(String[] args) {

		// Declaring array
//		String[] myArray = new String[3];
//		//Assigning value to the array
//		myArray[0] = "Selenium";
//		myArray[1] = "Eclips";
//		myArray[2] = "Java";
//		
//		System.out.println(myArray[1]);
//		
//		for (int i=0; i<myArray.length; i++) {
//			System.out.println(myArray[i]);
//		}
//		
//		// another way of declaring the array
//		int [] number = {4,2,7};
//		for (int i=0; i<number.length; i++) {
//			System.out.println(number[i]);
//		}
//		
//		System.out.println("Example of enhanced for loop");
//		// Example of enhanced for loop
//		for (int v:number) {
//			System.out.println(v);
//		}

		// Practice
		String[] Array = new String[5];
		Array[0] = "Aam";
		Array[1] = "Jaam";
		Array[2] = "Kathal";
		Array[3] = "Anarosh";
		Array[4] = "Lychee";

		for (int i = 0; i < Array.length; i++) {
			System.out.println(Array[i]);
		}

		int[][] array = { { 5, 2, 8, 4 }, { 9, 6, 1, 3 } };
		System.out.println(array[0][2]);

	}

}
