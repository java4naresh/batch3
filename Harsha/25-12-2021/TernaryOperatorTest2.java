class TernaryOperatorTest2 
{
	public static void main(String[] args) 
	{
		int num = 15;
		String result = (num % 2 ==0) ? (num < 10) ? "Below TEN EVEN NUMBER" : "ABOVE TEN EVEN NUMBER" : (num < 10) ? "Below Ten ODD NUMBER" : "Above Ten ODD NUMBER";

		System.out.println(result);
	}
}
