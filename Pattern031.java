////////////////////////////////////////////////
///		#	*	*	*		///
///		*	#	*	*		///
///		*	*	#	*		///
///		*	*	*	#		///
///////////////////////////////////////////////


import java.util.*;

class Pattern
{
	public void Display(int iRow, int iCol)
	{
		int i=0, j=0;
		
		if(iRow!=iCol)
		{
			return;
		}
		
		for(i=1;i<=iRow;i++)
		{
			for(j=1;j<=iCol;j++)
			{
				if(i==j)
				{
					System.out.print("#\t");
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

class Pattern031
{
	public static void main(String arg[])
	{
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter number of rows");
		int iRow=obj.nextInt();
		
		System.out.println("Enter number of columns");
		int iCol=obj.nextInt();
		
		Pattern pobj=new Pattern();
		pobj.Display(iRow, iCol);		
	}
}
