class FindHighestNumber 
{
	public static void main(String[] args) 
	{
		// one way of creating array
		//int[] numbers = new int[5];
		int[] numbers = {10,20,30,50,5,25};
		/*for(int i=0;i<numbers.length;i++) {
		System.out.println(numbers[i]);
		}*/
        
		/*int highest = 0;

		for(int i=0;i<numbers.length;i++) {
		if(highest < numbers[i]) highest = numbers[i];
		}
		System.out.println(highest);*/

		int lowest = Integer.MAX_VALUE;

       for(int i=0;i<numbers.length;i++) {
		if(lowest > numbers[i]) lowest = numbers[i];
		}
		System.out.println(lowest);


	}
}
