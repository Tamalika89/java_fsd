package Array;

public class SumofN {
	static int sumnatural(int n){
		int sum=(n*(n+1))/2;
		return sum;
	}
	static int suminrange(int l,int r) {
		return sumnatural(r)-sumnatural(l-1);
	}

	public static void main(String[] args) {
		int ans=suminrange(2,5);
		System.out.println("The sum of n number of elements is"+ans);
		

	}

}
