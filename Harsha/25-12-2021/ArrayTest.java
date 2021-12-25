class ArrayTest 
{
	public static void main(String[] args) 
	{
		int[] num = new int[5];
		System.out.println(num[0]);//0
		System.out.println(num[1]);//0
		System.out.println(num[2]);//0
		System.out.println(num[3]);//0
		System.out.println(num[4]);//0
num[0] = 10;
num[1] = 20;
num[2] = 30;
num[3] = 40;
num[4] = 50;
		System.out.println(num[0]);//10
		System.out.println(num[1]);//20
		System.out.println(num[2]);//30
		System.out.println(num[3]);//40
		System.out.println(num[4]);//50
				
	}
}
