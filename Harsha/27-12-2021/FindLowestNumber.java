class FindLowestNumber 
{
	public static void main(String[] args) 
	{
		int[] numbers = {10,20,30,50,5,25};
		
		int lowest = Integer.MAX_VALUE;

       for(int i=0;i<numbers.length;i++) {
		if(lowest > numbers[i]) lowest = numbers[i];
		}
		System.out.println(lowest);


	}
}
