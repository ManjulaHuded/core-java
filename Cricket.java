class Cricket{
      public static void main(String manjula[]){
	  
	     int rohitHighestScore = 264 ;     //declare and init
         int sachinHighestScore = 200 ;
         int mandhanaHighestScore = 232 ;
         int ackerrHighestScore = 222 ;
         int bjClarkHighestScore = 229 ;		 
         
int highestScores[] = {rohitHighestScore ,
sachinHighestScore ,mandhanaHighestScore,
ackerrHighestScore,bjClarkHighestScore};
		 
  //variable retutned from array element
	  
	  int ref0 = highestScores[0];
	  int ref1 = highestScores[1];
	  int ref2 = highestScores[2];
	  int ref3 = highestScores[3];
	  int ref4 = highestScores[4];
	  
  System.out.println("Element of index 0 " + ref0);
  System.out.println("Element of index 1 " + ref1);  
  System.out.println("Element of index 2 " + ref2);
  System.out.println("Element of index 3 " + ref3);
  System.out.println("Element of index 4 " + ref4);  
	  
 //length is a property of array 
    System.out.println("The length of highestScores is " + highestScores.length);


 //for loop
   for(int index = 0 ; index < highestScores.length ; index ++ ){
	   int ref = highestScores[index];
	   System.out.println("Element at index " + index + ref);
 } 
	  
}
      
}