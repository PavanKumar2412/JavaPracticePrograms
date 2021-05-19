package JavaPracticePrograms.JavaPracticePrograms;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSort {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="pavan kumar pavan pavan kumar sss";
		List<String> als =Arrays.asList(s.split(" "));
		als.stream().sorted().collect(Collectors.groupingBy(n->n,Collectors.counting())).forEach((item,cnt)->System.out.println(item+ ":"+cnt));
		List<String> al=Arrays.asList("pavan","kuamr","ennem","pavan","abcd","kumar","kumar");
		List<Integer> inal=Arrays.asList(1,2,6,8,9,2,3,4,5,4,5,6,5,5,5,6,9,0,9,1,1,1);
		//sorting and count of strings
//l.stream().sorted().collect(Collectors.groupingBy(n->n, Collectors.counting())).forEach((item,cnt)->System.out.println(item+ " "+cnt) );
	
		//removing duplicate string and cnt print
	//al.stream().sorted().distinct().collect(Collectors.groupingBy(n->n, Collectors.counting())).forEach((item,cnt)->System.out.println(item+ " "+cnt) );
	System.out.print("###############");
	//integer array count and sorted
	inal.stream().sorted().collect(Collectors.groupingBy(l->l,Collectors.counting())).forEach((number,cnt)->System.out.println(number +" "+cnt));
	//removing dup and cnt
	//inal.stream().sorted().distinct().collect(Collectors.groupingBy(l->l,Collectors.counting())).forEach((number,cnt)->System.out.println(number +" "+cnt));
	}

}
