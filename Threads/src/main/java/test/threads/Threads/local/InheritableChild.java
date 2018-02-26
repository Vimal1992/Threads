package test.threads.Threads.local;

public class InheritableChild extends Thread {
	public void run() {
		System.out.println("Child having customer Id : " + InheritableParent.threadLocal.get());
	}
}
