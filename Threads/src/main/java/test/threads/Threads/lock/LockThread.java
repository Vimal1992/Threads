package test.threads.Threads.lock;

public class LockThread extends Thread {
	public Display display;
	public String name;

	public LockThread(Display display, String name) {
		this.display = display;
		this.name = name;
	}

	public void run() {
		try {
			display.wish(name);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
