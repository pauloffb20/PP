
package Ex1;

public class Catalogo {
    private final int Max_bike = 20;
    private Bike[] catalogo;
    private int counterofbikes;
    
    
    public Catalogo(){
     this.catalogo = new Bike[Max_bike];
     this.counterofbikes = 0;
    }

    public void addbike(Bike bike) {
        
     if(counterofbikes < Max_bike){
         catalogo[counterofbikes] = bike;
         counterofbikes += 1;       
     }    
    }   

    @Override
     public String toString(){
         String text = "";
         for(int i = 0; i < counterofbikes; i++){
                 text  = text + " " +  catalogo[i].toString();
             }
        return text; 
     } 
}
