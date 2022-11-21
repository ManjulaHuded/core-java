class PgTester{

public static void main(String manjula[]){
  
    Pg.setName("Golden pg");
	Pg.setAddress("Bengaluru");
	Pg.setContactNo(8282331343L);
	
  System.out.println("The Pg is " + Pg.getName());
  System.out.println("The Pg address is " + Pg.getAddress());
  System.out.println("The Pg ContactNo " + Pg.getContactNo());
 
}

}