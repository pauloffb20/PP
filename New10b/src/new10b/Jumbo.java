
package new10b;
import java.time.LocalDate;
import java.time.DayOfWeek;
/**
 *
 * @author Paulo
 */
public class Jumbo extends Hipermarket {
    
    
    private int points;

    public Jumbo(String name, int varnumber) {
        super(name, varnumber);
        this.points = 0;
    }

    @Override
    int getpoints(double compra) {
         if( LocalDate.now().getDayOfWeek() == DayOfWeek.SATURDAY || LocalDate.now().getDayOfWeek() == DayOfWeek.SUNDAY){
            if(compra >= 10){
                this.points =  (int) (1*(compra/10));
                return points;
            }
            else{
                return 0;
            }
        }else {
            if(compra >= 10){
                this.points = (int) (3*(compra/10));
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
    

