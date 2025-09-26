package Arrays;

public class SecondLargestNbr {

	public static void main(String[] args) {

			int[] arr = {10, 100, 80, 20, 25, 30, 30, 45, 100, 50};
			int largest = arr[0];
			int secondLargest = arr[0];
			System.out.println("Given array is: ");
			for(int i=1;i<arr.length;i++) {
			    System.out.println(arr[i] + " ");
				if(arr[i]>largest) {
				    secondLargest = largest;
					largest = arr[i];
			    }
				else if (arr[i]>secondLargest && arr[i]!=largest){
				    secondLargest = arr[i];
				}
			}	
			System.out.println("Second largest number in array is: " + secondLargest);			
	}
}
