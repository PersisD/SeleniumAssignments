/*
 		* Here is the input
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		//       output= 7;

		 * Pseudo Code: 
		 * a) Create a empty Set Using TreeSet
		 * b) Declare for loop iterator from 0 to data.length and add into Set 
		 * c) converted Set into List
		 * d) Print the second last element from List		 * 
		 
 */

package week3.day2Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> unique = new TreeSet<Integer>();
		
		for (int i = 0; i < data.length; i++) {
			unique.add(data[i]);
		}
		System.out.println("Set: " +unique);
		List<Integer> list = new ArrayList<Integer>(unique);
		System.out.println("List: " +list);
		int size = list.size();
		System.out.println("Second Last element: " +list.get(size-2));
		
		
	}

}
