class Leapyear
/*
{
public static void main(String[]args)
	{
	for(int year=1947; year<=2022; year++)
	{
		if(((year%4==0)&&(year%100!=0))||(year%400==0))
		{
		System.out.println(year+" is a leap year.");
		}
		else
		{
		System.out.println(year+" is not a leap year.");
		}
	}
	}
}
*/
{
public static void main(String[]args)
	{
		int year;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter Year: ");
		year=sc.nextInt();
		if(((year%4==0)&&(year%100!=0))||(year%400==0))
		{
		System.out.println(year+" is a leap year.");
		}
		else
		{
		System.out.println(year+" is not a leap year.");
		}
	
	}
}

