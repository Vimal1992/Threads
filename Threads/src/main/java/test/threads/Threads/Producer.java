package test.threads.Threads;

import java.util.Queue;

public class Producer {
	Queue<String> queue;

	public Producer(Queue<String> queue1) {
		this.queue = queue1;
	}

	public Queue<String> produce() {
		System.out.println("Producing the queue");
		this.queue.add("FirstItem " + queue.getClass());
		queue.add("Second Item " + queue.getClass());
		queue.add("Third Item " + queue.getClass());
		queue.add("Fourth Item " + queue.getClass());
		System.out.println("Filled the Queue");
		return queue;
	}
}
