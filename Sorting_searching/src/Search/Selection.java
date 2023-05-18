package Search;

public class Selection {
	void selection_sort(int arr[]){
		int i, j, small;  
	    int n = arr.length;  
	    for (i = 0; i < n-1; i++)  
	    {  
	        small = i; 
	          
	        for (j = i+1; j < n; j++)  
	        if (arr[j] < arr[small])  
	            small = j;   
	    int temp = arr[small];  
	    arr[small] = arr[i];  
	    arr[i] = temp;  
	    }  
	  
	}  
	void printArr(int a[]) /* function to print the array */  
	{  
	    int i;  
	    int n = a.length;  
	    for (i = 0; i < n; i++)  
	    System.out.print(a[i] + " ");  
	}  
	  
	    public static void main(String[] args) {  
	    int a[] = { 91, 49, 4, 19, 10, 21 };  
	    Selection i1 = new Selection();  
	    System.out.println("\nBefore sorting array elements are - ");  
	    i1.printArr(a);  
	    i1.selection_sort(a);  
	    System.out.println("\nAfter sorting array elements are - ");  
	    i1.printArr(a);  
	    System.out.println();  
	    }  
	}  

