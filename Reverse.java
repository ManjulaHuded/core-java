class Reverse{

public static void main(String manjula[]){

int number = 5467;
int rev = 0 ;
while(number!=0){
int remider = number%10 ; //here i take as input
rev = rev*10+remider;
number = number/10;
}
System.out.println("Reverse number is " + rev);

}

}