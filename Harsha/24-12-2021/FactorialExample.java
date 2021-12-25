class FactorialExample{
public static void main(String[] args){
	
	for(int i=1;i<101;i++){
	int num = i;
	int f = 1;
	for(int j=1;j<=num;j++)
	{
	f = f * j;
	}
	System.out.println(f);
	}
}
}