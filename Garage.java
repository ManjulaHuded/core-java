class Garage{

public static void getVehiclesNos(String[]vehicles){
    System.out.println("Inside getVehiclesNos()");
	System.out.println("Size of vehicles is " +vehicles.length);
	System.out.println("List of vehicles are");
	for(int index = 0 ; index<vehicles.length;index++){
	  System.out.println(vehicles[index]);
	}
	System.out.println("End of getVehiclesNos");

	}
}