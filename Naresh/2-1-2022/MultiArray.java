import java.util.Arrays;
class MultiArray 
{
	public static void main(String[] args) 
	{
		//int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
		/*System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));*/

		/*for(int i=0; i<arr.length; i++) {
			System.out.print("[");
		for(int j=0; j<arr[i].length; j++) {
		     System.out.print(arr[i][j]+", ");
		  }
           System.out.print("]");
		   System.out.println();
		}

		for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr[i].length; j++) {
			 if(i == arr.length-1) {
				 int temp = arr[0][j];
				 arr[0][j] = arr[i][j];
				 arr[i][j] = temp;
			 }
		  }
		}

        System.out.println("=============================");
		for(int i=0; i<arr.length; i++) {
			System.out.print("[");
		for(int j=0; j<arr[i].length; j++) {
		     System.out.print(arr[i][j]+", ");
		  }
           System.out.print("]");
		   System.out.println();
		}*/

		// for each example
		/*int arr[] = {1,2,4,5,6};
		for(int i:arr) {
		System.out.println(i);
		}*/
		String[] names = {"Naresh", "Harsha", "Sushansa"};
		for(String name:names) {
		System.out.println(name);
		}
	}
}
