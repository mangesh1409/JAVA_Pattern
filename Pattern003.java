///////////////////////////////////////////////////////
///		H						///
///		H	e					///
///		H	e	l				///
///		H	e	l	l			///
///		H	e	l	l	o		///
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
			for(j=0;j<=i;j++)
			{
				System.out.print(arr[j]+"\t");
			}
			System.out.println();		
		}
	}
}

class Pattern003
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
	
