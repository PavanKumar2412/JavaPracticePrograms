package JavaPracticePrograms.JavaPracticePrograms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDupint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[]= {2,1,3,2};
int sz=a.length;
int cnt=1;
List<Integer> al= Arrays.asList(a);
HashSet<Integer> hs=new HashSet();
al.stream().collect(Collectors.groupingBy((n->n),Collectors.counting())).forEach((num,cn)->System.out.println(num+":****::"+cn));;

for(int i=0;i<sz;i++)
{
	for(int j=i+1;j<sz;j++)
	{
		if(a[i]==a[j])
		{
			cnt++;
			a[j]=0;
			
		}
	}
	if(a[i]!=0)
	{
		System.out.println(a[i]+ "  ::::"+cnt);
		cnt=1;
	}
	/*hs.add(a[i]);
	if(hs.contains(0))
{
	hs.remove(0);
}
}
System.out.print(hs + " ");*/
	}

}}
