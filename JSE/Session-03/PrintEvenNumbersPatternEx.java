/*
	2

	2  4

	2  4   6

	2  4   6   8

	2  4   6   8  10
*/

public class PrintEvenNumbersPatternEx
{
	public static void main(String[] args) {
		
		if(args.length == 0)
		{
			System.out.println("Please pass the number of rows as Argument");
			return;
		}
		int n = Integer.parseInt(args[0]);

		for(int row = 1; row <= n; row++)
		{
			int colCount = 1;
			int col = 2;
			while(colCount <= row)
			{
				if(col % 2 == 0)
				{
					System.out.print(col+"  ");
					colCount++;
				}
				col++;
			}
			System.out.println();
		}

	}
}





