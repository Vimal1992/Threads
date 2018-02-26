package test.threads.Threads.local;

public class TestLocalThread {

	public static void main(String[] args) {
		TestThread testThread = new TestThread("First Thread");
		TestThread testThread2 = new TestThread("Second Thread");
		testThread.start();
		testThread2.start();

	}

}
