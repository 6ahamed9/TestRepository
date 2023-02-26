package dataTypes_operators;

public class ElseIf_Demo {

	public static void main(String[] args) {
		
		/**
		 *  Else if Syntax
		 *  
		 *  if (condition)
		 *  { 
		 *  code to executed
		 *  } else if (condition)
		 *  {
		 *  Code to be executed
		 *  } else
		 *  {
		 *  Code to be executed
		 *  }
		 */
		int age = 99;
		if (age >= 18 && age <= 80) {
			System.out.println("You must get married");
		} else if (age > 80 && age <= 129)
		{
			System.out.println("Pray to God that you are in good health");
		} else
		{
			System.out.println("You are too young!! \nwait for a while.");
		}
		
		
		
		
		
		

	}

}
