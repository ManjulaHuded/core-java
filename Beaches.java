class Beaches{

   static String beachNames[] = {null,null,null,null,null};
   
   static int index;
   
   //saveBeach,createBeach
   public static boolean addBeachNames(String beachNames){
      System.out.println("Inside addBeachNames");
	  
	  beachNames[index++] = beachNames;
	  //index++
	  
	 System.out.println("End of addBeachNames");
	 return true;
   }
      public static void getBeachNames(){
		  for(int index=0;index<beachNames.length;index++){
			  String ref = beachNames[index];
			  System.out.println("Beach Name is " + ref);
		  }
	  }
}