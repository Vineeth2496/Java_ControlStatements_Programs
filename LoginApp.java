class LoginApp
{
	String username	="vineeth.jb14@gmail.com";
	String password	="vineeth@96";
	String u_id;
	String pass;
	
	void inputs()
		{
		java.util.Scanner sr=new java.util.Scanner(System.in);
		System.out.println("Enter User name:");
		u_id=sr.next();
		System.out.println("Enter Password:");
		pass=sr.next();
		}
	void logic()
		{
		if(u_id.equals(username) && pass.equals(password))
			{
			System.out.println("******************");
			System.out.println("*WELCOME TO GMAIL*");
			System.out.println("******************");				

			}
		else
			{
			System.out.println("Invalid Username or Password, please enter valid Username or Password");			
			}	


		}

	public static void main(String[]args)
		{
		LoginApp g=new LoginApp();
		g.inputs();
		g.logic();

		}
}