import java.util.Scanner;
class VacationAlaram 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1 to 6 any day");
		int day = sc.nextInt();
		System.out.println("Enter on vacation - true,not on vacation -false");
		boolean isVacation = sc.nextBoolean();
		if(isVacation==true)
		{
			if(day>=1 && day<=6)
			{
				System.out.println("Alaram at 10");
			}
			else
			{ 
				System.out.println("no alaram");
			}
		}
		else
		{
			if(day>=1 && day<=6)
			{
				System.out.println("Alaram at 7");
			}
			else
			{
				System.out.println("Alaram at 10");
			}
		}

	}
}
