class FindTargetNumber 
{
	public static void main(String[] args) 
	{
		int[] numbers = {10,20,30,45,50,65};  
		int target = 70;
		//1<6
		for(int i=0; i<numbers.length; i++) {

		for(int j = i+1; j < numbers.length; j++) {
		if(numbers[i]+numbers[j] == target) {
		System.out.println(i+"  "+j);
		}
		}
		}
	}
}
