class loops3
{
	public static void main(String[]args)
	{
	for(int a=0; a<5; a++)
		{	
		
		for(int b=0; b<a; b++)
			{
			System.out.println("Hello");
			for(int c=0; c<b; c++)
				{
				if(c==3)
				{
				System.out.println("Bye");
				break;
				}
				else
				{
				System.out.println("darling"+c);
				}	
				}

			}
		System.out.println("Hai");
		}
	}
}