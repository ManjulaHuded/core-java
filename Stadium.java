class Stadium{

        static String stadiums[] = {null , null , null , null , null};
  
  static int index ;
  
  public static boolean addStadiums(String stadium){
  
     System.out.println("Inside addStadiums");
	 
	 stadiums[index++] = stadium;
	 
	 System.out.println("End of addStadiums");
	 return true;
	 
	}
 public static void getStadiums(){
      for(int index = 0;index<stadiums.length;index++){
	    String ref = stadiums[index];
		
		System.out.println("Stadiums name is " + ref);
	  }
 }



}