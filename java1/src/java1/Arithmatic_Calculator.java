package java1;
import java.util.Scanner;

public class Arithmatic_Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Select the oprator:");
		 char operator=sc.next().charAt(0);
		int ans;
		switch(operator) {
		case'+':
			ans=a+b;
		System.out.println("Addition:"+ ans);	
		
		case '-':
			ans=a-b;
			System.out.println("Substraction:"+ans);
		break;
		case '*':
		ans=a*b;
		System.out.println("Multiplication:"+ans);
		break;

      
      case '/':
    	  ans=a/b;
  		System.out.println("Substraction:"+ans);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
		
		

	}

	}
}
