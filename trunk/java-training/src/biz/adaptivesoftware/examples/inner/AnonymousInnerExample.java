/**
 * 
 */
package biz.adaptivesoftware.examples.inner;

/**
 * @author pshah
 *
 */
public class AnonymousInnerExample {

	public void aMethod() {
		String s = new String("abc");
		bMethod(new Printer() {
			public void print() {
				System.out.println("The String is " + s);
			}
		});
	}

	public void bMethod(Printer p) {
		p.print();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AnonymousInnerExample aie = new AnonymousInnerExample();
		aie.aMethod();
	}

}

interface Printer {
	public void print();
}