import java.util.Scanner;
class SumOfNumbers
{

public static void main(String...args)
	{
	int n, sum=0; 
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number :");	
	n=sc.nextInt();
	while( n>0 || sum>9)
		{
		if(n==0)
			{
			n=sum;
			sum=0;
			}
		sum =sum + n%10;
		n= n/10;
		}
	System.out.println("After Sum of Single Digit is: "+sum);
	}
}