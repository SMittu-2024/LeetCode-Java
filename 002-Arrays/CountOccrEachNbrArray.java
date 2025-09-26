package Arrays;

import java.util.*;

public class CountOccrEachNbrArray {

	public static void main(String[] args) {
		int[] arr = { 3, 7, 2, 8, 7, 3, 1, 2 };
	    HashMap<Integer,Integer> occurences = new HashMap<>();

    	for(int number:arr){
        	occurences.put(number,occurences.getOrDefault(number,0)+1);
    	}
    	System.out.println("Array elements with their occurences are: ");
		Set<Integer> keys = occurences.keySet();
		for(int key:keys)
		        System.out.println(key+ " : "+ occurences.get(key));
	}
}
