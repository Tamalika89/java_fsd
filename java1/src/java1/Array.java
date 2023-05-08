package java1;

public class Array {

	public static void main(String[] args) {
		//single dimensional array
		int[] arr= {34,67,23,89};
		for(int i=0;i<4;i++) {
			System.out.println("Elements of arrays is "+ arr[i]);
		}
		int[][] arr2= {{1,2,3,4},{3,6,7,8,9}};
		for(int row=0;row<arr2.length;row++) {
			for(int col=0;col<arr2[row].length;col++) {
				System.out.println("Elements of two dimensional array is"+ arr2[row][col]);
			}
			
		}

	}

}
