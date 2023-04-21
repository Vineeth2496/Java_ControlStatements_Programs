class day
{
	int x	= 20;
	void time()
		{
		if(x<18)
		{
		System.out.println("Good Morning");
		}
		else if (x>22)
		{
		System.out.println("Good Evening");
		}
		else
		{
		System.out.println("Good Day");
		}

		}
	public static void main(String[]args)
		{
		day t = new day();
		t.time();
		}
  



}