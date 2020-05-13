
package new10b;

import java.time.LocalDate;


/**
 *
 * @author Paulo
 */
public class Continente extends Hipermarket  {
    
    
    private int points;
    private int counter_days = 1;
    
    public Continente(String name, int varnumber) {
        super(name, varnumber);
        this.points = 0;   
    }
    
    /**
     *
     * @param compra
     * @return
     */
    @Override
    public int getpoints(double compra){
        

   if( LocalDate.now().getDayOfMonth() <= 20){
            if(compra >= 5){
                this.points = (int) (1*compra/5);
                return points;
            }
            else{
                return 0;
            }
        }else {
            if(compra >= 20){
                this.points = (int) (3*compra/20);
                return points;
            }
            else{
                return 0;
            }
    }
    }
   
       @Override
    public String toString() {

        String text = "Nome da Companhia:" + this.getname() + " " + "\n" + "Preço dos produtos:" + "\n";
        text = text + "Coffe" + this.getCoffePrice() + "\n" + "Batatas:" + this.getPreço_Batatas() + "\n" + "Gas: " + this.getGasPrice() + "\n" + this.points + "\n";
        return text;
    }

}
