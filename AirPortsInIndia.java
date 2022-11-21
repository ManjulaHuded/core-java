class AirPortsInIndia{

   static String airPortsInIndia[] = {null , null , null , null , null};
   
      static int index ;
	  
	  public static boolean addAirPortsInIndia(String airPortIndia){
	    System.out.println("Inside addAirPortsInIndia");
		 
		 airPortsInIndia[index] = airPortIndia;
		 index++;
	  
	  System.out.println("End of addAirPortsInIndia");
	  
	  return true;
	  }
	  
	public static void getAirPortsInIndia(){
	    
		for(int index = 0 ; index < airPortsInIndia.length ; index++){
		
		String ref = airPortsInIndia[index];
		
		System.out.println(" airPortsInIndia is " + ref);
		}
	
	}
	
	public static void findAirPortsInIndia(String airPortsInIndia){
		for(int index = 0 ; index < addAirPortsInIndia.length ; index++){
			if(airPortIndia !=null && airPortsInIndia[index] == airPortIndia){
				String ref = airPortsInIndia[index];
				System.out.println("AirPorts name is " + ref);
			}
		}
	}
	
	
	public static boolean updateAirPortsInIndia(String newAirPortsInIndia ,String oldAirPortsInIndia){
		for(int index = 0 ; index < airPortsInIndia.length ; index++){
			System.out.println("updateAirPortsInIndia method started");
			if(newAirPortsInIndia !=null && oldAirPortsInIndia !=null){
				if(airPortsInIndia[index] == oldAirPortsInIndia){
					System.out.println("oldAirPortsInIndia is " + airPortsInIndia[index]);
					airPortsInIndia[index] = newAirPortsInIndia;
					System.out.println("newAirPortsInIndia is " + airPortsInIndia[index]);
					System.out.println("end of updateAirPortsInIndia");
					return true;
				}
				
			}
		}
		return false;
	}
	
	
}