package biz.adaptivesoftware.examples.singleton;
/**
 * Simple Singleton class using the classic implementation
 * @author pshah
 */
public class ClassicSingleton {
	//sole instance of this class
	private static ClassicSingleton instance = null;
	
	/**
	 * Private constructor that prevents instantiation
	 * of this class from other clients.
	 */
	private ClassicSingleton() {
		System.out.println("Singleton constructed");
	}
	
	/**
	 * Returns an instance of the Singleton - ClassicSingleton object. 
	 * This method is NOT thread safe. It ensures that only one instance
	 * of the Singleton object exists. If an instance exists it is returned
	 * otherwise one is created.
	 * @return An instance of ClassicSingleton
	 */
	public static ClassicSingleton getInstance() {
		if(instance == null) {
			instance = new ClassicSingleton();
		}
		return instance;
	}
	
	/**
	 * This would be an actual business method in a more real life
	 * implementation. Being used here for testing.
	 */
	public void someMethod() {
		System.out.println("Singleton:someMethod");
	}
}
