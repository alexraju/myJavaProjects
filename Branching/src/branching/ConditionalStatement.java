package branching;
import java.util.*;

public class ConditionalStatement {
	
	public static void main(String[] args) {
	
		Scanner reader = new Scanner(System.in);
		System.out.println("input now: ");
			
		
		int input2 = reader.nextInt();
		
		if(input2 > 10)
		
		
		{
			System.out.println("More!");
		}
		
		if(input2 <= 10)
		
		{
			System.out.println("Less!");
		}
		
		
		
		// another way of writing
		
		System.out.println("type now");
		
		int input3 = reader.nextInt();
		
		if(input3 > 30)
			
		{
			System.out.println("Greater");
		}
		
		else
		{
			System.out.println("Lesser");	
		}
		
		// with string
		
		System.out.println("Input String ");
		String input4 = reader.next();
		
		if(input4 == "password")
		
		 // or if(input.equals("password");
		
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
		  
	}
		

}
