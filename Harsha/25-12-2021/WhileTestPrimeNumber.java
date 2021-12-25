class WhileTestPrimeNumber 
{
	public static void main(String[] args) 
	{
	int num = 1;
        		while(num <= 100) {
		int num2 = num;
        		int num3 = 2;
		boolean flag = true;
        
		while(num3 < num2) {
		if(num2 % num3 == 0) { 
		flag = false;
		break;
		}
		num3++;
		}

		if(flag) System.out.println(num2 +" Is Prime");
		else System.out.println(num2 +" Is Not Prime");
		num++;
		}
}}