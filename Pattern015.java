/////////////////////////////////////////////////
///		A	A	A	A		///
///		B	B	B	B		///
///		C	C	C	C		///
///		D	D	D	D		///
///////////////////////////////////////////////


import java.util.*;

class Pattern
{
	public void Display(int iRow, int iCol)
	{
		int i=0, j=0;
		char ch;
			
		for(i=1,ch='A';i<=iRow;i++,ch++)
		{
			for(j=0;j<iCol;j++)
			{
				System.out.print(ch+"\t");
			}
			System.out.println();
		}	
	}
}

class Pattern015
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
