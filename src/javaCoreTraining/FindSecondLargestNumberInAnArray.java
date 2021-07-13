package javaCoreTraining;

public class FindSecondLargestNumberInAnArray {

	public static void main(String[] args) {
		int a[] = { 1, 7, 9, 4, 5, 6, 20, 10, 8 };

		int largestNumber = a[1];
		int secondLargestNumber = a[1];
		for (int i = 0; i < a.length; i++) {
			if (largestNumber < a[i]) {
				secondLargestNumber = largestNumber; 
				largestNumber = a[i];
			}else if (secondLargestNumber < a[i]) {
				secondLargestNumber = a[i];
			}
		}

		System.out.println("The largest number is  " + largestNumber);
		System.out.println("The second largest number is  " + secondLargestNumber);
	}

}
