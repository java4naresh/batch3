import java.util.Arrays;

class AscendingArray 
{
	public static void main(String[] args) 
	{
		int[] numbers = {10,5,31,0,1,2};//{5,10,31,0,1,2},{0,10,31,5,1,2}
        System.out.println(Arrays.toString(numbers));
		for(int i=0;i<numbers.length;i++) {
		for(int j=i+1;j<numbers.length;j++) {
		if(numbers[i] > numbers[j]) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
		}
		}
		}
       
	   System.out.println(Arrays.toString(numbers));

	}
}
