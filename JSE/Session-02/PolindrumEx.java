
// 123 --> 321 Its not a polindrum
// 121 --> 121 true

/* 
	n = 123, rev = 0
	--> I must get last digit(r = n%10 = 123%10) -->  r = 3  
					: rev = rev * 10 + r = rev = 0*10 + 3 = 3
	--> (n = n/10 = 123/10 = 12) 
		n = 12,  rev = 3

	-->  r = 12%10 = 2
		 rev = rev * 10 + r = 3 * 10 + 2 = 32
		 n = n/10 = 12/10 = 1

	--> n= 1 : rev = 32
		r = 1%10 = 1
		rev = 32*10 + 1 = 321
		n = 1/10 = 0;

		As the n is zero we stop the flow:

*/

public class PolindrumEx
{
	public static void main(String[] args) {
		
		if(args.length == 0)
		{
			System.out.println("Please pass the number");
			return;
		}

		int n = Integer.parseInt(args[0]);
		int temp = n;
		int rev = 0;
		while(n > 0)
		{
			int r = n%10;
			rev = rev * 10 + r;
			n = n/10;
		}

		if(rev == temp)
		{
			System.out.println("Given Number "+temp+ " is Polindrum");
		}else{
			System.out.println("Given Number "+temp+ " is not a Polindrum");
		}


	}
}




