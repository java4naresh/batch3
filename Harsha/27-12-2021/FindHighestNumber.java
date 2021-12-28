class FindHighestNumber 
{
	public static void main(String[] args) 
	{
		int[] numbers = {10,20,30,50,5,25};
		
        
		int highest = 0;

		for(int i=0;i<numbers.length;i++) {
		if(highest < numbers[i]) highest = numbers[i];
		}
		System.out.println(highest);

		

	}
}
