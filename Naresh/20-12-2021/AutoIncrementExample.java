class AutoIncrementExample 
{
	public static void main(String[] args) 
	{
		int number = 10;
		/*System.out.println(number);//10
		number++;// number = number+1;
		System.out.println(number);//11
		++number;// number = number+1;
        System.out.println(number);//12
        System.out.println(number++);//12
		//System.out.println(++number);//13
		System.out.println(number);//13*/
		                   // 10 + 11
		//System.out.println(number++ + number++); // 10 + 11
		/*System.out.println(++number + ++number);//11 + 12 
		System.out.println(number); // 12
        
		System.out.println(number--);//12
		System.out.println(--number);//10*/

		/*System.out.println(++number + number--);//11+11
		System.out.println(number);//10*/
                         // 10 + 10 + 11 + 11
		//System.out.println(number++ + --number + ++number + number);
		//                  10 + 12 - 11 + 11 
        System.out.println(number++ + ++number - --number + number--);

	}
}
