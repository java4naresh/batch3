class ArrayDaysTest 
{
	public static void main(String[] args) 
	{
		String[] Days = new String[7];
		System.out.println(Days[0]);//null
		System.out.println(Days[1]);//null
		System.out.println(Days[2]);//null
		System.out.println(Days[3]);//null
		System.out.println(Days[4]);//null
		System.out.println(Days[5]);//null
		System.out.println(Days[6]);//null
		
Days[0] = "Sunday";
Days[1] = "Monday";
Days[2] = "Tuesady";
Days[3] = "Wednesday";
Days[4] = "Thursday";
Days[5] = "Friday";
Days[6] = "Saturday";
		System.out.println(Days[0]);//Sunday
		System.out.println(Days[1]);//Monday
		System.out.println(Days[2]);//Tuesady
		System.out.println(Days[3]);//Wednesday
		System.out.println(Days[4]);//Thursday
		System.out.println(Days[5]);//Friday
		System.out.println(Days[6]);//Saturday
				
	}
}