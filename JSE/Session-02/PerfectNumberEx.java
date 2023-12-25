
public class PerfectNumberEx
{
	public static void main(String[] args) {
		
		if(args.length == 0)
		{
			System.out.println("Please pass the number as Argument");
			return;
		}
		int n = Integer.parseInt(args[0]);
		int sum = 0;
		for(int factor = 1; factor < n ; factor++)
		{
			if(n%factor == 0)
			{
				System.out.print(factor+" -- ");
				sum = sum+factor;

			}
		}

		if(sum == n)
		{
			System.out.println(" Given number "+n+" is PerfectNumber");
		}else{
			System.out.println(" Given number "+n+" is not a PerfectNumber");
		}

	}
}
