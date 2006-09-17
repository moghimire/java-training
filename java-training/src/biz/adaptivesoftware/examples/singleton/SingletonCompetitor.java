package biz.adaptivesoftware.examples.singleton;

public abstract class SingletonCompetitor {
	private static int member;
	
	public static int getMember() {
		return member;
	}
	
	public static void setMember(int memberParam) {
		member = memberParam;
	}
	
	public static void someMethod() {
		System.out.println("SingletonCompetitor:someMethod");
	}
	
	/* Not allowed with static methods
	public abstract static void someAbstractMethod();
	*/
}
