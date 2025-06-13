package Arrays;

import java.util.ArrayList;

public class CountOccrEachNbrArray {

	public static void main(String[] args) {
		int[] arr = { 3, 7, 2, 8, 7, 3, 1, 2 };
		ArrayList<Integer> list = new ArrayList<Integer>();

		int count;
		for (int i = 0; i < arr.length; i++) {
			count = 1;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j] && !list.contains(arr[i]) && i != j) {
					count++;
				}
			}
			if (!list.contains(arr[i])) {
				list.add(arr[i]);
				System.out.println(arr[i] + " is present " + count + " times.");
			}
		}
	}
}
