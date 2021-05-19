package JavaPracticePrograms.JavaPracticePrograms;
import java.util.Arrays;
import java.util.List;

public class Owvels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Character vow[]= {'a','e','i','o','u','A','E','I','O','U'};
StringBuffer br=new StringBuffer("PavanKumar");
List<Character> al= Arrays.asList(vow);
for(int i=0;i<br.length();i++)
{
	if(al.contains(br.charAt(i)))
	{
		br.replace(i, i+1, "");
		
	}
}
System.out.println("op String:"+br);
	}

}
