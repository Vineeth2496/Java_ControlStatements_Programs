class main
{
public static void main(String[]args)
	{
	int temp=0;
	for(int no=1; no<=100; no++)
		{
		for(int i=2; i<=no-1; i++)
			{
			if(no%i==0)
				{
				temp=temp+1;
				}
			}
		if(temp==0)
			{
			System.out.print(no);
			}
		else
			{
			temp=0;
			}

		}
	}

}
/*
{
public static void main(String[]args)		// to check wheather the number prime number or not
	{
	java.util.Scanner  sc=new java.util.Scanner(System.in);
	System.out.println("Enter number.");
	int no=sc.nextInt();
	int temp=0;
	for(int i=2; i<=no-1; i++)
		{
		if(no%i==0)
			{
			temp=temp+1;
			}
		}
		if(temp==0)
		{
		System.out.println(no+" is a prime number ");
		}
		else
		{
		System.out.println(no+" is not a prime number ");
		}
	}
}

*/


/*
{
	private int a,b,c;
	private char x;
	private String y;

	public main()  	// constructor..  //4  
	{
	a=10;
  	}
	public  main(int a, int b) 
	{
	this.a=a;
	this.b=b;
	}
	public main(int a, int b, int c)
	{
	this.a=a;
    	this.b=b;
   	this.c=c;
  	}
	public main(int a, char x, String y)
  	{
    	this.a=a;
    	this.x=x;
    	this.y=y;
  	}
		public void task1()
   		{
   		System.out.println(" a value is :"+a); //   
   		}
		public     void task2()
        		{
  		System.out.println(" a value is :"+a);
  		System.out.println(" b value is :"+b);
          		}  
		public   void task3()
     		{
  		System.out.println(" a value is :"+a);
  		System.out.println(" b value is :"+b);
  		System.out.println(" c value is :"+c);
     		}
		public void task4()
      		{
  		System.out.println(" a value is :"+a);
 		System.out.println(" x value is :"+x);
  		System.out.println(" y value is :"+y);
  		}
 }		// closging program
class  OOPS3
{
   public static void main(String[]args)  
   {
Developement   d=new Developement();
   d.task1();
 System.out.println("  ===========================");
Developement  d2=new Developement(11,22,33);
d2.task3();  
 System.out.println("  ===========================");
Developement  d3=new Developement(100,'t',"VNCIT");
   d3.task4();
    } 
 }

*/
/*
{
public static int method(int x, int y)
	{
	return x + y;
	}
	public static void main(String[]args)
	{
	System.out.println(method(3, 8));	

	int z = method(4, 5);		//you can stroe the result in variable.
	System.out.println(z);
	}
}
*/
/*
{
static void method(String name, int age)
	{
	System.out.println(name+" is "+age);
	}
void n_method(String fname, int age1)
	{
	System.out.println(fname+" is "+age1);
	}
public static void main(String[]args)
	{
	method("Vineeth",26);
	method("Darling",25);
	main n=new main();
	n.n_method("Vikram",26);
	}
}
*/
/*
{
void fullspeed()
	{
	System.out.println("Car is going as fast as it can.");
	}
void speed(int maxSpeed, int minSpeed)		//Access Methods With an Object. (speed method and added parameters int maxSpeed )
	{
	System.out.println("Maximum Speed: "+maxSpeed);
	System.out.println("Minimum Speed: "+minSpeed);
	}
public static void main(String[]args)
	{
	main myCar=new main();
	myCar.fullspeed();
	myCar.speed(200,20);
	}

}
*/

/*
{
static void staticMethod()
	{ 
	System.out.println("Static method can be called with & without creating object.");
	}

void normalMethod()
	{ 
	System.out.println("Public or Normal method must be called with creating object.");
	}
	public static void main(String[]args)
	{
	staticMethod();
	main method=new main();
	method.normalMethod();
	method.staticMethod();
	}

}
*/
/*
{
static void method()		//static method can be accessed without creating an object of the class, unlike public, which can only be accessed by objects.
	{
	System.out.println("Hello World");
	}
	public static void main(String[]args)
	{
	method();
	}
}
*/

/*
{
String fname = "Vineeth";
String lname = "Armoori";
int age=26;
String Blood_Group="O+";				//Multiple attributes.
public static void main(String[]args)
	{
	main obj1=new main();
	System.out.println("Name: "+obj1.fname+" "+obj1.lname);
	System.out.println("Age: "+obj1.age);
	System.out.println("Blood Group: "+obj1.Blood_Group);
	}
}
*/

/*
{
int x=10;				//declare  attribute as "final" (final int x=10); it will generate error.
public static void main(String[]args)
	{
	main obj1=new main();
	obj1.x=25	;		//override existing values.
	System.out.println(obj1.x);
	}
}
*/

/*
{
int x;
public static void main(String[]args)
	{
	main obj1=new main();
	obj1.x=40	;		//Modify attribute.
	System.out.println(obj1.x);
	}
}
*/

/*
{
int x=5;

public static void main(String[]args)
	{
	main obj1=new main();	//Creating object.
	System.out.println(obj1.x);
	}


}
*/
/*
{
int x=5;

public static void main(String[]args)
	{
	main obj1=new main();
	main obj2=new main();
	obj2.x=25;			//Creating multiple object. and changing value of one object without affecting another object.
	System.out.println(obj1.x);
	System.out.println(obj2.x);
	}
}
*/

/*
{
	
	int x=5;
	int y=7;
	void task1()
	{
	boolean r1= x>3 && x<10;
	boolean r2= x>3 || x<4;
	boolean r3= !(x>3 && x<10);
	System.out.println(r1);
	System.out.println(r2);
	System.out.println(r3);

	}
	public static void main(String[]args)
	{
	main v=new main();
	v.task1();
		double	myDouble	= 9.78;
		int	myInt		= (int)myDouble; 
	
		System.out.println(myDouble);
		System.out.println(myInt);
		System.out.println(3+3);
	
	}
}
*/