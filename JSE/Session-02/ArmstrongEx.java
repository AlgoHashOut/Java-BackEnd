 
/* 
Armstrong number n = 153 : 1^3 + 5^3 + 3^3  = 1+125+ 27 = 153 equals 153

n:153 sum:0

r = n%10 = 153%10 = 3
sum = sum + r*r*r = 0+27 = 27
n = n/10 = 153/10 = 15

n:15 , sum:27

r =  n%10 =  15%10 = 5
sum = sum + r*r*r = 27+5*5*5 = 152
n = n/10 = 15/10 = 1

n:1 sum:152

r= 1%10 = 1
sum = 152+1*1*1 = 153
n = 1/10 = 0


*/

public class ArmstrongEx
{
	public static void main(String[] args) {
		
		if(args.length == 0)
		{
			System.out.println("Please pass the number");
			return;
		}

		int n = Integer.parseInt(args[0]);
		int temp = n;
		int sum = 0;
		while(n > 0)
		{
			int r = n%10;
			sum = sum + r*r*r;
			n = n/10;
		}

		if(sum == temp)
		{
			System.out.println("Given Number "+temp+ " is Armstrong");
		}else{
			System.out.println("Given Number "+temp+ " is not a Armstrong");
		}


	}
}




