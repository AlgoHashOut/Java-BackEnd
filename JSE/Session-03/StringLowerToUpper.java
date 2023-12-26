
public class StringLowerToUpper
{
	public static void main(String[] args) {
		
		String s = "welcome"; 
		char[] chArr = s.toCharArray();
		for(int index = 0; index < chArr.length; index++)
		{
			chArr[index] = (char)(chArr[index] - 32);
		}

		System.out.println(String.valueOf(chArr));
	}

}





