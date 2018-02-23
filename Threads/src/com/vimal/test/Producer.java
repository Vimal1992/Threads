package com.vimal.test;

import java.util.Queue;

public class Producer {

	public Queue<String> produce(Queue<String> queue) {
		System.out.println("Producing the queue");
		synchronized (queue) {
			queue.add("FirstItem " + queue.getClass());
			queue.add("Second Item " + queue.getClass());
			queue.add("Third Item " + queue.getClass());
			queue.add("Fourth Item " + queue.getClass());
			queue.notify();
		}
		System.out.println("Filled the Queue");
		return queue;
	}
}
