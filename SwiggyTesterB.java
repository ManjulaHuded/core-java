class SwiggyTesterB{

   public static void main(String manjula[]){
   
      double itemPrice = SwiggyB.takeOrder("Pizza");
     SwiggyB.takeOrder("Pizza" , 99.00);
	 SwiggyB.takeOrder("Burger");
     SwiggyB.takeOrder("Burger" , 60.00);
	 SwiggyB.takeOrder("Sandwitch");
     SwiggyB.takeOrder("Sandwitch" , 50.00);
	 SwiggyB.takeOrder("SouthIndian");
     SwiggyB.takeOrder("SouthIndian" , 160.00);
	 SwiggyB.takeOrder("Pastries");
     SwiggyB.takeOrder("Pastries" , 55.00);
	 
  System.out.println("Your Final Order is ready with " + " " );
   
   }

}