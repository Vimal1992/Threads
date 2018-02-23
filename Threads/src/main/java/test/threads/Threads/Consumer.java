package test.threads.Threads;

import java.util.Queue;

public class Consumer {

	public void consume(Queue<String> queue) throws InterruptedException {
		System.out.println("Consuming the Queue Items");
		for (String elements : queue)
			System.out.println(elements);
		queue.clear();
		System.out.println("Queue Cleared");
	}

}
