class Amstrong{
public static void main(String[] args){
int num = 153;
int total = 0, sum;
for(;num!=0;)
sum = num % 10;
total = total + sum*sum*sum;
}
if(total == num)
System.out.println("Amstrong ");
else
System.out.println("Not an Amstrong ");


}
}