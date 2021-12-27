class DoWhileTest 
{
	public static void main(String[] args) 
	{
		/*int num = 10;

		do
		{
			System.out.println(num);//10
			num --;
		}
		while (num > 0);*/

		// WAP to print Even Or Odd for a given number using do while

		int num2 = 101;
		do
		{
			if(num2 % 2 == 0) System.out.println(num2+" is Even");
			else System.out.println(num2+" is Odd");
			num2++;
		}
		while (num2<=150);
	}
}
