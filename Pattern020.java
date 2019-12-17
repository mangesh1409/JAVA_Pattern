///////////////////////////////////////////////////
///		5	4	3	2	1	   ///
///		5	4	3	2	1	   ///
///		5	4	3	2	1	   ///
//////////////////////////////////////////////////


import java.util.*;

class Pattern
{
	public void Display(int iRow, int iCol)
	{
		int i=0, j=0;
			
		for(i=1;i<=iRow;i++)
		{
			for(j=iCol;j>0;j--)
			{
				System.out.print(j+"\t");
			}
			System.out.println();
		}	
	}
}

class Pattern020
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
