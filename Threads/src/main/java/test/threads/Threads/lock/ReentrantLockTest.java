package test.threads.Threads.lock;

public class ReentrantLockTest {

	public static void main(String[] args) {
		Display display = new Display();

		LockThread lockThread = new LockThread(display, "Baba");
		LockThread lockThread2 = new LockThread(display, "Nana");
		lockThread.start();
		lockThread2.start();
		System.out.println("End of main Thread");

	}

}
