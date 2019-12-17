///////////////////////////////////////////////////////
///		0	*	*	*			///
///		1	1	*	*			///
///		2	3	5	*			///
///		8	13	21	34			///
//////////////////////////////////////////////////////


import java.util.*;

class Number
{
	public void Display(int iNo)
	{
		int i=0, first=0, second=1, next=0, j=0;
		
		for(i=0;i<iNo;i++)
		{
			for(j=0;j<iNo;j++)
			{
				if(j>i)
				{
					System.out.print("*\t");
				}
				else
				{
					System.out.print(first+"\t");
					next=first+second;
					first=second;
					second=next;	
				}
			}
			System.out.println();		
		}
	}
}

class Pattern002
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number");
		int value=sobj.nextInt();
		
		Number nobj=new Number();
		nobj.Display(value);
	}
}
	
