public class Solution 
{
public static void main(String[] args) 
{
	for(int i=1;i<=5;i++)
	{
		for(int j=5;j>=i;j--)
		{
			System.out.print(i);
		}
			
         System.out.println();
}  } }
Output:-

11111
2222
333
44
5
////////////////////////////////////////////////////////////
public class Solution 
{
public static void main(String[] args) 
{
	for(int i=1;i<=5;i++)
	{
		for(int j=5;j>=i;j--)
		{
			System.out.print(j);
		}
			
         System.out.println();
}  } }
Output:-

54321
5432
543
54
5
//////////////////////////////////////////////////////////////
public class Solution 
{
public static void main(String[] args) 
{
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}
			
         System.out.println();
}  } }
Output:-

1
12
123
1234
12345
////////////////////////////////////////////////////////////
public class Solution 
{
public static void main(String[] args) 
{
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(i);
		}
			
         System.out.println();
}  } }
Output:-

1
22
333
4444
55555
////////////////////////////////////////////////////////////////
public class Solution 
{
public static void main(String[] args) 
{
	int count=0;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			count=count+1;
			System.out.print(count+" ");
		}
			
         System.out.println();
}  } }
Output:-

1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
/////////////////////////////////////////////////////////////
public class Solution 
{
public static void main(String[] args) 
{
	for(int i=1;i<=5;i++)
	{
		for(int j=i;j>=1;j--)
		{
			System.out.print(j+" ");
		}
			
         System.out.println();
}  } }
Output:-

1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1 
///////////////////////////////////////////////////////
public class Solution 
{
public static void main(String[] args) 
{
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j+" ");
		}
			for(int k=i-1;k>=1;k--)
			{
				System.out.print(k+" ");
			}
         System.out.println();
}  } }
Output:-

1 
1 2 1 
1 2 3 2 1 
1 2 3 4 3 2 1 
1 2 3 4 5 4 3 2 1 
//////////////////////////////////////////////////////
public class Solution 
{
public static void main(String[] args) 
{
	
	for(int i=1;i<=5;i++)
	{
		int no=i;
		for(int j=1;j<=i;j++)
		{
			System.out.print(no+" ");
			no=no+5-j;
		}
         System.out.println();
}  } }
Output:-

1 
2 6 
3 7 10 
4 8 11 13 
5 9 12 14 15 
//////////////////////////////////////////////////////////
public class Solution 
{
public static void main(String[] args) 
{
	
	for(int i=1;i<=5;i++)
	{
		for(int j=4;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print(k+" ");
		}
         System.out.println();
}  } }
Output:-

    1 
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5 
///////////////////////////////////////////////////////
public class Solution 
{
public static void main(String[] args) 
{
	
	for(int i=5;i>=0;i--)
	{
		for(int j=1;j<=i;++j)
		{
			System.out.print(j+" ");
		}
         System.out.println();
}  } }
Output:-

1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
///////////////////////////////////////////////////////////
public class pattern
{  
     public static void main(String[] args)
     {  
    for(int i=1;i<=10;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(i*j+" ");  
        }  
         System.out.println("");  
    }  
  }  
}  
Output:

1 
2 4 
3 6 9 
4 8 12 16 
5 10 15 20 25 
6 12 18 24 30 36 
7 14 21 28 35 42 49 
8 16 24 32 40 48 56 64 
9 18 27 36 45 54 63 72 81 
10 20 30 40 50 60 70 80 90 100 
/////////////////////////////////////////////////////////////////////////
public class Pattern   
{  
    public static void main(String[] args)   
    {  
        for(int i = 0 ; i <= 5 ; i++)  
        {  
        for(int j = 0 ; j <= i ; j++)  
        {  
            System.out.print(" "+(char)(65 + i));  
        }  
            System.out.println("");  
        }  
    }  
}  
Output:

 A
 B B
 C C C
 D D D D
 E E E E E
 F F F F F F
/////////////////////////////////////////////////////////////////////

public class PatternBox   
{  
    public static void main(String[] args) 
    {  
        for (int i = 1; i <= 10; i++)   
    {   
        for (int j = 1; j <= 10; j++)   
        {   
            if (i==1 || i==10 || j==1 || j==10 )               
                System.out.print(" 1");    
            else  
                System.out.print("  ");                 
        }   
        System.out.println();   
    }  
        }}  
Output:

 1 1 1 1 1 1 1 1 1 1
 1                 1
 1                 1
 1                 1
 1                 1
 1                 1
 1                 1
 1                 1
 1                 1
 1 1 1 1 1 1 1 1 1 1
///////////////////////////////////////////////////////////////
public class PatternBox 
{
public static void main(String[] args) 
{
	
	for(int i=5;i>=0;i--)
	{
		for(int j=1;j<=i;++j)
		{
			System.out.print(i+" ");
		}
         System.out.println();
}  } }
Output:

5 5 5 5 5 
4 4 4 4 
3 3 3 
2 2 
1 
/////////////////////////////////////////////////////////////////

public class PetturnProgram  
{  
    public static void main(String[] args) 
    {  
        for (int i = 1; i <= 10; i++)  
    {  
        for (int j = 1; j <= 10; j++)  
        {  
            if (i==1 || i==10 || j==1 || j==10 )  
                System.out.print("1");  
            else  
                System.out.print(" ");  
        }  
        System.out.println();  
    }  
   }}  
Output:

1111111111
1        1
1        1
1        1
1        1
1        1
1        1
1        1
1        1
1111111111
//////////////////////////////////////////////////////////

public class bbb 
 {
    public static void main(String[] args)
	{
        for(int i=1;i<=5;i++)
        {
        	for(int j=1;j<=i;j++)
        	{
        		if((i+j)%2==0)
        		{
        		    System.out.print("0");
        		}
        		else
        		{
        			System.out.print("1");
        		}
        	  }
        	System.out.println();
        }
	}
}
Output:

0
10
010
1010
01010
///////////////////////////////////////////////////////////

public class TestSolution
{
	public static void main(String[] args) 
	{
				for(int i=1;i<=5;i++)
				{
					int num=1;
					for(int j=1;j<=5-i+1;j++)
					{
						System.out.print(num);
						num++;
					}
				    for(int k=1;k<=2*i-2;k++)
				    {
					System.out.print(" ");
				    }
				    int num2=1;
				    for(int j=1;j<=5-i+1;j++)
				    {
						System.out.print(num2);
						num2++;
				    }
				  System.out.println();
	            }        
					for(int i=4;i>=1;i--)
					{
						int num=1;
						for(int j=i;j<=5;j++)
						{
							System.out.print(num);
							num++;
					    }
						for(int k=1;k<=(2*i)-2;k++)
						{
							System.out.print(" ");
						}
						int num2=1;
						for(int j=i;j<=5;j++)
						{
							System.out.print(num2);
							num2++;
						}
						System.out.println();
			        }
		}   }

Output:-

1234512345
1234  1234
123    123
12      12
1        1
12      12
123    123
1234  1234
1234512345
//////////////////////////////////////////////////////////////////////