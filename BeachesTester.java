class BeachesTester{

   public static void main(String a[]){
   
     Beaches.addBeachNames("Marina");
	 Beaches.addBeachNames("Baga");
	 Beaches.addBeachNames("Malpe");
	 Beaches.addBeachNames("Murudeshwar");
	 Beaches.addBeachNames("Gokrna");
	 Beaches.getBeachNames();
	 
	 
	 Beaches.updateBeachName("Paradise" , "Marina");
	 Beaches.updateBeachName("Half Moon" , 4);
	  
	 Beaches.getBeachNames();
	 
   }
}