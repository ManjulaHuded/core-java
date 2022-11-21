class Beaches{

   static String beachNames[] = {null,null,null,null,null};
   
   static int index;
   
   //saveBeach,createBeach
   public static boolean addBeachNames(String beachName){
      System.out.println("Inside addBeachNames");
	 
	 if(beachNames.length <= 5 ){
	  beachNames[index++] = beachName;
	//  index++;
	return true;
	 } 
	 else{
		 System.out.println("Connot add Beaches name as the size exceeds array ");
	 }
     System.out.println("End of addBeachNames");
	 return false;
  }

     
    public static void getBeachNames(){
		System.out.println("List of beach names");
		  for(int index = 0 ; index < beachNames.length ; index++){
			  String ref = beachNames[index];
			  System.out.println("Beach Name is " + ref);
		  }
		 
	  }
	  
    public static void findBeachNames(String beachName){
		System.out.println("Inside findBeachNames");
		for(int index=0 ; index < beachNames.length ; index++){
			if(beachName !=null && beachNames[index] == beachName){
				String ref = beachNames[index];
			System.out.println("Beach Name is " + ref);
			}
		}
		
		}
		
		public static boolean updateBeachName(String newBeachName , String oldBeachName){
			System.out.println("updateBeachName method started");
			if(newBeachName != null && oldBeachName !=null){
				for(int index = 0 ;index < beachNames.length ; index++){
					if(beachNames[index] == oldBeachName){
						System.out.println("oldBeachName is " + beachNames[index]);
						beachNames[index] = newBeachName;
						System.out.println("newBeachName is " + beachNames[index]);
						System.out.println("End of updateBeachName");
						return true;
					}
				}
			}
		
				return false;
		}
		
		public static boolean updateBeachName(String newBeachName , int existingIndex){
			System.out.println("updateBeachName method started");
			if(newBeachName != null && existingIndex >= 0){
				for(int index = 0 ;index < beachNames.length ; index++){
					if(index == existingIndex){
						System.out.println("oldBeachName is " + beachNames[index]);
						beachNames[index] = newBeachName;
						System.out.println("newBeachName is " + beachNames[index]);
						System.out.println("End of updateBeachName");
						return true;
					}
				}
			}
		
				return false;
		}
		
		
		
}