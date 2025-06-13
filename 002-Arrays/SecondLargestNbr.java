package Arrays;

public class SecondLargestNbr {

	public static void main(String[] args) {

			int[] arr = {10, 100, 80, 20, 25, 30, 30, 45, 50};

			int highest = arr[0];
			for(int i=1;i<arr.length;i++) {
				if(arr[i]>highest) {
					highest=arr[i];
				}
			}			
			int secHighest = arr[0];
			for(int i=1;i<arr.length;i++) {
				if(arr[i]>secHighest && arr[i]<highest) {
					secHighest=arr[i];
				}
			}			
			System.out.println("second highest: "+secHighest);				
	}
}
