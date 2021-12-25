class TernaryOperatorTest 
{
	public static void main(String[] args) 
	{
		int num = 12;
		String result = (num % 2 == 0) ? (num < 10) ? "below ten even" : "above ten even" : (num < 10) ? "below ten odd" : "above ten odd";
		System.out.println(result);
	}
}
