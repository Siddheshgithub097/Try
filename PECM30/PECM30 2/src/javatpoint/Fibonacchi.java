package javatpoint;

import java.util.Scanner;

public class Fibonacchi 
{
	public static void main(String[] args) {
		
		// 0,1,1,2,3,5 - Fibonacchi series 
		
		int a = 0 ;
		int b= 1 ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" How Many Number You want to print ");
		int n = sc.nextInt();
		
		for (int i = 0; i <= n; i++) 
		{
			System.out.print(a+" ");
			
			int next = a+b;
			a=b;
			b=next;
		}
	}
}
