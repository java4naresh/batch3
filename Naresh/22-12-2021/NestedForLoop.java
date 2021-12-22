class NestedForLoop 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<6;i++) {
		for(int j=5;j>0;j--) {//3
			//1>2
		if(j>i) System.out.print(" ");
		else System.out.print("*");
		}
		System.out.print("\b");
		for(int j=1;j<6;j++) {
			//3 <= 2
		if(j<=i) System.out.print("*");
		}
		System.out.println();
		}
	}
}
