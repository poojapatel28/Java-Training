
public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main Starts");
		NumberThread t1 = new NumberThread(1, 400);
		NumberThread t2 = new NumberThread(800,900);
		t1.start();
		t2.start();
		
		doTask();
		System.out.println("Main Dies");
	}

	private static void doTask() {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		System.out.println("Name :"+t.getName());
		System.out.println("Group :"+t.getThreadGroup());
		System.out.println("Priority : "+t.getPriority());
		/*JRE checks the status of only non-daemon threads before it terminated*/
		System.out.println("Daemon :"+t.isDaemon());
		
	}

}
