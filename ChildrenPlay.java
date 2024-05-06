import java.util.Scanner;
class ChildrenPlay 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of hours played?");
		int played = sc.nextInt();
		boolean isweekend = sc.nextBoolean();
		if(isweekend==false)
		{
			if(played <= 2)
			{
				System.out.println("Mom will not scold");
			}
			else
			{
				System.out.println("Mom will scold");
			}
		}
		else
		{
			if(played <= 3)
			{
				System.out.println("Mom will not scold");
			}
			else
			{
				System.out.println("Mom will scold");
			}
		}

		
		
	}
}
