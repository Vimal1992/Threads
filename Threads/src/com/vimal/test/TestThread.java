package com.vimal.test;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class TestThread implements Runnable {
	public void run() {
		Queue<String> queue1 = new LinkedBlockingDeque<String>();
		Queue<String> queue2 = new LinkedBlockingDeque<String>();
		Producer producer = new Producer();
		Consumer consumer = new Consumer();
		try {
			consumer.consume(queue1);
			consumer.consume(queue2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		producer.produce(queue1);
		producer.produce(queue2);
	}

}
