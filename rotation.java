class rotation
{
	int a=30, b=20;
	void logic()
	{
	int e=10;
	int s=1;
	while(s!=e)
		{
		int r1= a + b;
		System.out.println("Your result value is:"+r1);
		s++;
		System.out.println("Rotation are"+s);

		}	

	}
	public static void main(String[]args)
	{
	rotation r=new rotation();
	r.logic();
	
	}

}