class AraayPrimeTest 
{
	public static void main(String[] args) 
	{
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		
		for(int i=0;i<numbers.length;i++)
		{
			boolean flag = true;
			for(int j=2;j<numbers[i];j++)
			{
			if(numbers[i] % j == 0) {
				flag = false;
				break;
			}
			
		}
		if(flag){
			
			System.out.println(numbers[i]);
		}

	}}
}
