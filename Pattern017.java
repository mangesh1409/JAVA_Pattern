////////////////////////////////////////////////
///		4	4	4	4		///
///		3	3	3	3		///
///		2	2	2	2		///
///		1	1	1	1		///
///////////////////////////////////////////////


import java.util.*;

class Pattern
{
	public void Display(int iRow, int iCol)
	{
		int i=0, j=0;
			
		for(i=iRow;i>0;i--)
		{
			for(j=0;j<iCol;j++)
			{
				System.out.print(i+"\t");
			}
			System.out.println();
		}	
	}
}

class Pattern017
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
