package test.threads.Threads;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		TestThread test = new TestThread();
		Queue<String> queue1 = new LinkedBlockingDeque<String>();
		Consumer consumer = new Consumer();
		test.start();
		if (queue1.isEmpty()) {
			System.out.println("Wait to fill");
			synchronized (test) {
				test.wait();
			}
		}
		consumer.consume(queue1);

	}

}
