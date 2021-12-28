class FindPrimeNumber 
{
	public static void main(String[] args) 
	{
		int[] numbers = {1,2,3,4,5,6,8,9,7};
        
		for(int i=0; i<numbers.length; i++) {

		boolean flag = true;
		//2<4
		for(int j=2; j<numbers[i];j++) {
			//5 % 4 
		if(numbers[i] % j == 0) {
		flag = false;
		break;
		}
		}
		if(flag) {
			System.out.println(numbers[i]);//1,2,3,5,7
		}
		}

	}
}
