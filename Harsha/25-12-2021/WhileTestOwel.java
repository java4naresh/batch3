class WhileTestOwel 
{
	public static void main(String[] args) 
{
	char ch = 'A';
	while (ch <= 'Z')
	 {
	if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
	System.out.println(ch +" is Owel");
	} else 
	System.out.println(ch +" is Consonant");
	ch++;
	 }

}}