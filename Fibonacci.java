class Fibonacci
{
public static void main(String[]args)
	{
	int a=0, b=1, c, i;
	for(i=0; i<=20; i++)
	{
	c=a+b;
	a=b;
	b=c;
	System.out.println(b);
	}

	}

}