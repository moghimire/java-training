package biz.adaptivesoftware.examples.exceptions;
/**This class shows how a RuntimeException is thrown
 * An ArrayIndexOutOfBoundsException is used to illustrate this example
 * @author pshah
 *
 */
public class RuntimeThrower {
	public static void main(String args[]) {
		int numbers[] = new int[10];
		populateNumbers(numbers);
	}
	
	public static void populateNumbers(int numbers[]) {
		for(int i=0;i<15;i++) {
			System.out.println("Adding number at " + i);
			numbers[i] = i;
		}
	}
}
