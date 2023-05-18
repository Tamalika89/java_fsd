package Search;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_search {

	public static void main(String[] args) {
		int[]arr= {45,12,34,67,13,14,90};
		Arrays.sort(arr);
		for(int b:arr) {
			System.out.print(b+",");
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to be search");
		int key=sc.nextInt();
		int low=0;
		int high=arr.length-1;
		int mid=0;
		while(low<=high) {
			mid=low+high/2;
			if(arr[mid]==key) {
				System.out.println("The element is found in the location "+mid);
				break;
			}
			else if(arr[mid]<key) {
				low=mid+1;
				
			}
			else {
				high=mid-1;
			}
		}
	}

}
