class VivantaTajHotel {

  public static void main(String manju[]){
  
   String type = "5 Star Hotel";
   String address = "MG Road";
   String[] mangerNames = {"Akshata" , "Kavya" , "Laxmi" , "Majula" , "Abhishek"};
   int noOfManagers = 5;
   String foodMenu[] = {"Butter Non" , "Tandoori Roti" ,
   "Butter Chapati" , "Paneer Tikk Masala" , 
   "Paneer Butter Masala" , "Palak Paneer" ,
   "Kaju Paneer" , "Kaju Curry" , "Paneer Hydrabadi" ,
   "Veg Biriyani" , "Veg Fried Rice" , "Veg Kolhapuri" ,
   "Masala papad" , "Ice Cream" , "Sezwaan Fried Rice"};
  
  System.out.println("Welcome ot VivantaTajHotel");
  System.out.println("Type of Hotel is" + type);
  System.out.println("Destination" + address);
  System.out.println("List of Managers");
  
    for(int m = 0; m < mangerNames.length ; m++){
		System.out.println(mangerNames[m]);
	}
    System.out.println("no of Managers " + noOfManagers);
	System.out.println("List of Foods");
	
   for(int b = 0 ; b < foodMenu.length ; b++ ){
	   System.out.println(foodMenu[b]);
   }
  
   
  }




}