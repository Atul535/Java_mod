package com.Queue.PriorityQueue;
import java.util.ArrayDeque;
import java.util.Queue;
public class ArrayQueue {
public static void main(String[] args) {
	Queue <Integer> queue= new ArrayDeque<>();
	queue.offer(10);
	queue.offer(20);
	
	System.out.println("Front element : "+queue.peek());
	System.out.println("Removed element : "+queue.poll());
	//poll() used for removing and returning the same element
	System.out.println("Queue size : "+queue.size());
}
}
