import java.util.Scanner;

public class EvenOrOddEx2
{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number --> ");

		int number =  scan.nextInt(); 

		if(number % 2 == 0)
		{
			System.out.println(number +" is Even");
		}else{

			System.out.println(number +" is Odd");
		}



	}
}