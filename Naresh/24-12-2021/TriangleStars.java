class TriangleStars 
{
	public static void main(String[] args) 
	{               //1<6 true, 2<6 true 3<6 true
		for(int i=1; i<6; i++) {
			//     1<6 true, 2<6 true, 3<6 true, 4<6 true, 5<6 true, 6<6 false 
		for(int j=1; j<6;j++) {
		//if(i <= j) 1<=1 true 1<=2 true 1<=3 true 1<=4 true 1<=5 true
		if(i <= j) System.out.print("*");
		else System.out.print(" ");
		}
		System.out.println();
		}
	}
}
