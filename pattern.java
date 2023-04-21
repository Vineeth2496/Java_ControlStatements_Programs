class pattern
/*								//1. star pattern
{								//*
public static void main(String[]args)					//**
	{							//***
	for(int i=1; i<=4; i++)					//****
		{
		for(int j=1; j<=i; j++)
			{
			System.out.print("*");
			}
		System.out.println(" ");
		}
	}

}
*/
/*								//2. Reverse Star Pattern
{
public static void main(String[]args)
	{
	for(int i=1; i<=5; i++)
		{
		for(int j=5; j>=i; j--)
			{
			System.out.print("*");
			}
		System.out.println(" ");		
		}
	}
}
*/
/*
{
public static void main(String arg[])					//3. Star and Reverse Star Pattern
	{
	for(int i=1; i<=5; i++)
		{
		for(int j=1; j<=i; j++)
			{
			System.out.print("*");
			}
		System.out.println();
		}
	for(int i=1; i<=5; i++)
		{
		for(int j=4; j>=i; j--)
			{
			System.out.print("*");
			}
		System.out.println();
		}
	}
}
*/
/*
{								//4. Star logic right side
public static void main(String[]args)
	{
	for(int i=1; i<=5; i++)
		{
		for(int j=4; j>=i; j--)
			{
			System.out.print(" ");
			}
		for(int k=1; k<=i; k++)
			{
			System.out.print("*");
			}
		System.out.println();
		}
	}
}
*/
/*
{								//5. reverse star logic right side
public static void main(String[]args)
	{
	for(int i=1; i<=5; i++)
		{
		for(int j=1; j<=i; j++)
			{
			System.out.print(" ");
			}
		for(int k=5; k>=i; k--)
			{
			System.out.print("*");
			}
		System.out.println();
		}
	}
}
*/
{
public static void main(String[]args)
	{
	for(int i=1; i<=5; i++)
		{
		for(int j=4; j>=i; j--)
			{
			System.out.print(" ");
			}
		for(int k=1; k<=i; k++)
			{
			System.out.print("*");
			}
		System.out.println();
		}
	for(int i=1; i<=4;i++)
		{
		for(int j=1; j<=i; j++)
			{
			System.out.print(" ");
			}
		for(int k=4; k>=i; k--)
			{

			System.out.print("*");
			}
		System.out.println();
		}
	}
}

/*
{
	public static void main(String[]args)
	{
	for(int i=1; i<=4; i++)		
		{
		for(int j=4; j>=i; j--)
			{
			System.out.print(" ");
			}
		for(int k=1; k<=i; k++)
			{
			System.out.print("*");
			}
		for(int l=2; l<=i; l++)
			{
			System.out.print("*");
			}	
		System.out.println();
		}
	
	}
}

*/