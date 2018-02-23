package test.threads.Threads;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class TestThread extends Thread {
	public void run() {
		Queue<String> queue1 = new LinkedBlockingDeque<String>();
		// Queue<String> queue2 = new LinkedBlockingDeque<String>();
		Producer producer = new Producer(queue1);
		synchronized (this) {
			producer.produce();
			this.notify();
			// producer.produce(queue2);
		}
	}

}
