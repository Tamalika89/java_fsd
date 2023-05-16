package Array;

import java.util.Arrays;


public class Smallestelement {
	public  int findkthSmallestelement(int[]arr,int k){
		Arrays.sort(arr);
		return arr[k-1];
	}

	public static void main(String[] args) {
		int[] arr= new int[]{3,1,2,4,6,5,7};
		Arrays.sort(arr);
		Smallestelement s= new Smallestelement();
		int size = arr.length;  
		int k = 4; 
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
		int ans=s.findkthSmallestelement(arr, k);
		System.out.println();  
		System.out.println("The smallest element of the array is: " + ans);

	}

}
