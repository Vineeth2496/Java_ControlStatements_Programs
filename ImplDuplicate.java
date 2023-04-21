interface Alien
{
	void duplicate();
}

class Duplicate implements Alien
{
	public void duplicate()
	{
	Integer arr1[]=new Integer[]{1, 2, 1, 2, 3, 4};
	
	for(int i=0; i<arr1.length; i++)
		{
		for(int j=i+1; j<arr1.length; j++)
			{
			if(arr1[i]==arr1[j])
				{
				System.out.println("Duplicate number is: "+arr1[j]);
				}
			}
		}
	}
}

class ImplDuplicate
{
public static void main(String[]args)
	{
	Alien a=new Duplicate();
	a.duplicate();
	}
}