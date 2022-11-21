class Speaker {

 static String brand ;                             // 12/09/2022
 static String color ;
 static double price ;                                          
 static boolean isConnected ;
 static int maxVolume = 8 ;
 static int minVolume ;
 static int currentVolume ; 

    public static boolean onOrOff(){
	   System.out.println("Inside onOrOff");
	    if(isConnected == false){
		           isConnected = true ;
		System.out.println("Speaker is turned Onn...");	
		}		
	
   else if(isConnected == true){
	    isConnected = false ;
		 System.out.println("Speaker is turned Off...");
	}
       System.out.println("end of onOrOff");
         return isConnected ;
	}
		 
  public static void increaseVolume(){
	 System.out.println("inside increaseVolume()");
 // false == true
   if(isConnected == true){
     if(currentVolume < maxVolume){
	     currentVolume = currentVolume + 1 ;
	      System.out.println("The Current Volume is" + currentVolume);
 }   
	 else{
	   System.out.println("Max Volume reached...");
   }	
	 System.out.println("end of increaseVolume");   
   } 
	  else{
		System.out.println("First turn on the Speaker");
	}  
	   }	 
		 
     public static void decreaseVolume(){
		 System.out.println("inside decreaseVolume()");
		 
	   if(isConnected == true){
		   if(currentVolume > minVolume){
			   currentVolume = currentVolume - 1 ;
			    System.out.println("The Current Volume is" + currentVolume) ;
		   }
	 else{
		 System.out.println("Min Volume reached...");
	 } 
		   System.out.println("end of decreaseVolume");
	   }
	   
	  else{
		  System.out.println("Turn of the Speaker");
	  }
	 
	 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 }