class PrimeNumber{

public static void main(String manjula[]){

int m = 54;
int s = 7;
int b = 9;
int a = 13;

if(m % s == 0){
	System.out.println("not a primenumber");
}
else{
	System.out.println(s + " is a prime");
}
if(m % b == 0){
	System.out.println(b + "  is not a primenumber");
}
else{
	System.out.println(b +" is a prime");
}
if(m % a == 0){
	System.out.println(" not a primenumber");
}
else{
	System.out.println(a + " is a prime");
}
if(s % m == 0){
	System.out.println(" not a primenumber");
}
else{
	System.out.println(m + " is a prime");
}
}

}