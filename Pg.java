class Pg{

  static String name;
  static String address;
  static long contactNo;
  
  public static void setName(String nm){
     name = nm;
  }
  public static String getName(){
       return name;
  }
  public static void setAddress(String add){
      address = add;
  } 
  public static String getAddress(){
     return address;
  }
  public static void setContactNo(long cno){
     contactNo = cno;
  }
  public static long getContactNo(){
     return contactNo;
  }


}