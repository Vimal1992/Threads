package com.vimal.test;

import java.util.Queue;

public class Consumer {
	public void consume(Queue<String> queue) throws InterruptedException {
		if (queue.isEmpty()) {
			synchronized (queue) {
				System.out.println("Waiting for Queue to fill");
				queue.wait();
			}
		}
		System.out.println("Consuming the Queue Items");
		queue.clear();
	}

}
