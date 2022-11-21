class SwiggyB{
	
	 public static double takeOrder(String item){
	  
	if(item == "Pizza"){
	   System.out.println("Thank You for Ordering" );
	   return 99.00;
	}
   if(item == "Burger"){
     System.out.println("Thank You for Ordering" );
	 return 60.00;
   }
   if(item == "Sandwitch"){
     System.out.println("Thank You for Ordering" );
	 return 50.00;
   }
   if(item == "SouthIndian"){
     System.out.println("Thank You for Ordering" );
	 return 160.00;
   }
   if(item == "Pastries"){
     System.out.println("Thank You for Ordering " );
	 return 55.00;
   }
   return 0.0;
   
   
    }

   public static double takeOrder(String item , int quantity){
	  
	if(item == "Pizza"){
	   System.out.println("Thank You for Ordering" );
	   return 99.00*quantity;
	}
   if(item == "Burger"){
     System.out.println("Thank You for Ordering" );
	 return 60.00*quantity;
   }
   if(item == "Sandwitch"){
     System.out.println("Thank You for Ordering" );
	 return 50.00*quantity;
   }
   if(item == "SouthIndian"){
     System.out.println("Thank You for Ordering" );
	 return 160.00*quantity;
   }
   if(item == "Pastries"){
     System.out.println("Thank You for Ordering " );
	 return 55.00*quantity;
   }
   return 0.0;
   
   
    }







}