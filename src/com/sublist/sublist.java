/**
 * 
 */
package com.sublist;


import java.util.*;

/**
 * @author ypava
 *
 */
public class sublist {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 List<Integer> numbers = new ArrayList<Integer>(
				 
				 Arrays.asList(5,3,1,2,9,5,0,7,10)
				 
				 );
		 
		 int m=numbers.size();
		 
		 
		 if(m%2==0)
		 {
			 
		
		 
			    List<Integer> head = numbers.subList(0, m/2);
			    List<Integer> tail = numbers.subList(m/2, m);
			    Collections.sort(head);
			    Collections.sort(tail);
			    System.out.println(head);
			    System.out.println(tail); 
			   
		 }
		 else 
			 System.out.println("The array list can't be split equally");
		
	}

}
