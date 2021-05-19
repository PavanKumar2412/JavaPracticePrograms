package JavaPracticePrograms.JavaPracticePrograms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StrCharCnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=1;
		String input = new String("pavankumma");
		char ar[]=input.toCharArray();
		//List<char[]>  as=Arrays.asList(input.toCharArray());
		ArrayList<Character> al=new ArrayList();
		for(Character i :ar)
		{
			al.add(i);
		}
		//System.out.println(al);
		al.stream().collect(Collectors.groupingBy(n->n ,Collectors.counting())).forEach((chr,cnt)->System.out.println(chr + ":::"+cnt));
		
		int sz1=ar.length;
		for(int i=0;i<sz1;i++)
		{
		for(int j=i+1;j<sz1;j++)
		{
			if(ar[i]==ar[j])
			{
		   c++;
		   ar[j]='0';
			}
			
		}
		if(ar[i]!='0')
		{
			System.out.println("individual char ::::"+ar[i]+"   index::: "+i+" :  cont"+ c);
			c=1;
		}
		
	}

}
} //pavankumma