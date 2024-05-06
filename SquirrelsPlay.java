import java.util.Scanner;
class SquirrelsPlay 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		boolean isSummer = sc.nextBoolean();
		int temp = sc.nextInt();
		if(isSummer == true)
		{
			if(temp>=60 && temp<=100)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
		}
		else
		{
			if(temp>=60 && temp<=90)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
		}


	}
}
