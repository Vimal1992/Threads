package test.threads.Threads.local;

import java.util.concurrent.atomic.AtomicInteger;

public class TestThread extends Thread {
	public static AtomicInteger customerId = new AtomicInteger(10);
	ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>() {
		public Integer initialValue() {
			return customerId.incrementAndGet();
		}
	};

	TestThread(String name) {
		super(name);
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + "having customer Id : " + threadLocal.get());
	}
}
