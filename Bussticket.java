class Bussticket
{
	int tic;
	int a;
	java.util.Scanner sc=new java.util.Scanner(System.in);
	void tickets()
	{
		do
		{

		System.out.println("*******WELCOME TO TSRTC********");
		System.out.println("*******************************");
		System.out.println("1.SELECT FROM KORUTLA TO JAGTIAL");
		System.out.println("2.SELECT FROM KORUTLA TO KARIMNAGAR");
		System.out.println("3.SELECT FROM KORUTLA TO SIDDIPET");	
		System.out.println("4.SELECT FROM KORUTLA TO PRAGNAPUR");
		System.out.println("5.SELECT FROM KORUTLA TO HYDERABAD");
		System.out.println("6.SELECT FROM JAGTIAL TO KARIMNAGAR");
		System.out.println("7.SELECT FROM JAGTIAL TO SIDDIPET");
		System.out.println("8.SELECT FROM JAGTIAL TO PRAGNAPUR");
		System.out.println("9.SELECT FROM JAGTIAL TO HYDERABAD");
		System.out.println("10.SELECT FROM KARIMNAGAR TO SIDDIPET");
		System.out.println("11.SELECT FROM KARIMNAGAR TO PRAGNAPUR");
		System.out.println("12.SELECT FROM KARIMNAGAR TO HYDERABAD");
		System.out.println("13.SELECT FROM SIDDIPET TO PRAGNAPUR");
		System.out.println("14.SELECT FROM SIDDIPET TO HYDERABAD");
		System.out.println("15.SELECT FROM PRAGNAPUR TO HYDERABAD");
		tic = sc.nextInt();
		System.out.println("Enter number of tickets to book");
		int qty=sc.nextInt();
  
		switch(tic)
		{
		case 1:
			{
			System.out.println("KORUTLA TO HYDERABAD EXPRESS");
			System.out.println("FROM KORUTLA TO JAGITIAL");
			int krtl_jgtl	= 30;
			int krtl_karm	= 85;
			int krtl_sidd	= 160;
			int krtl_prg	= 210;
			int krtl_Hyd 	= 270;
			int total_price=krtl_jgtl*qty;
			System.out.println("TOTAL AMOUNT:"+total_price);
			break;				
			}

		case 2:
			{
			System.out.println("KORUTLA TO HYDERABAD EXPRESS");
			System.out.println("FROM KORUTLA TO KARIMNAGAR");
			int krtl_jgtl	= 30;
			int krtl_karm	= 85;
			int krtl_sidd	= 160;
			int krtl_prg	= 210;
			int krtl_Hyd 	= 270;
			int total_price=krtl_karm*qty;
			System.out.println("TOTAL AMOUNT:"+total_price);
			break;
	
			}

		case 3:
			{
			System.out.println("KORUTLA TO HYDERABAD EXPRESS");
			System.out.println("FROM KORUTLA TO SIDDIPET");
			int krtl_jgtl	= 30;
			int krtl_karm	= 85;
			int krtl_sidd	= 160;
			int krtl_prg	= 210;
			int krtl_Hyd 	= 270;
			int total_price=krtl_sidd*qty;
			System.out.println("TOTAL AMOUNT:"+total_price);
			break;				
			}

		case 4:
			{
			System.out.println("KORUTLA TO HYDERABAD EXPRESS");
			System.out.println("FROM KORUTLA TO PRAGNAPUR");
			int krtl_jgtl	= 30;
			int krtl_karm	= 85;
			int krtl_sidd	= 160;
			int krtl_prg	= 210;
			int krtl_Hyd 	= 270;
			int total_price=krtl_prg*qty;
			System.out.println("TOTAL AMOUNT:"+total_price);
			break;				
			}

		case 5:
			{
			System.out.println("KORUTLA TO HYDERABAD EXPRESS");
			System.out.println("FROM KORUTLA TO HYDERABAD");
			int krtl_jgtl	= 30;
			int krtl_karm	= 85;
			int krtl_sidd	= 160;
			int krtl_prg	= 210;
			int krtl_Hyd 	= 270;
			int total_price=krtl_Hyd*qty;
			System.out.println("TOTAL AMOUNT:"+total_price);
			break;	
			
			}

		case 6:
			{
			System.out.println("KORUTLA TO HYDERABAD EXPRESS");
			System.out.println("FROM JAGITIAL TO KARIMNAGAR");
			int jgtl_karm	= 30;
			int jgtl_sidd	= 85;
			int jgtl_prg	= 160;
			int jgtl_Hyd	= 210;
			int total_price=jgtl_karm*qty;
			System.out.println("TOTAL AMOUNT:"+total_price);
			break;
			}
		case 7:
			{
			System.out.println("KORUTLA TO HYDERABAD EXPRESS");
			System.out.println("FROM JAGITIAL TO SIDDIPET");
			int jgtl_karm	= 30;
			int jgtl_sidd	= 85;
			int jgtl_prg	= 160;
			int jgtl_Hyd	= 210;
			int total_price=jgtl_sidd*qty;
			System.out.println("TOTAL AMOUNT:"+total_price);
			break;
			}

		case 8:
			{
			System.out.println("KORUTLA TO HYDERABAD EXPRESS");
			System.out.println("FROM JAGITIAL TO PRAGNAPUR");
			int jgtl_karm	= 30;
			int jgtl_sidd	= 85;
			int jgtl_prg	= 160;
			int jgtl_Hyd	= 210;
			int total_price=jgtl_prg*qty;
			System.out.println("TOTAL AMOUNT:"+total_price);
			break;
			}

		case 9:
			{
			System.out.println("KORUTLA TO HYDERABAD EXPRESS");
			System.out.println("FROM JAGITIAL TO HYDERABAD");
			int jgtl_karm	= 30;
			int jgtl_sidd	= 85;
			int jgtl_prg	= 160;
			int jgtl_Hyd	= 210;
			int total_price=jgtl_Hyd*qty;
			System.out.println("TOTAL AMOUNT:"+total_price);
			break;
			}

		case 10:
			{
			System.out.println("KORUTLA TO HYDERABAD EXPRESS");
			System.out.println("FROM KARIMNAGAR TO SIDDIPET");
			int karm_sidd	= 55;
			int karm_prg	= 120;
			int karm_Hyd	= 190;
			int total_price=karm_sidd*qty;
			System.out.println("TOTAL AMOUNT:"+total_price);
			break;
			}
		case 11:
			{
			System.out.println("KORUTLA TO HYDERABAD EXPRESS");
			System.out.println("FROM KARIMNAGAR TO PRAGNAPUR");
			int karm_sidd	= 55;
			int karm_prg	= 120;
			int karm_Hyd	= 190;
			int total_price=karm_prg*qty;
			System.out.println("TOTAL AMOUNT:"+total_price);
			break;
			}
		case 12:
			{
			System.out.println("KORUTLA TO HYDERABAD EXPRESS");
			System.out.println("FROM KARIMNAGAR TO HYDERABAD");
			int karm_sidd	= 55;
			int karm_prg	= 120;
			int karm_Hyd	= 190;
			int total_price=karm_Hyd*qty;
			System.out.println("TOTAL AMOUNT:"+total_price);
			break;
			}
		case 13:
			{
			System.out.println("KORUTLA TO HYDERABAD EXPRESS");
			System.out.println("FROM SIDDIPET TO PRAGNAPUR");
			int sidd_prg	= 60;
			int sidd_Hyd	= 120;
			int total_price=sidd_prg*qty;
			System.out.println("TOTAL AMOUNT:"+total_price);
			break;
			}
		case 14:
			{
			System.out.println("KORUTLA TO HYDERABAD EXPRESS");
			System.out.println("FROM SIDDIPET TO HYDERABAD");
			int sidd_prg	= 60;
			int sidd_Hyd	= 120;
			int total_price=sidd_Hyd*qty;
			System.out.println("TOTAL AMOUNT:"+total_price);
			break;
			}
		case 15:
			{
			System.out.println("KORUTLA TO HYDERABAD EXPRESS");
			System.out.println("FROM PRAGNAPUR TO HYDERABAD");
			int prg_Hyd	= 80;
			int total_price=prg_Hyd;
			System.out.println("TOTAL AMOUNT:"+total_price);
			break;
			}
		default:
			{
			System.out.println("INVALID DISTINATION OF BUS");
			}

		}
		System.out.println("Enter YES(1) or NO(2) for New booking");
		a=sc.nextInt(); 
	}
	while(a==1);

	}

	public static void main(String[]args)
	{
		Bussticket b=new Bussticket();
		b.tickets();
	}

}
