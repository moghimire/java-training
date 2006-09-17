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
	
	public static void main(String args[]) {
		long start = System.currentTimeMillis();
		long threadLiveCount=0;
		for(int i=0;i<5;i++) {
			new Thread() {
				public void run() {
					//threadLiveCount++;
					for(int j=0;j<100;j++) {
						ThreadSafeSingleton3 tss3 = ThreadSafeSingleton3.getInstance();
					}
				}
			}.start();
		}
		
	}
}
