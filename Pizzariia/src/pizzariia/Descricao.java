/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzariia;

public class Descricao {
    
     enum descricao {
        Small, Big, Medium;

        public String getdescricao() {
            switch (this) {
                case Small:
                    return "Small" ;
                case Medium:
                    return "Medium";
                case Big:
                    return "Big";
                default:
                    return "";
            }
        }
    }
}

  

