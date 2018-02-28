package test.threads.Threads.future;

import java.util.concurrent.Callable;

public class MyCallableFutureTask implements Callable<String> {

	private long waitTime;

	public MyCallableFutureTask(int timeInMillis) {
		this.waitTime = timeInMillis;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(waitTime);
		// return the thread name executing this callable task
		return Thread.currentThread().getName();
	}

}
