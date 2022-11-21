class Resturant{
    
	static void getFoodMenu(String[] foodMenu){
         System.out.println("Inside getFoodMenu Method");
		 System.out.println("Food Menu size is " + foodMenu.length);
		for(int index =0 ; index < foodMenu.length ; index++){
		    System.out.println(foodMenu[index]);
	}
	  System.out.println("End of getFoodMenu Method");
		 }
		 
		 static void getName(String name){
			 System.out.println("Resturant Name is " + name);
		 }
}