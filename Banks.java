class Banks{

  static String bankNames [] = {null , null , null , null , null};
  
  static int index ;
  
  public static boolean addBankNames(String bankName){
  
     System.out.println("Inside addBankNames");
	 
	 bankNames[index++] = bankName;
	 
	 System.out.println("End of addBankNames");
	 return true;
	 
	}
 public static void getBankNames(){
      for(int index = 0;index<bankNames.length;index++){
	    String ref = bankNames[index];
		
		System.out.println("Banks name is " + ref);
	  }
 }




}