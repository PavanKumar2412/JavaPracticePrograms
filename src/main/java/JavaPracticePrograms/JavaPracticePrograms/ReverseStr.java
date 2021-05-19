package JavaPracticePrograms.JavaPracticePrograms;

public class ReverseStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String st="pavan";
String s="";
StringBuffer sb=new StringBuffer("kumar");
ReverseStr s1=new ReverseStr();
s1.reverse("ennam");

int sz=st.length();
for(int i=sz-1;i>=0;i--)
{
	s=s+st.charAt(i);
	
}

System.out.println(s);
System.out.println(sb.reverse());
	}
public void reverse(String str)
{
	if(str==null||str.length()<=1)
	{
		System.out.println(str);
	}
	else
	{
		System.out.print(str.charAt(str.length()-1));
		reverse(str.substring(0, str.length()-1));
	}
}
}
