package com.ust.example;

import java.util.PriorityQueue;

public class CollectionInteger5 {

	public static void main(String[] args) {
		//creating empty priority queue
		PriorityQueue<Integer> pQueue= new PriorityQueue<Integer>();
		//adding items to the pqueue using add()
		pQueue.add(35);
		pQueue.add(30);
		pQueue.add(22);
		//printing the top elemenet
		System.out.println(pQueue.peek());
		
		//printing the top element and removing it
		//from the PriorityQueue Container
		System.out.println(pQueue.poll());
		
		//printing the top element again
		System.out.println(pQueue.peek());

	}

}
