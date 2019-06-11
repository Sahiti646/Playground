import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      System.out.print(square_of_a_number(n));
	}
	public static int square_of_a_number(int a)
	{
	    int result = a * a;
	    return result;
	} 
	} 
