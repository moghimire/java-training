package biz.adaptivesoftware.examples.singleton;
/**
 * A Singleton class which has a thread safe getInstance() method.
 * @author pshah
 *
 */
public class ThreadSafeSingleton1 {
	
	// sole instance of this class
	private static ThreadSafeSingleton1 instance = null;
	
	/**
	 * Private constructor that prevents instantiation
	 * of this class from other clients.
	 */
	private ThreadSafeSingleton1() {
		
	}
	
	/**
	 * Returns an instance of the Singleton - ClassicSingleton object. 
	 * This method IS thread safe. It ensures that only one instance
	 * of the Singleton object exists. If an instance exists it is returned
	 * otherwise one is created. Performance may take a hit because the method
	 * is synchronized.
	 * @return An instance of ClassicSingleton
	 */
	public synchronized static ThreadSafeSingleton1 getInstance() {
		if(instance == null) {
			instance = new ThreadSafeSingleton1();
		}
		return instance;
	}
	
	public void someMethod() {
		System.out.println("Singleto:someMethod");
	}
}
