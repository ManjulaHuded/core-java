class Theatre{

static long priceOfKannadaMovies[] = {1000,150,150,200,900000000L};
static int priceOfHindiMovies[] = {1000,100,100,150};
static String kannadaMovies[] = {"KGF Franchise","Om","Sampathige Sawaal","Googly"};
static String hindiMovies[] = {"3 Idiots","DDLJ", "pk", "Badshah"};
 
 public static void main(String manjula[]){
  
     System.out.println("List of kannadaMovies");
System.out.println(
 kannadaMovies[0] +" "+ 
 kannadaMovies[1] +" "+ 
 kannadaMovies[2] +" "+ 
 kannadaMovies[3]);

     System.out.println("**********");
System.out.println("Price of listed kannadaMovies");
System.out.println(
 priceOfKannadaMovies[0] +" "+ 
 priceOfKannadaMovies[1] +" "+ 
 priceOfKannadaMovies[2] +" "+ 
 priceOfKannadaMovies[3] +" "+ 
 priceOfKannadaMovies[4]);

      System.out.println("********");
System.out.println("List of hindiMovies");
System.out.println(
 hindiMovies[0] +" "+
 hindiMovies[1] +" "+
 hindiMovies[2] +" "+
 hindiMovies[3]); 
 
     System.out.println("********"); 
System.out.println("Price of listed hindiMovies");
System.out.println(
 priceOfHindiMovies[0] +" "+
 priceOfHindiMovies[1] +" "+
 priceOfHindiMovies[2] +" "+
 priceOfHindiMovies[3]);  
  
  }

}