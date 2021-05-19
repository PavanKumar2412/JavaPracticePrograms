package JavaPracticePrograms.JavaPracticePrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class NagativePositivePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { -1, 2, -3, 4, 5, -7, 9, 8 }; 
        int n = arr.length; 
        
       /* HashSet<Integer> hs =new HashSet(Arrays.asList(arr));
        hs.add(-9);
        hs.add(3);
        System.out.println(hs);
        for(Integer m :hs)
        {
        	System.out.println(m);
        }*/
  
        rearrange(arr, n); 
        printArray(arr, n); 

	}
	 // A utility function to print an array 
    static void printArray(int arr[], int n) 
    { 
    	
    	
    	
    	
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
    } 
    
    static void rearrange(int arr[], int n) 
    { 
        int j = 0, temp; 
        for (int i = 0; i < n; i++) { 
            if (arr[i] < 0) { 
                if (i != j) { 
                    temp = arr[i]; 
                    arr[i] = arr[j]; 
                    arr[j] = temp; 
                } 
                j++; 
            } 
        } 
    } 
}

