
package Ex1.enumerations;

public class Suspension {
    enum suspension {
        Double, Without, Simple;

        public String getsuspension() {
            switch (this) {
                case Simple:
                    return "Simple";
                case Without:
                    return  "Without";
                case Double:
                    return "Double";
                default: 
                    return "";
            }
        }
    }
    
}
