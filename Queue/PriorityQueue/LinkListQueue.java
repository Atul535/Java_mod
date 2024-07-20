package com.Queue.PriorityQueue;
import java.util.LinkedList;
import java.util.Queue;
public class LinkListQueue {
public static void main(String[] args) {
	Queue q= new LinkedList<>();
	for(int i=0;i<5;i++)
	{
		q.add(i);
	}
	System.out.println("Elements of queue "+q);
	int remov=(int) q.remove();
	System.out.println("Removed element - "+remov);
	System.out.println(q);
	System.out.println("Head of queue - "+q.peek());
	System.out.println("Size of queue - "+q.size());
}
}
