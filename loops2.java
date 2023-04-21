class loops2
{
	public static void main(String[]args)
	{
	int i=10;
	System.out.println(i++);
	System.out.println(++i);

	for(int a=0; a<5; ++a)
		{
		System.out.println("Hai");
		for(int b=0; b<a; ++b)
			{
			System.out.println("Hello");
			}
		}

	
	}


}