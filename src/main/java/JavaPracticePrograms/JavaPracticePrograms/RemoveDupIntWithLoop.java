package JavaPracticePrograms.JavaPracticePrograms;

public class RemoveDupIntWithLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDupIntWithLoop rem=new RemoveDupIntWithLoop();
		int a[]= {2,4,2,9,4,5,3,4,9};
		int sz=a.length;
	int r=	rem.process(a,sz);
	for(int i=0;i<r;i++)
	{
		System.out.print(a[i]+ " ");
	}
	}
private int process(int a[],int sz)
{
	if(sz==0||sz==1)
	{
		return sz;
	}
	
	int[] temp =new int[sz];
	int j=0;
	for(int i=0;i<sz-1;i++)
	{
		if(a[i]!=a[i+1])
		{
			temp[j++]=a[i];
		}
		temp[j++]=a[sz-2];
		for(int m=0;m<j;m++)
		{
			a[m]=temp[m];
		}
	}
	return j;
}
}
