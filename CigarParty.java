import java.util.Scanner;
class CigarParty 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int cigars = sc.nextInt();
		boolean isweekend = sc.nextBoolean();
		if(isweekend==true)
		{
			if(cigars >=40)
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
			if(cigars>=40 && cigars<=60)
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
