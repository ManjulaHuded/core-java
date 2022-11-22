class Palindrome{

		public static void main(String a[]){
		
		
		int num = 151 ;
		int rem = 0 ;
		int sum = 0 ;
		int temp = num ;
		
		while(num>0){
			rem = num%10;
			sum = (sum*10)+ rem ;
			num = num/10 ;
		}
		if(temp == sum){
			System.out.println("It is a Palindrome number");
		}
		else{
			System.out.println("It is not a Palindrome number");
		}
		
		
		
		
		
		
		}




}