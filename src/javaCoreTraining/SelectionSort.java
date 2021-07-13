package javaCoreTraining;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12, 5 , 3, 6, 4};
		int min; 
			for(int i=0; i< a.length; i++) {
				for(int j=i+1; j< a.length; j++) {
					min = i;
					if(a[min]>a[j]) {
						min = j;
					}
					
					if(min !=i) {
					int temp = a[i]; 
					a[i] = a[min];
					a[min] = temp; 
					}
				}
			}
			
		System.out.println(Arrays.toString(a));
				
	}

}
