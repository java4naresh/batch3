package oops.methodexamples;

public class MethodExamples {

	public static void main(String[] args) {
		MethodExamples me = new MethodExamples();
		int[] numbers = {10,20,30,50,5,25};
		int highest = me.FindHighestNumber(numbers);
		System.out.println(highest);
		int[] numbers2 = {10,20,300,500,5,2500};
		int highest2 = me.FindHighestNumber(numbers2);
		System.out.println(highest2);
		
	}
public int FindHighestNumber(int[] numbers) {
	System.out.println("FindHighestNumber");
	int highest = 0;
	for(int i=0;i<numbers.length;i++) {
		if(highest < numbers[i]) highest = numbers[i];
	}
		return highest;
	
}
public void FindHighestNumberAndPrint(int[] numbers) {
	System.out.println("FindHighestNumberAndPrint");
	int highest = 0;
	for(int i=0;i<numbers.length;i++) {
		if(highest < numbers[i]) highest = numbers[i];
	}
		
	System.out.println("highest number="+highest);

}
}
