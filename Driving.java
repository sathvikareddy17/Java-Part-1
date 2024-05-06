import java.util.Scanner;
class Driving 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the speed");
		int speed = sc.nextInt();
		System.out.println("Enter true if it is your birthday else false");
		boolean isbirthday = sc.nextBoolean();
		if(isbirthday == true)
		{
			if(speed <= 61)
			{
				System.out.println("0 ticket");
			}
			else if(speed>=66 && speed <=81)
			{
				System.out.println("1 ticket");
			}
			else 
			{
				System.out.println("2 ticket");
			}
		}
		else
		{
			if(speed <= 60)
			{
				System.out.println("0 ticket");
			}
			else if(speed>=61 && speed <=80)
			{
				System.out.println("1 ticket");
			}
			else if(speed >= 81)
			{
				System.out.println("2 ticket");
			}
		}

		
		
		
	}
}
