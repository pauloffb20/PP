
package Ex1;

public class Catalogo {
    private final int Max_bike = 20;
    private Bike[] catalogo;
    private int counterofbikes = 0;

    public void addbike(Bike bike) {
        
     this.catalogo = new Bike[Max_bike];
     
     if(counterofbikes < Max_bike){
         catalogo[counterofbikes] = bike;
         counterofbikes += 1;       
     }    
    }   

     public String print(){
         String rest = "";
         for(int i = 0; i< counterofbikes; i++){
             if(catalogo[i] instanceof Mountainbike){
             //bike.escrever();
             rest = rest + " " + ((Mountainbike) catalogo[i]).printutensilio();
             } else {
                 //bike.escrever();
                 rest  = rest + " " + ((Roadbike) catalogo[i]).printobs();
             }
             counterofbikes++;
         }
        return rest; 
     } 
}
