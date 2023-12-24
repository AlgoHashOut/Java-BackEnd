public class EvenOrOdd
{
	public static void main(String[] args) {

		// Queficient (/) , Reminder (%)
		// Ex : int c = 7/3 --> returns 2
		// Ex : int c = 7%3 --> returns 1

		if(args.length == 0)
		{
			System.out.println(" Please pass number as command line Argument");
			return;
		}

		int number =  Integer.parseInt(args[0]); 

		if(number % 2 == 0)
		{
			System.out.println(number +" is Even");
		}else{

			System.out.println(number +" is Odd");
		}



	}
}