public class CommandLineArgsEx
{
	public static void main(String[] args) {

	
		if(args.length == 0)
		{
			System.out.println(" Please pass number as command line Arguments");
			return;
		}

		for(int index = 0; index < args.length ; index++)
		{
			System.out.println(" At index : "+index +" value - "+args[index]);
		}

	}
}