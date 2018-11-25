package branching;

import java.util.*;

public class complexconditionals {
	public static void main(String[] args) {
	
		Scanner reader = new Scanner(System.in);
		System.out.println("Type Now");
		String input = reader.next();
		String sOne = "abc";
		String sTwo = "z";
		
		//  and &&,  or || 
		
		
		
		if((input.contains(sOne) || input.contains(sTwo)) && false)
		{
			System.out.println("True");
		}
		
		else
			
		{
			System.out.println("False");
		}
		
		// boolean variable
		
		boolean bool1 = input.contains(sOne);
		boolean bool2 = input.contains(sTwo);
		
		
		if((bool1 || bool2) && false)
		
		
{
	System.out.println("True");
}

else
	
{
	System.out.println("Flase");
}
		
		
		
	}

}
