class StarsExamples
  
{
	public static void main(String[] args) 
	{
		for(int i=1;i<6;i++) 
		{
		for(int j=5;j>0;j--) 
		{
		if(j>i) System.out.print(" ");
		else System.out.print("*");
		}
		System.out.print("\b");
		
		for(int j=1;j<6;j++) {
			
		if(j<=i) System.out.print("*");
		}
		System.out.println();


		}
	for(int i=1; i<6;i++) {
			         
		for(int j=1; j<6;j++) {
			
		if(i <= j) System.out.print("*");
		else
		System.out.print(" ");
		}
		//System.out.println();//
	System.out.print("\b");

		for(int j=5; j>0;j--) {
			
		if(i <= j) System.out.print("*");
		}
		System.out.println();
	}
	}
}
