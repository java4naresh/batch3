class ArrayTestDays 
{
	public static void main(String[] args) 
	{
		String[] Day = new String[7];
		System.out.println(Day[0]);//null
		System.out.println(Day[1]);//null
		System.out.println(Day[2]);//null
		System.out.println(Day[3]);//null
		System.out.println(Day[4]);//null
		System.out.println(Day[5]);//null
		System.out.println(Day[6]);//null
		
Day[0] = "Sunday";
Day[1] = "Monday";
Day[2] = "Tuesady";
Day[3] = "Wednesday";
Day[4] = "Thursday";
Day[5] = "Friday";
Day[6] = "Saturday";
		System.out.println(Day[0]);//Sunday
		System.out.println(Day[1]);//Monday
		System.out.println(Day[2]);//Tuesady
		System.out.println(Day[3]);//Wednesday
		System.out.println(Day[4]);//Thursday
		System.out.println(Day[5]);//Friday
		System.out.println(Day[6]);//Saturday
				
	}
}