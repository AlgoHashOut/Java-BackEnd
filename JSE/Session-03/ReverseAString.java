
public class ReverseAString
{
	public static void main(String[] args) {
		
		String s = "Welcome"; 
		char[] chArr = s.toCharArray();
		/*
			String in Java can be coverted into char[] 
			char[] chArr = {'W','e','l','c','o','m','e'};

			to Access a specific char from a String we can use s.charAt(index)
						 l                       r
			char[] chArr = {'W','e','l','c','o','m','e'};
 						
 							  l               r
						{'e','e','l','c','o','m','W'};

							      l       r
						{'e','m','l','c','o','e','W'};

							         l<r
						{'e','m','o','c','l','e','W'};


		*/
		int left = 0;
		int right = chArr.length-1;
		while(left < right)
		{
			 char temp = chArr[left];
			 chArr[left] = chArr[right];
			 chArr[right] = temp;
			 left++;
			 right--;
		}

		 s = String.valueOf(chArr);

		 System.out.println(" Reverse Value --> "+s);
	}

}





