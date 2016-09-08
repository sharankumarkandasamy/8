package guvi;

public class reverse 
{
	public static void main(String[] args) 
	{

	int num=54321;
	int revnum=0;
	System.out.println("the number before reverse is :"+ num);
	for(int i=1;i<=num;i++)
	{
		revnum=revnum*10+num%10;
		num/=10;
	}
	System.out.println("the num after reverse is: " +revnum); 
}
}