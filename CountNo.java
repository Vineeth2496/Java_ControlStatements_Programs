import java.util.Scanner;
class CountNo
{
public static int numberof2s(int n)
	{
	int count=0;
	while(n > 0)
		{
		if(n % 10 == 2)
			{
			count++;
			}
		n=n/10;	
		}
	return count;
	}
	
public static int numberof2sinRange(int n)
	{
	int count=0;
	for(int i=2; i<=n; i++)
		{
		count=count + numberof2s(i);
		}
	return count;
	}
public static void main(String...args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 'n' value: ");
	int n=sc.nextInt();
	System.out.println("Totol number of 2's in between 0 to n: "+numberof2sinRange(n));
	}

}