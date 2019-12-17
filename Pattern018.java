////////////////////////////////////////////////
///		1	2	3	4		///
///		5	6	7	8		///
///		9	10	11	12		///
///////////////////////////////////////////////


import java.util.*;

class Pattern
{
	public void Display(int iRow, int iCol)
	{
		int i=0, j=0, temp=0;
			
		for(i=1;i<=iRow;i++)
		{
			for(j=1;j<=iCol;j++)
			{	
				temp++;
				System.out.print(temp+"\t");
			}
			System.out.println();
		}	
	}
}

class Pattern018
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
