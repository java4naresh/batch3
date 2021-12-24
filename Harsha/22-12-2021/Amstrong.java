class Amstrong{
public static void main(String[] args){
int num = 152;
int temp = num;
int total = 0, sum;
for(;num!=0;num = num/10) {//153/10 = 15, 15/10 = 1, 1/10 = 0
int rem = num % 10;//153%10 = 3, 15/%10 = 5, 1 % 10 = 1
total = total + rem*rem*rem;//27, 125, 1
}
if(total == temp)
System.out.println("Amstrong ");
else
System.out.println("Not an Amstrong ");


}
}