
/*
	It contains only lowercase letters
*/
public class StringHasDuplicateChars
{
	public static void main(String[] args) {
		
		  /*
								 97 -- 122 = 26  
								 int[] arr = new int[26]
								 'a' -- 0 -> Index
								 'b' -- 1 -> Index
								 'z' -- 25 --> Index

								 97 'a' - [97] 'a' = 0;
								 'b' - 'a' = 1
								 ..
								 'z' - 'a' = 25

								 "aba" --> {'a', 'b', 'a'}

								  int[] arr = {2,1, 0,0,..}
								*/

		
		String s = "welcome";
		char[] chArr = s.toCharArray(); //{'w','e','l','c','o','m','e'}
		int[] arr = new int[26];
		for(int index = 0; index < chArr.length; index++)
		{
			int arrIndex = chArr[index] - 'a';
			arr[arrIndex] = arr[arrIndex]+1;
		}

		boolean isDuplicate = false;
		for(int index = 0 ; index < 26; index++)
		{
			if(arr[index] > 1)
			{
				isDuplicate = true;
				break;
			}
		}

		if(isDuplicate == true)
		{
			System.out.println("String contains duplicates");
		}else{
			System.out.println("String does not contains duplicates");
		}
		
	}

}





