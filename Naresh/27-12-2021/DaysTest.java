class DaysTest 
{
	public static void main(String[] args) 
	{
		String[] days = new String[7];
		//System.out.println(days.length);
		
        /*days[0] = "Sunday";
        days[1] = "Monday";
        days[2] = "Tuesady";
        days[3] = "Wednesday";
        days[4] = "Thursday";
        days[5] = "Friday";
        days[6] = "Saturday";*/
		for(int i=0;i<days.length;i++) {
		/*if(i == 0) days[i] = "Sunday";
		else if(i == 1) days[i] = "Monday";
		else if(i == 2) days[i] = "Tuesady";
		else if(i == 3) days[i] = "Wednesday";
		else if(i == 4) days[i] = "Thursday";
		else if(i == 5) days[i] = "Friday";
		else if(i == 6) days[i] = "Saturday";*/
		switch(i) {
		case 0: days[i] = "Sunday"; break;
		case 1: days[i] = "Monday"; break;
		case 2: days[i] = "Tuesday"; break;
		case 3: days[i] = "Wednesday"; break;
		case 4: days[i] = "Thursday"; break;
		case 5: days[i] = "Friday"; break;
		case 6: days[i] = "Saturday"; break;
		}
		}

        // this piece of code will print the array values from front to back
		/*for(int i=0;i<days.length;i++) {
		System.out.println(days[i]);//
		}*/

        // this piece of code will print the array values from back to front
		/*for(int i=days.length-1;i>-1;i--) {
		System.out.println(days[i]);//
		}*/
        
		// this piece of code will print the array values from half of array to back
		/*for(int i=(days.length-1)/2;i<days.length;i++) {
		System.out.println(days[i]);//
		}*/

		// this piece of code will print the array values from half of array to back
		/*for(int i=(days.length-1)/2;i>-1;i--) {
		System.out.println(days[i]);//
		}*/


		
	}
}
