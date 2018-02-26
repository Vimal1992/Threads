package test.threads.Threads.local;

public class InheritableParent extends Thread {
	public static InheritableThreadLocal<Integer> threadLocal = new InheritableThreadLocal<Integer>() {
		public Integer childValue(Integer o) {
			return 200;
		}
	};

	public void run() {
		threadLocal.set(20);
		System.out.println("Parent having customer Id : " + threadLocal.get());
		InheritableChild inheritableChild = new InheritableChild();
		inheritableChild.start();
	}
}
