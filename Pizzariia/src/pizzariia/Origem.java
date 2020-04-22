/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzariia;

public class Origem {

    enum origem {
        Animal, Vegetal, Mineral;

        public String getorigem() {
            switch (this) {
                case Animal:
                    return "Origem animal";
                case Vegetal:
                    return  "origem vegetal";
                case Mineral:
                    return "Origem Mineral";
                default: 
                    return "";
            }
        }
    }
}
