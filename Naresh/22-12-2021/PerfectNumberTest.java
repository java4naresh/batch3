class PerfectNumberTest 
{
	public static void main(String[] args) 
	{
		int num = 25;
        int sum = 0;
		for(int i=1;i<num;i++) {
		if(num % i == 0) sum = sum + i;
		}

		if(num == sum) System.out.println("Given Number is Perfect Number");
		else if(num < sum) System.out.println("Given Number is Abudant Number");
		else System.out.println("Given Number is deficient Number");
	}
}
