package com.Queue.Dequeue;
import java.util.*;
public class Dequeue {
public static void main(String[] args) {
	Deque <Integer> q=new ArrayDeque();
	q.offer(10);
	q.offer(20);
	q.offer(30);
	q.offer(40);
	System.out.println(q.remove());
	System.out.println(q);
}
}
