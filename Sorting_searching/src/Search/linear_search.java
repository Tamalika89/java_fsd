package Search;
import java.util.Scanner;

public class linear_search {

	public static void main(String[] args) {
		int[]arr= {1,2,3,4,5,6};
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the element to found:");
		int element=sc.nextInt();
		int flag=0;
		int i=0;
		for(i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				flag=1;
				break;
			}
			else {
				flag=0;
			}
		}
		if(flag==1) {
			System.out.println("The element is found that location:"+i);
		}
		else {
			System.out.println("The element is not found");
		}

	}

}
