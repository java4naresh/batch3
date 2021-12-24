class WhileTest 
{
	public static void main(String[] args) 
	{
		// print 1 to 10 using while loop

		/*int num = 1;

		while(num <= 10) {
		System.out.println(num);
		num++;
		}*/

		// print even and odd numbers from 1 to 100 usimg while loop

		/*int num2 = 1;
		while(num2 <= 100) {
		if(num2 % 2 == 0) System.out.println(num2 +" is Even");
		else System.out.println(num2 +" is Odd");
		num2++;
		}*/

        // WAP to find prime numbers between 1 to 100

        /*int num5 = 1;
        while(num5 <= 100) {
		int num3 = num5;
        int num4 = 2;
		boolean flag = true;
        
		while(num4 < num3) {
		if(num3 % num4 == 0) { 
			flag = false;
			break;
		}
		num4++;
		}

		if(flag) System.out.println(num3 +" Is Prime");
		else System.out.println(num3 +" Is Not Prime");
		num5++;
		}*/
        
        // WAP to print given charcater is Owel or Not
		
		/*char ch = 'A';

	    while (ch <= 'Z')
	    {
			if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			System.out.println(ch +" is Owel");
			} else System.out.println(ch +" is Not Owel");
			ch++;
	    }*/

		int num6 = 1;

		while(num6 <= 7) {
		switch(num6) {
		case 1: System.out.println("Sunday"); break;
		case 2: System.out.println("Monday"); break;
		case 3: System.out.println("Tuesday"); break;
		case 4: System.out.println("Wednesday"); break;
		case 5: System.out.println("Thursday"); break;
		case 6: System.out.println("Friday"); break;
		case 7: System.out.println("Saturday"); break;
		}
		num6++;
		
		}
	
	}
}
