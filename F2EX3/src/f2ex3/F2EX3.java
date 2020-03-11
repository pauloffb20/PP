/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f2ex3;

/**
 *
 * @author Paulo
 */
public class F2EX3 {

    public static void main(String[] args) {
        int[] lista = {12, 5, -21, 10, -345, 22, 50, -125, 80, -1};
        int i, positivos = 1, count=0, maior=0;
        
        for (i = 0; i < lista.length ; i++){
            if(lista[i]>0){
                positivos = positivos*lista[i];
            }
            System.out.println(positivos);
        }
        
        System.out.println("Negativos : ");
        for (i = 0; i < lista.length; i++){
            if(lista[i]< 0){
                count = count+1;
            }
        }
        System.out.println(count);
        
        for (i = 0; i < lista.length; i++){
            if(lista[i] > maior){
                maior = lista[i];
            }
        }
        System.out.println(maior);
    }  
}
