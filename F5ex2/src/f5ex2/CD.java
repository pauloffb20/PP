/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f5ex2;

public class CD {

    protected String banda;
    protected String namecd;
    protected double time;
    protected String data;
    protected String editora;
    protected Tracks[] tracks;
    protected Membros[] membros; 

    protected CD(String banda, String name, double time, String data, String editora, Tracks[] faixas, Membros[] membros) {
        this.banda = banda;
        this.namecd = name;
        this.time = time;
        this.data = data;
        this.editora = editora;
        this.tracks = new Tracks[faixas.length];
        for(int i = 0; i < faixas.length; i++){
            this.tracks[i] = faixas[i];
        }
        //this.tracks = faixas; Também funciona só que estamos confiar me tudo que é passado
        this.membros = membros;
    }
}
