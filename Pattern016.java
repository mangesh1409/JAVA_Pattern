////////////////////////////////////////////////
///		1	1	1	1		///
///		2	2	2	2		///
///		3	3	3	3		///
///		4	4	4	4		///
///////////////////////////////////////////////


import java.util.*;

class Pattern
{
	public void Display(int iRow, int iCol)
	{
		int i=0, j=0;
			
		for(i=1;i<=iRow;i++)
		{
			for(j=0;j<iCol;j++)
			{
				System.out.print(i+"\t");
			}
			System.out.println();
		}	
	}
}

class Pattern016
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
