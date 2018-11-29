package chapter_3;

public class Dog {
	String name;

	public static void main(String[] args) {
	
	Dog dog1 = new Dog();
	dog1.bark();
	dog1.name = "Bart";
		
	Dog[] myDogs = new Dog [3];
	myDogs[0] = new Dog();
	myDogs[1] = new Dog();
	myDogs[2] = dog1;	

	myDogs[0].name = "Fred";
	myDogs[1].name = "marge";
	
	System.out.print("last dogs name is ");
	System.out.println(myDogs[2].name);
	
	int x = 0;
	while(x < myDogs.length) {
		myDogs[x].bark();
		myDogs[x].eat();
		x = x + 1;
		
	}
	
	x = 1;
	while(x < myDogs.length) {
		myDogs[x].chasecat();
		x = x + 1;
	}
	
	
	}



	public void bark() {
	System.out.println(name + " says ruff");
}
	
	public void eat() {
		System.out.println("yumm yumm");
	}
	
	public void chasecat() {
		System.out.println("Chaaase...");
	}
}




