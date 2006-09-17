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
		final String s1 = "finalstring";
		bMethod(new Printer() {
			public void print() {
				//will give compiler error
				//System.out.println("The String is " + s);
				System.out.println(s1); //s1 is final
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