import java.util.Arrays;
class UniqueArray
{
public static void main(String[] args)
{
int[] numbers = {10,20,30,50,10,20};
int[] uniqueArray = null;
		int index = 0;
		for(int i=0; i<numbers.length; i++) {
			int count = 0;
		for(int j=0; j<numbers.length; j++){
		if(numbers[i] == numbers[j]) {
		count++;
		}
		}
		if(count == 1) {
			if(uniqueArray == null) {
				uniqueArray = new int[1];
		        uniqueArray[0] = numbers[i];
			} else {
              int[] temp = uniqueArray;
              uniqueArray = new int[uniqueArray.length+1];
			  for(int k=0; k<temp.length;k++) {
			  uniqueArray[k] = temp[k];
			  }
              uniqueArray[temp.length] = numbers[i];
			
			}
		}
		}
		System.out.println(Arrays.toString(uniqueArray));
	}
}
