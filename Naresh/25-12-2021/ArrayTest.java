class ArrayTest 
{
	public static void main(String[] args) 
	{
		int[] numbers = new int[5];
		System.out.println(numbers[0]);//0
		System.out.println(numbers[1]);//0
		System.out.println(numbers[2]);//0
		System.out.println(numbers[3]);//0
		System.out.println(numbers[4]);//0
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		System.out.println(numbers[0]);//10
		System.out.println(numbers[1]);//20
		System.out.println(numbers[2]);//30
		System.out.println(numbers[3]);//40
		System.out.println(numbers[4]);//50
	}
}
