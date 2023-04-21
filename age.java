import java.util.*;
//import java.util.Scanner;
class DOB
{
int d1,m1,y1, d2,m2,y2, d3,m3,y3;
	public void getsysdate()
	{
	Calendar c=Calendar.getInstance();
	d1=c.get(Calendar.DATE);
	m1=c.get(Calendar.MONTH);
	y1=c.get(Calendar.YEAR);
	}
	public void getbirthdate(int d, int m, int y)
	{
	d2=d;
	m2=m;
	y2=y;
	}
	public void calculate()
	{
	if(d1<d2)
		{
		m1=m1-1;
		d1=d1+30;
		}
	if(m1<m2)
		{
		y1=y1-1;
		m1=m1+12;
		}
	d3=d1-d2;
	m3=m1-m2;
	y3=y1-y2;
	System.out.println("You are - Day : "+ d3 + ", Month : "+ m3 + ", Year :"+y3 +" Years old" );
	}
}
class age
{
public static void main(String...args)
	{
	int d,m,y;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Day:");
	d=sc.nextInt();
	System.out.println("Enter Month:");
	m=sc.nextInt();
	System.out.println("Enter Year:");
	y=sc.nextInt();

	DOB a=new DOB();
	a.getsysdate();
	a.getbirthdate(d, m, y);
	a.calculate();
	}
}