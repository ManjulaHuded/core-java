class TouristPlaces{

     static String touristPlaces[] = {null , null , null , null , null};
  
  static int index ;
  
  public static boolean addTouristPlaces(String touristPlace){
  
     System.out.println("Inside TouristPlaces");
	 
	 touristPlaces[index++] = touristPlace;
	 
	 System.out.println("End of TouristPlaces");
	 return true;
	 
	}
 public static void getTouristPlaces(){
      for(int index = 0;index<touristPlaces.length;index++){
	    String ref = touristPlaces[index];
		
		System.out.println("TouristPlaces name is " + ref);
	  }
 }





}