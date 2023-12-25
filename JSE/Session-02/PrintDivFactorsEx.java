
public class PrintDivFactorsEx
{
	public static void main(String[] args) {
		
		if(args.length == 0)
		{
			System.out.println("Please pass the number as Argument");
			return;
		}
		int n = Integer.parseInt(args[0]);

		for(int factor = 1; factor <= n ; factor++)
		{
			if(n%factor == 0)
			{

				System.out.println(factor);

			}
		}

	}
}
