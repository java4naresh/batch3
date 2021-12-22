class PolindromeTestInForLoop 
{
	public static void main(String[] args) 
	{
		int num = 123;
		int reverse = 0;
		int temp = num;
		for(;num != 0; num = num / 10) {
		int rem = num % 10; // 1
		reverse = reverse * 10 + rem;//120+1
		}
		if(temp == reverse) System.out.println("Given Number is Polindrome");
		else  System.out.println("Given Number is Not Polindrome");
	}
}
