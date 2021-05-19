package JavaPracticePrograms.JavaPracticePrograms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Pr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3,5,7,11,13,21,19,4,15};
		List<int[]> st=Arrays.asList(a);
		
		/*for(int[] value:st)
		{
			System.out.println(value);
		}*/
		
	
		int flag=0;
		ArrayList<Integer> al1=new ArrayList<Integer>();
		ArrayList<Integer> al2=new ArrayList<Integer>();
		
		for(int s=0;s<=a.length-1;s++)
		{int temp=a[s];
		for(int i=2;i<=temp/2;i++){    
		    if(temp%i==0){    
		     System.out.println(temp+" is not prime number");    
		     al1.add(temp);
		     flag=1;    
		     //break;    
		    }    
		   }    
		   if(flag==0)  { 
			   al2.add(temp);System.out.println(temp+" is prime number"); }
		  }//end of else
		System.out.println("Prime arry:"+al2);
		System.out.println("Non Prime array:"+al1);
	}
	
}

