class FindDuplicateElements1
{
	public static void main(String[]args)
	{
	String st="katherine langford";
	int length=st.length();
	char ch[]=st.toCharArray();
	for(int i=0; i<length; i++)
		{
		for(int j=i+1; j<length; j++)
			{
			if(ch[i]==ch[j])
				{
				System.out.println("Duplicate Characters are: "+ ch[j]);
				}
			}
		}

	}
}
/*
{
	public static void main(String[]args)
	{
	int a[]={2,3,3,6,7,6,5,2,6};
	System.out.print("Duplicate values are: ");
	for(int i=0; i<a.length-1; i++)
		{
		for(int j=i+1; j<a.length; j++)
			{
				if((a[i]==a[j])&&(i!=j))
				{
				System.out.print(a[j]+", ");
				}
			}
		}

	}
}
*/