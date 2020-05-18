package myCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArraysLinked {
	
	public static void main(String args[]){
		
		ArrayList<Integer> myArrayList = new ArrayList<Integer>();
	  LinkedList<Integer>  myLinkedList = new LinkedList<Integer>();

		doTimings("ArrayLIst", myArrayList);
		doTimings("LinkedLIst", myLinkedList);
	 }
	
	 public static void doTimings(String type, List<Integer> list){
		 
		 for(int i=0; i < 1E5; i++){
			 
			 list.add(i);
		 }
		 
		 long start = System.currentTimeMillis();
		
		 /*
		 //Adding items at the end of list 
		 for(int i=0; i < 1E5; i++){
			 
			 list.add(i);
		 }
         */
		 

		/*
		 //Adding items at the begening of list 
		 for(int i=0; i < 1E5; i++){
			 
			 list.add(0,i);
		 }
         */
		 
		 
		 //Adding items at the elsewhere of list 
		 for(int i=0; i < 1E5; i++){
			 
			 list.add(list.size() - 100,i);
		 }
       
		 
		 long end = System.currentTimeMillis();

		 
		 System.out.println("Time taken : " + (end-start)  + " ms " + type );
		 
	 } 

}
