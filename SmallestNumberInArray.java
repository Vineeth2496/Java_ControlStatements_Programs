import java.util.*;
class SmallestNumberInArray
{
public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter length of an array: ");
	Integer length=sc.nextInt();
	Integer a[]=new Integer[length];
	Integer smallnumber;
	System.out.println("Entered array elements:");	
	for(int i=0; i<length; i++) 
		{
		a[i]=sc.nextInt();
		}

	System.out.println("Entered array elements are: "+Arrays.toString(a));
	
	System.out.println("Enter 'k' th smallest number from array: ");
	int k=sc.nextInt();

/*	// fixed values an array
	Integer count=0;
	Integer a[]=new Integer[]{52,64,113,46,224,66,1,9,220};
	for(int x:a)
		{
		count++;
		}
*/
	for(int i=0;i<length;i++)
		{
		for(int j=i+1;j<length;j++)		
			{
			if(a[i]<a[j])  		//smallest number && for largest number if(a[i]>a[j])
				{
				smallnumber=a[i];
				a[i]=a[j];
				a[j]=smallnumber;
				}
			}
		}
	smallnumber=a[length-k];		
System.out.println("The 'k' th : " + k + " smallest number in an array is : "+smallnumber);
   }
}