/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CD;

public class CD {
    protected int size = 15;
    
    protected String banda;
    protected String namecd;
    protected double time;
    protected String data;
    protected String editora;
    protected String[] membros;
    public Tracks[] tracks = new Tracks[size];;
    

    
protected CD(String banda, String name, double time, String data, String editora, Tracks[] faixas){
    this.banda = banda;
    this.namecd = name;
    this.time = time;
    this.data = data;
    this.editora = editora;
    this.tracks = faixas;
}

protected CD( String banda, String name, Tracks[] faixas){
  this.banda = banda;
  this.namecd = name;
  this.tracks = faixas;  
}
}
