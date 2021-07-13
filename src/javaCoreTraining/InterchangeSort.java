package javaCoreTraining;

import java.util.Arrays;

public class InterchangeSort {
	
	public void Swap(int a, int b) {
		if(a>b) {
			int temp = a;
			a= b;
			b= temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {12,5,3,6,4};
		for(int i =0; i<a.length-1; i++) {
			for (int j = i+ 1; j <a.length; j++ ) {
			/*	if(a[i]>a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp; 
				}*/
				
				InterchangeSort ics = new InterchangeSort();
				ics.Swap(a[i], a[j]); 
			}
		}
		
		System.out.println(Arrays.toString(a));
	}

}
