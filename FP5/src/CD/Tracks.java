/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CD;

public class Tracks {

    protected int faixanr;
    protected String nomefaixa;
    protected double segundos;
    protected Autores[] autores;
    
  protected Tracks(int number, String nome, double secs, Autores[] autores){
      this.faixanr = number;
      this.nomefaixa = nome;
      this.segundos = secs;
      this.autores = new Autores[autores.length];
      for(int i = 0; i < autores.length; i++){
          this.autores[i] = autores[i];
      }
      //this.autores = autores;
  }      
}
