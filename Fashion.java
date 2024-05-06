import java.util.Scanner;
class Fashion 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int you = sc.nextInt();
		int partner = sc.nextInt();
		if(you >= 8 && partner >= 3 || you >=3 && partner >=8)
		{
			System.out.println("Table Ready ");
		}
		else if(you <= 2 && partner <= 2)
		{
			System.out.println("No table");
		}
		else
		{
			System.out.println("May be");
		}

		
	}
}
