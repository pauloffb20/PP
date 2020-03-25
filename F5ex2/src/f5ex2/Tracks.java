/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f5ex2;

public class Tracks {
    protected int Size;
    protected int faixanr;
    protected String nomefaixa;
    protected double segundos;
 
  protected Tracks(int number, String nome, double secs){
      this.faixanr = number;
      this.nomefaixa = nome;
      this.segundos = secs;
  }      
}
