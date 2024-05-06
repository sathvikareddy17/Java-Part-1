import java.util.Scanner;
class Sum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a+b;
		if(sum >=10 && sum<=19)
		{
			System.out.println(20);
		}
		else
		{
			System.out.println(sum);
		}

		
	}
}
