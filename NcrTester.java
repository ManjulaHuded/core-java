class NcrTester{

  public static void main(String manjula[]){
  
  int num = 8;
  int r = 4 ;
  
  int ncr = Factorial.fact(num)/(Factorial.fact(num-r)*Factorial.fact(r));
  
  System.out.println("The ncr value " + ncr);
  
  
  }


}