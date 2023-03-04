package action_Item2;

public class Question_5 {

	public static void main(String[] args) {
		int sum = 0;
		// Printing 0 to 15 by using For Loop
		for (int i=0; i<=15; i++) {
			sum = sum + i;
		}
		System.out.println("The sum of 0 to 15 is: "+sum);
		
		
		// Printing 0 to 15 by using While Loop
		int sum1 = 0;
		int i = 0;
		while (i<=15) {
			i++;
			sum = sum + i;
			
		}
		System.out.println("The sum of 0 to 15 is: "+sum1);
		
		
		// Printing 0 to 15 by using Do While Loop
		int j = 0;
		do {
			System.out.println(j);
			j++;
		}while (j<=15);

	}

}
