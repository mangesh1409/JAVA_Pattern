///////////////////////////////////////////////////////
///		H	*	*	*	*		///
///		H	e	*	*	*		///
///		H	e	l	*	*		///
///		H	e	l	l	*		///
///		H	e	l	l	o		///
///		H	e	l	l	*		///
///		H	e	l	*	*		///
///		H	e	*	*	*		///
///		H	*	*	*	*		///
//////////////////////////////////////////////////////


import java.util.*;

class Strings
{
	public void Display(String str)
	{
		int i=0, j=0;
		char arr[]=str.toCharArray();
		
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr.length;j++)
			{
				if(j<=i)
				{
					System.out.print(arr[j]+"\t");
				}
				else
				{
					System.out.print("*\t");
				}
			}
			System.out.println();		
		}
	
		for(i=arr.length-2;i>=0;i--)
		{
			for(j=0;j<=arr.length-1;j++)
			{
				if(j<=i)
				{
					System.out.print(arr[j]+"\t");
				}
				else
				{
					System.out.print("*\t");
				}
			}
			System.out.println();		
		}			
	}	
}

class Pattern005
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter string");
		String value=sobj.nextLine();
		System.out.println();
		
		Strings nobj=new Strings();
		nobj.Display(value);
	}
}
	
