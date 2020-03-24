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
    protected String autor;
    
  protected Tracks(int number, String nome, double secs, String autor){
      this.faixanr = number;
      this.nomefaixa = nome;
      this.segundos = secs;
      this.autor = autor;
  }      
}
