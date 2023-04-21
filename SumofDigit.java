import java.util.*;
class SumofDigit
{
public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String Values: ");
	String str=sc.next();
	System.out.println("Your String is: "+str);

	String temp="0";
	Integer sum=0, count=0, count1=0, sumofdigit;

	char word[]=str.toCharArray();
	for(int x:word)
		{
		count++;	
		}
	
	for(int i=0; i<count; i++)
		{
	//	char ch=str.charAt(i);
		
		if(Character.isDigit(word[i]))
			{
			count1=count1+word[i];
			System.out.println("No of digits in the given String: "+word[i]);
			sumofdigit=Integer.parseInt(String.valueOf(word[i]));
			sum=sum + sumofdigit;		
			}

		}

		
		System.out.println("Sum of all digits in a given string: "+sum);
		if(sum%2==0)
		{
		System.out.println("Sum is Even Number");	
		}
		else
		{
		System.out.println("Sum is Odd Number");	
		}
	}
}