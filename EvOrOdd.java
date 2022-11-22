class EvOrOdd{

		public static void main(String a[]){
		
		int n = 123456789 ;
		int evenCount = 0;
		int oddCount = 0 ;
		
		while(n>0){
			int reminder = n % 10 ;
			if(reminder % 2 == 0) evenCount++ ;
			else{
				oddCount++ ;
			}
			n = n/10 ;
			
		}
		
			System.out.println("Even count = "+ evenCount);
			System.out.println("Odd count = "+ oddCount);
		
		
		
	}


}