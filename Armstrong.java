class Armstrong{

		public static void main(String a[]){
		
		int z = 370 ;
		int temp = z ;
		int x , sum =0 ;
		
		while(z>0){
			x = z % 10 ;
			z = z/10 ;
			sum = sum + x*x*x ;
		}
		if(temp == sum){
			System.out.println("Given number is an Armstrong number");
		}
		else{
			System.out.println("It is not an Armstrong number");
		}
		
		
		
		}



}