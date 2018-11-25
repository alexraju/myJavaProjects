package branching;

import java.util.*;

public class While_DoWhile {

	public static void main(String[] args) {
	
		
		int i = 5;
		
		while( i > 0 )
		{
			// i = i - 1 or i--
			
			System.out.println("Hello World");
	
			i--;
			
		}

		Scanner reader = new Scanner(System.in);
		
		String input;
		String all = "";
		
		int e = 5;
	
		while(e > 0)
		{
			input = reader.nextLine();
			all += input;
			e--;
		}
		
		System.out.println(all);

		// another way
		
		String input1;
		String all1 = "";
		
		do
		{
			input1 = reader.nextLine();
			all1 += input1;
			
		} while(!input1.equals("STOP"));
		
		System.out.println(all1);
	}

}
