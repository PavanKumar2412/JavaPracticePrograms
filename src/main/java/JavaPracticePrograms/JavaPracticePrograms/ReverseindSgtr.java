package JavaPracticePrograms.JavaPracticePrograms;

public class ReverseindSgtr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Pavan Kumar Ennam JPMorgan Chase Company with";
	String s2="";
	String[] s1=s.split(" ");
			
			int sz=s1.length;
			
			for(int i=0;i<sz-1;i++)
			{
				StringBuilder sb =new StringBuilder(s1[i]);
				int sz1=sb.length();
				for(int j=sz1-1;j>=0;j--)
				{
					s2=s2+sb.charAt(j);
				}
				s2=s2+" ";
			}
			System.out.println(s2);
	}

}
