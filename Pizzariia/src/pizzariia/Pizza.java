/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzariia;

public class Pizza {
    private int id;
    private String name;
    private String descricao;
    private double preco;
    private final int nrdeingredientes = 5;
    private Ingrediente[] ingredientes;
    private int total;

    public Pizza(int id, String name,String descricao, double preco) {
        this.id = id;
        this.name = name;
        this.descricao = descricao;
        this.ingredientes = new Ingrediente[nrdeingredientes];
        this.total = 0;
        this.preco = preco;
    }
    
    public void add(Ingrediente i){
        this.ingredientes[total] = i;
        this.total++;
    }
    
    public void remove(int i){
        this.ingredientes[i] = null;
        for(int j = i; j< total-1; j++){
            this.ingredientes[j] = this.ingredientes[j+1];
        }
        this.total--;
    }

    public void setid(int id) {
        this.id = id;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setpreco(double preco) {
        this.preco = preco;
    }

    public void setdescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getid() {
        return id;
    }

    public String detdescricao() {
        return descricao;
    }

    public String getname() {
        return name;
    }
    

    public double getprice(){
            return preco;   
    }

    public void getinfopizza() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(descricao);
        System.out.println(preco);
        System.out.println(total);
        for (int i= 0; i < total; i++) {
            System.out.println(ingredientes[i].getinfo());
        }
    }
}
