package dataTypes_operators;

public class Do_While_Loop {

	public static void main(String[] args) {
		
		/**Syntax for do while loop
		 * initialization;
		 * do{
		 * // statement
		 * increment/decrement
		 * } while (condition)
		 */
		// do while loop run at lest run once even the condition is not true
		
		String myPlace = "Brooklyn";
		int start = 1;
		
		do {
			System.out.println("I am from "+myPlace);
			start++;
		}while(start<=3);
		

	}

}
