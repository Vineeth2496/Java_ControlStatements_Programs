class zomato
{
	String req;
        int a;
      String b;
int tot;	
int qun;
int x,y,z;

	java.util.Scanner sc=new java.util.Scanner(System.in);

	
	void logic2()

   {

	
	do
      {

	System.out.println("****************************************");     

	System.out.println("***********WELCOME TO ZOMOTO***********");     

	System.out.println("****************************************");     
	System.out.println("****************************************");     

	System.out.println("1.PARADISE");     
	System.out.println("2.MOGALAI");     
	System.out.println("3.KRUTHUNGA");     
	System.out.println("4.BHAVARCHI");     

	System.out.println("****************************************");     
	
System.out.println("****************************************");     
				 
	System.out.println("ENTER YOUR FAV RESTARUNT :");     
	
	x=sc.nextInt();
         switch(x)
	{
	      case 1:
		{
System.out.println("****************************************************");     
System.out.println("****************WELECOME TO PARADISE****************");     
System.out.println("****************************************************");     
System.out.println("---------------CHOICE VEG OR NON-VEG----------------");
System.out.println("1.VEG");
System.out.println("2.NON-VEG");

	System.out.println("ENTER YOUR CHIOCE");     

y=sc.nextInt();
switch(y)
{
case 1:
{
System.out.println("****************************************************");     
System.out.println("*****************YOU SELECTED VEG********************");  
System.out.println("1.VEG BIRIYANI");
System.out.println("2.PANNER BIRIYANI");
System.out.println("3.MIXED BIRIYANI");
System.out.println("****************************************************");     

System.out.println("****************************************************");     
System.out.println("****************SELECTE YOUR FAV ITEM****************");  


	System.out.println("ENTER YOUR CHIOCE");     

z=sc.nextInt();
switch(z)
{
case 1:
{

System.out.println("*****************YOU SELECTED VEG BIRIYANI********************");  

System.out.println("ENTER YOUR QUNITITY");     
qun=sc.nextInt();
int vegb=200;
int tax=10;
int gst=20;
System.out.println("TAX ="+tax);     
System.out.println("GST = "+gst);     
System.out.println("Num of Items "+qun);     

tot=qun*vegb+tax+gst;
System.out.println("YOUR TOATAL BILL IS "+tot);     

break;

}
case 2:
{
System.out.println("*****************YOU SELECTED PANNER BIRIYANI********************");  
System.out.println("ENTER YOUR QUNITITY");     
qun=sc.nextInt();
int pb=260;
tot=qun*pb;
System.out.println("YOUR TOATAL BILL IS "+tot);     


break;
}
case 3:
{
System.out.println("*****************YOU SELECTED MIXED BIRIYANI********************");  
System.out.println("ENTER YOUR QUNITITY");     
qun=sc.nextInt();
int mb=200;
tot=qun*mb;
System.out.println("YOUR TOATAL BILL IS "+tot);     


break;
}


}



break;
}
case 2:
{

System.out.println("****************************************************");     
System.out.println("*****************YOU SELECTED NON-VEG********************");  
System.out.println("1.Chicken BIRIYANI");
System.out.println("2.MUTTON BIRIYANI");
System.out.println("3.PRAWNS BIRIYANI");
System.out.println("****************************************************");     


break;
}



}

System.out.println("****************************************************");          

				break;
		}





	      case 2:
		{
			
	}

	 }// closing switch
	System.out.println("enter yes or no");
	 b=sc.next();

      }// closing do
	
	while(b.equals("yes"));
	
					 
	
}

	public static void main(String[]args)

{
	zomato z=new zomato();
		
	z.logic2();
}    
				


}

                                                                                                                                                                                                                                                         

