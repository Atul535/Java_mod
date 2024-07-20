package com.Queue.PriorityQueue;
import java.util.*;
public class Queue {
public static void main(String[] args) {
	PriorityQueue q= new PriorityQueue();
	q.offer(11);
	q.offer(1);
	q.offer(171);
	q.offer(14);
	q.offer(3);
	
	Iterator itr=q.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	
}

}
