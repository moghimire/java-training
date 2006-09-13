
package biz.adaptivesoftware.examples.trycatch;
/**This class shows that finally will NOT get control if
 * we exit the class using System.exit() in the try block
 * @author pshah
 *
 */
public class SystemExitFinally {
	public static void main(String args[]) {
		try {
			System.exit(1);
		}
		finally {
			System.out.println("In finally");
		}
	}
}
