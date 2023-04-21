import java.util.Scanner;
class website
{
	String req;
	
	void reading()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("search for social media");	
	req=sc.next();

	}
	
	void logic()
	{
	if(req.equals("gmail"))
		{
		System.out.println("GMAIL INBOX");
		}
	else if(req.equals("instagram"))
		{
		System.out.println("INSTAGRAM PAGE");
		}
	else if(req.equals("fb"))
		{
		System.out.println("FACEBOOK PAGE");
		}
	else if(req.equals("google"))
		{
		System.out.println("GOOGLE SEARCH ENGINE");
		}

	else
		{
		System.out.println("OPPS Error searching");
		}

	}

	public static void main(String[]args)
	{
	website s=new website();
	s.reading();
	s.logic();	
	
	}

}
