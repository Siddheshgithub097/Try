package javaConceptOfDay;

import java.util.Arrays;

public class SubArrayWhoseSumEqulTONUMBER 
{
	public static void main(String[] args)
	{
		FindSubarray(new int [] {42, 15, 12, 8, 6, 32}, 26);
	}
	
	public static void FindSubarray(int array [] , int target)
	{
		int sum = 0 ;
		
		for (int i = 0; i < array.length; i++) 
		{
			sum = array[i]; // 42; , 15 ;, 12 (now we get 12,8 which is 20)>target so continue 
			
			for (int j = i+1; j < array.length; j++)
			{
				sum = sum+array[j]; 
									  // 42+15 = 57 which is more tha our target . so first loop not executed, it goes to next loop and check the condition ,
									 // 15+ 12 = 27 , 12+8 = 20(less than target)  
									// 20+i4(6) = 26  (bcz i3=20 and 8 and prove the condition , so i will be next element which is 6) 
				// if my sum is equl to target 
				
				if(sum==target)	// not execute , not execute ,execute (20(12+8, 6)=26 so i will print element 
				{
					System.out.println(" Continuous of sub Array of "+ Arrays.toString(array)+" Whose sum is "+ target+" is ");
					
					//once i got element i will print these element where i got these element from the position 
					// so i will print these element 
					// k=i (where start my loop and it goes on where i got my target , which mean i2.(12,8) to i3(6); 
					for (int K = i; K <= j; K++) 
					{
						System.out.print(array[K]+" ");	// ekda element bhetlyvr to print karaycha , loop toprntch chalu dyaycha 
						// Print subarray: [12, 8, 6]
					}
					System.out.println();
				}
				
				// If the sum is less than the target, continue adding elements   
				else if(sum< target)	//(1) iteration so my sum 57 which is more than target so this will not execute 
				{
					continue;			// 	20<26 so continue , 
										// 
				}
				else if (sum>target) /// If the sum exceeds the target, break out of the inner loop
				{
					break;		// so in this loop our first iteration will break , second loop break 
				}
				
				// now it come from = i =1 which is = 15 ., i = 2 which is 12  , i = 2 which is 12 (in this we get 20 which is less than target , so it will increment position 
				// now my i3 is 6 (bcz i2 = 12 and 8)
			}
		}
	}
	
}
