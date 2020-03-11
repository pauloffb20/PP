/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f2ex4;

/**
 *
 * @author Paulo
 */
public class F2EX4 {

    public static void main(String[] args) {
      char[] nome = {'A', 'n', 'a', ' ', 'S', 'a', 'n', 't', 'o', 's', '\n'};
      int i, j = 0, n = 0, vogais=0, consoantes=0;
      
      for(i = 0; i < nome.length; i++){
          if(nome[i] == ' '){
              for(j = i; j < nome.length; j++){
                  System.out.println(nome[j]);
              }
              for(n = 0; n < i; n++){
                  System.out.println(nome[n]);
              }
              System.out.println();
      }
         
           if( nome[i] == 'A' || nome[i] == 'a' || nome[i] == 'E' 
                    || nome[i] == 'e' || nome[i] == 'I' || nome[i] == 'i' 
                    || nome[i] == 'O' || nome[i] == 'o' || nome[i] == 'U'
                    || nome[i] == 'u'){
                
                vogais += 1;
           }
           else if (nome[i]!= ' ' && nome[i] != '\n'){
                consoantes += 1;
            }
      }    
      System.out.println(vogais);
      System.out.println(consoantes);
      System.out.println(consoantes+vogais);
    }    
}
