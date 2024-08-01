package array_javaT;

public class Second_Smallest_element {
	    public static void main(String[] args) {
	        int array[] = {34, 65, 87, 98, 56, 78, 56, 45, 87, 34};

	        int smallest = array[0];
	        int secondSmallest = Integer.MAX_VALUE; // Initialize to a large value

	        for (int i = 1; i < array.length; i++) 
	        {
	            if (smallest > array[i]) 
	            {
	                secondSmallest = smallest; // Update secondSmallest to previous smallest
	                smallest = array[i]; // Update smallest to the new smallest
	            } else if (array[i] < secondSmallest && array[i] != smallest) {
	                secondSmallest = array[i]; // Update secondSmallest if a new candidate is found
	            }
	        }

	        System.out.println(smallest + " is the smallest value of the array");
	        System.out.println(secondSmallest + " is the second smallest value of the array");
	    }
	}


