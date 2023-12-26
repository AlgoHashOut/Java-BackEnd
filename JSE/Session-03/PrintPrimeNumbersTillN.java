/*
	n = 10 : PrimeNumbers : 2, 3, 5, 7
*/

public class PrintPrimeNumbersTillN
{
	public static void main(String[] args) {
		
		if(args.length == 0)
		{
			System.out.println("Please pass the number of rows as Argument");
			return;
		}
		int number = Integer.parseInt(args[0]);

		for(int i = 2; i <= number; i++)
		{
				int p = i;
				int divFactCount = 0;

				for(int factor = 2; factor < p ; factor++)
				{
					if(p%factor == 0)
					{
						divFactCount++;
						break;
					}
				}

			if(divFactCount == 0)
			{
				System.out.print(p +" ");
			}
		}
	}
}





