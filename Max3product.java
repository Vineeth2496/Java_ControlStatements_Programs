import java.util.*;
class Max3product
{
public static int maxpro(int arr[])
	{
	// find min1, min2, max1, max2, max3
	int min1=Integer.MAX_VALUE;
	int min2=min1;

	int max1=Integer.MIN_VALUE;
	int max2=max1;
	int max3=max1;

	for(int i=0; i<arr.length; i++)
		{
		// check Max value
		int val=arr[i];
		if(val >= max1)
			{
			max3=max2;
			max2=max1;
			max1=val;
			}
		else if(val >=max2)
			{
			max3=max2;
			max2=val;
			}
		else if(val >=max3)
			{
			max3=val;
			}
		// Chenk Min values
		if(val <= min1)
			{
			min2=min1;
			min1=val;
			}
		else if(val <= min2)
			{
			min2=val;
			}
		}
		// Compare
		return Math.max(min1*min2*max1, max1*max2*max3);	// if two -ve min integers occured
	//	return max1*max2*max3;					// if all +ve integers occured
	}
public static void main(String...args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Length of an Array");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter Array Elements");
	for(int i=0; i<n; i++)
		{
		arr[i]=sc.nextInt();
		}
	int prod=maxpro(arr);
		
	System.out.println("Product of Max 3 numbers: "+prod);

	}
}