import java.util.Scanner;
class Grades 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char grade = sc.next().charAt(0);

		if(grade == 'A' || grade =='a')
		{
			System.out.println("First class");
		}
		else if(grade == 'B' || grade == 'b')
		{
			System.out.println("Second class");
		}
		else if(grade =='C' || grade == 'c')
		{
			System.out.println("Third class");
		}
		else if(grade == 'D' || grade=='d')
		{
			System.out.println("Word hard");
		}
		else if(grade == 'F' || grade == 'f')
		{
			System.out.println("Dont worry .You can do it.Work hard");
		}
		else
		{
			System.out.println("entered invalid input");
		}

		
	}
}
