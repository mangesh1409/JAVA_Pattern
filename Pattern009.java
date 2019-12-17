///////////////////////////////////////////////////////
///		*						///
///		*	*					///
///		*	*	*				///
///		*	*	*	*			///
///		*	*	*	*	*		///
///		*	*	*	*			///
///		*	*	*				///
///		*	*					///
///		*						///
//////////////////////////////////////////////////////


import java.util.*;

class Pattern
{
	public void Display(int iNo)
	{
		int i=0,  j=0;
		
		for(i=0;i<iNo;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("*\t");
			}
			System.out.println();		
		}
		
		for(i=iNo-1;i>0;i--)
		{
			for(j=0;j<i;j++)
			{
				System.out.print("*\t");
			}
			System.out.println();		
		}
	}
}

class Pattern009
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number");
		int value=sobj.nextInt();
		
		Pattern nobj=new Pattern();
		nobj.Display(value);
	}
}
	
