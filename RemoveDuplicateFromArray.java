package com.program;
// Java Program to Remove Duplicate Elements
// From the Array using extra space
import java.util.Arrays;
public class RemoveDuplicateFromArray {
	
	public static void main(String[] args)
    {
        int a[] = { 1, 2, 3, 1, 4, 2, 1, 5 };
        int n = a.length;

        n = remove(a, n);

        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
		

    public static int remove(int a[], int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }
      
      	// Sort the input array
      	Arrays.sort(a);

        // create another array for only storing
        // the unique elements
       // int[] t = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j] = a[i];
                j++; 
            }
        }

        // Adding last element to the array
      	a[j++] = a[n-1];
          
        // Changing the original array
		/*
		 * for (int i = 0; i < j; i++) { a[i] = a[i]; }
		 */
        return j;
    }
    
}