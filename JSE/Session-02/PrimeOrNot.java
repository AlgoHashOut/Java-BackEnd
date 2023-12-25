// 5 --> 1,5  Its a Prime
// 9 -> 1, 3, 9 Its not a Prime

// 9 -->  From f:2 to f:8 there is divFactor 3 so its not a prime

public class PrimeOrNot
{
	public static void main(String[] args) {
		
		if(args.length == 0)
		{
			System.out.println("Please pass the number as Argument");
			return;
		}
		int n = Integer.parseInt(args[0]);
		int divFactorCount = 0;

		for(int factor = 2; factor < n ; factor++)
		{
			if(n%factor == 0)
			{
				divFactorCount++;
				break;

			}
		}

		if(divFactorCount == 0)
		{
			System.out.println(" Given number "+n+" is Prime");
		}else{
			System.out.println(" Given number "+n+" is not a Prime");
		}
	}
}
