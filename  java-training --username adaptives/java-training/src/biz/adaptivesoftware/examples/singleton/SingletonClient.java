package biz.adaptivesoftware.examples.singleton;

public class SingletonClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassicSingleton firstInstance = ClassicSingleton.getInstance();
		ClassicSingleton secondInstance = ClassicSingleton.getInstance();
		if(firstInstance == secondInstance) {
			System.out.println("Both instances are the same");
		}
	}

}
