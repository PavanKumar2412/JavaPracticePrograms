package JavaPracticePrograms.JavaPracticePrograms;
import java.util.ArrayList;

public class SplitAlphanumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String s=new String("pavan1234kumar5678");
		int sz=s.length();
StringBuffer sb1=new StringBuffer();
StringBuffer sb2=new StringBuffer();
ArrayList<Integer> al=new ArrayList();
ArrayList<String> st=new ArrayList();
		for(int i=0;i<sz;i++)
		{
			if(Character.isAlphabetic(s.charAt(i)))
			{
				sb1.append(s.charAt(i));
				st.add(s.valueOf(s.charAt(i)));
			}
			else if(Character.isDigit(s.charAt(i)))
			{
				sb2.append(s.charAt(i)).toString();
				al.add(Integer.parseInt(s.valueOf(s.charAt(i))));
			}
		}
		Integer.parseInt(sb2.toString());
		System.out.println("char List:"+ sb1);
		
		System.out.println("integer list:"+al);

	}

}
