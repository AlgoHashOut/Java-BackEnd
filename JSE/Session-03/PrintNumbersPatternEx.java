/*
	1

	1  2

	1  2   3

	1  2   3   4

	1  2   3   4   5
*/

public class PrintNumbersPatternEx
{
	public static void main(String[] args) {
		
		if(args.length == 0)
		{
			System.out.println("Please pass the number as Argument");
			return;
		}
		int n = Integer.parseInt(args[0]);

		for(int row = 1; row <= n; row++)
		{
			for(int col = 1; col <= row ; col++)
			{
				System.out.print(col+"  ");
			}
			System.out.println();
		}

	}
}





