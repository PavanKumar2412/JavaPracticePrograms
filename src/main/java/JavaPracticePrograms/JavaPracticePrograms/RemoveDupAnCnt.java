package JavaPracticePrograms.JavaPracticePrograms;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class RemoveDupAnCnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String input = new String("pavankumma");
String output="";
char ar[]=input.toCharArray();
int sz1=ar.length;
//Method 1
int c=0;
for(int i=0;i<input.length();i++)
{
	char ch=input.charAt(i);
	if(output.indexOf(ch)<0)
	{
		output=output+ch;
	}

	
}

System.out.println(output);
//method2

/*LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
for(Character i :input.toCharArray())
{
	lhs.add(i);
}*/
ArrayList<Character> al=new ArrayList();
for(Character i :ar)
{
	al.add(i);
}
System.out.println(al);
al.stream().collect(Collectors.groupingBy(n->n ,Collectors.counting())).forEach((chr,cnt)->System.out.println(chr + ":::"+cnt));
/*for(Character chs:lhs)
{
	System.out.print(chs);
	
}*/

//method2:

for(int i=0;i<sz1;i++)
{
	char ch=input.charAt(i);
	if(output.indexOf(ch)<0)
	{
		output=output+ch;
	}
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
	System.out.println("individual char"+ar[i]+ " :  cont"+ c);
	c=1;
}
	
}}

}