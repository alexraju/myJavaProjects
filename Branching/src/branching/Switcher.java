package branching;

public class Switcher {

	public static void main(String[] args) {
		int x = 5;
		if(x == 1)
		{
			System.out.println("Red");
		}
		
		if(x == 2)
		{
			System.out.println("Blue");
		}
		
		if(x == 3)
		{
			System.out.println("Green");
		}
		
		// != not equal to
		
		if((x != 1)&& (x !=2) && (x != 3))
		{
			System.out.println("None");
		}

		
		// switch statement
		
		int y = 8;
		
		switch(y)
		{
		case 1: case 5: case 8:
			System.out.println("Red");
			break;
		case 2:
			System.out.println("Blue");
			break;
		case 3: 
			System.out.println("Green");
			break;
		default:
			System.out.println("None");
				
		}
		
		
		

	}

}
