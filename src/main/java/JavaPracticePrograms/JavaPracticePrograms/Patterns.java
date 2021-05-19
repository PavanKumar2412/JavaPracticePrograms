package JavaPracticePrograms.JavaPracticePrograms;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patterns {


	public static void main(String[] args) {
		List<Integer> al =new ArrayList();
	List<String> al1=new ArrayList();
		   Pattern p = Pattern.compile("\\d+");
	        Matcher m = p.matcher("string1234more567string8908989");
	        Pattern p1 = Pattern.compile("[a-zA-Z]+");
	        Matcher m1 = p1.matcher("string1234more567string890000");
	        while(m.find()) {
	        	
	    al.add(Integer.parseInt(m.group()));
	            //System.out.println(m.group());

	}
	        while(m1.find()) {
	        	
	    	    al1.add(m1.group());
	    	            //System.out.println(m.group());
	   
	    	}
	        
	        System.out.println(al);
	        System.out.println(al1);
}
}