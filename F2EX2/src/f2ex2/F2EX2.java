/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f2ex2;

/**
 *
 * @author Paulo
 */
public class F2EX2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[][] matriz = {{11,7,33},
           {-20,-23,-63},
           {-22,-501,10000}
       };
       
       int soma = 0, i , j;
        
       
      for (i = 0; i< matriz.length; i++){
          for (j = 0; j < matriz.length; j++){
              soma = soma + matriz[i][j];
          }
      }   
      System.out.println("soma:" + soma);
      System.out.println("Media:" + soma/9);
    }  
}
    

