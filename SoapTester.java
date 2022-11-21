class SoapTester{

  public static void main(String manjula[]){
  
  //create a multiple of Soap
  
  //className refe = new className();
  Soap soap = new Soap();
  
  soap.shape = "Oval";
  soap.color = "Cream";
  soap.name = "Santoor";
  soap.price = 30.00;
  soap.toGetFresh();
  System.out.println(soap.shape + " " + soap.color);
  
  
  Soap sp = new Soap();
  sp.shape = "Round";
  sp.color = "Orange";
  sp.name = "Lifebouy";
  System.out.println(sp.shape + " " + sp.color);
  
  }

}