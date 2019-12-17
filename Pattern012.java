//////////////////////////////////////////////////////
///		*	*	*	*	*		///
///			*	*	*	*		///
///				*	*	*		///
///					*	*		///
///						*		///
///					*	*		///
///				*	*	*		///
///			*	*	*	*		///
///		*	*	*	*	*		///
//////////////////////////////////////////////////////



import java.util.*;

class Pattern
{
	public void Display(int iNo)
	{
		int i=0,  j=0;
		
		for(i=0;i<iNo;i++)
		{
			for(j=0;j<iNo;j++)
			{
				if(j<i)
				{
					System.out.print(" \t");
				}
				else
				{
					System.out.print("*\t");
				}
			}
			System.out.println();		
		}
		
		for(i=0;i<iNo-1;i++)
		{
			for(j=0;j<iNo;j++)
			{
				if(j<(iNo-2)-i)
				{
					System.out.print("\t");
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

class Pattern012
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
	
