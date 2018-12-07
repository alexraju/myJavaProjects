/**
 * 
 */
package calc;

/**
 * @author sujitha
 *
 */
public class CalculatorMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calculator c  = new Calculator();
		c.setInputs(10,5);
		c.performOperation("add");
		int x =c.getResult();
		System.out.println("Result of add  is "+x);

	}

}
