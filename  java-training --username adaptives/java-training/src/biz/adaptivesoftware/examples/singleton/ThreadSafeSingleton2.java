package biz.adaptivesoftware.examples.singleton;

public class ThreadSafeSingleton2 {
	
	// sole instance of this class
	private static ThreadSafeSingleton2 instance = null;
	
	/**
	 * Private constructor that prevents instantiation
	 * of this class from other clients.
	 */
	private ThreadSafeSingleton2() {
		
	}
	
	/**
	 * Returns an instance of the Singleton - ThreadSafeSingleton2 object. 
	 * This method IS thread safe. It ensures that only one instance
	 * of the Singleton object exists. If an instance exists it is returned
	 * otherwise one is created. Performance is better than a fully
	 * synchronized method, because it uses double checked locking.
	 * @return An instance of ThreadSafeSingleton2
	 */
	public static ThreadSafeSingleton2 getInstance() {
		if(instance == null) {
			synchronized(ThreadSafeSingleton2.class) {
				if(instance == null) {
					instance = new ThreadSafeSingleton2();
				}
			}
		}
		return instance;
	}
	
	public void someMethod() {
		System.out.println("ThreadSafeSingleton2:someMethod");
	}
}
