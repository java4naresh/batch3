class LogicalOperators 
{
	public static void main(String[] args) 
	{
		int num1 = 10;
		int num2 = 11;
        // logical AND
		/*if(num1++ % 2 == 0 && ++num2 % 2 == 0) {
		System.out.println("Both are Even");
		} else {
		System.out.println("Both are not Even");
		}
		System.out.println(num1);//11
		System.out.println(num2);//12*/

		//Logical OR

		/*if(++num1 % 2 == 0 || ++num2 % 2 == 0) {
		System.out.println("Both are Even");
		} else {
		System.out.println("Both are not Even");
		}
		System.out.println(num1);//11
		System.out.println(num2);//12*/

		// Not Equal

		if(++num1 % 2 != 0 || ++num2 % 2 == 0) {
		System.out.println("Both are Even");
		} else {
		System.out.println("Both are not Even");
		}
		System.out.println(num1);//11
		System.out.println(num2);//11
	}
}
