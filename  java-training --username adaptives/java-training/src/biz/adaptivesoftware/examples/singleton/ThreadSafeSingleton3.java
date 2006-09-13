package biz.adaptivesoftware.examples.singleton;

public class ThreadSafeSingleton3 {
	
	// sole instance of this class initialzed early
	private static ThreadSafeSingleton3 instance = new ThreadSafeSingleton3();
	
	/**
	 * Private constructor that prevents instantiation
	 * of this class from other clients.
	 */
	private ThreadSafeSingleton3() {
		
	}
	
	/**
	 * Returns an instance of the Singleton - ThreadSafeSingleton3.
	 * The object is initialzed when the class is loaded. 
	 * @return An instance of ThreadSafeSingleton3
	 */
	public static ThreadSafeSingleton3 getInstance() {
		return instance;
	}
	
	public void someMethod() {
		System.out.println("ThreadSafeSingleton3:someMethod");
	}
}
