package test.threads.Threads.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Display {

	ReentrantLock lock = new ReentrantLock(true);

	public void wish(String name) throws InterruptedException {
		if (lock.tryLock(6000, TimeUnit.MILLISECONDS)) {
			System.out.print("Good Morning : ");
			try {
				for (int i = 0; i < 5; i++) {
					Thread.sleep(1000);
					System.out.println(name);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			lock.unlock();
		} else {
			System.out.println("Fuck off!! Thread lock is not available for " + name);
		}
	}
}
