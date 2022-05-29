package io.github.sindahera.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		 
		Queue<String> queue = new PriorityQueue<>();
		
		queue.add("India");
		queue.add("Germany");
		queue.add("America");
		
		System.out.println("Original queue: " + queue);
		
		queue.remove();
		System.out.println("queue after removing the head element: " + queue);
        
		String head = queue.peek();
		System.out.println("head of the queue: " + head);
	}

}
