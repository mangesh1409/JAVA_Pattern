/////////////////////////////////////////////////
///		A	B	C	D		///
///		a	b	c	d		///
///		A	B	C	D		///
///		a	b	c	d		///
///////////////////////////////////////////////


import java.util.*;

class Pattern
{
	public void Display(int iRow, int iCol)
	{
		int i=0, j=0;
		char ch;
			
		for(i=1;i<=iRow;i++)
		{
			if(i%2==0)
			{
				for(j=0,ch='a';j<iCol;j++,ch++)
				{
					System.out.print(ch+"\t");
				}
				System.out.println();
			}
			else
			{
				for(j=0,ch='A';j<iCol;j++,ch++)
				{
					System.out.print(ch+"\t");
				}
				System.out.println();
			}	
		}			
	}
}

class Pattern014
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
