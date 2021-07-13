package javaCoreTraining;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {12,5,3,6,4};
		int key;
		for(int i=1; i<= a.length-1; i++) {
			key = a[i];
			int j = i-1;
			
			while (j>=0 && a[j]>key) {
				a[j+1] = a[j]; 
				j=j-1;
			}
			a[j+1]=key;
		}
		
		System.out.println(Arrays.toString(a));
		
	}

}
