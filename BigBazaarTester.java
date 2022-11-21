class BigBazaarTester{

  public static void main(String manjula[]){
  
  BigBazaar big = new BigBazaar();
  big.branch = "JP nagar";
  big.noOfWorkers = 110;
  big.gstNo ="AAAA565495yyyy" ;
 
  
  System.out.println(big.branch + " " +big.noOfWorkers+ " " +big.gstNo);
  
  BigBazaar ref = big ;
  
   System.out.println(ref.branch + " " +ref.noOfWorkers+ " " +ref.gstNo);
  
  
  
  
  
   }


}