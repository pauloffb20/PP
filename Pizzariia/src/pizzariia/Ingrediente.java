
package pizzariia;

public class Ingrediente {
    
    private int id;
    private String name;
    private String origem;
    private double calorias;

    public Ingrediente(int id, String name, String origem, double calorias) {
        this.id = id;
        this.name = name;
        this.origem = origem;
        this.calorias = calorias;
    }

    public void setid(int id) {
        this.id = id;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setorigem(String origem) {
        this.origem = origem;
    }

    public void setcalorias(double calorias) {
        this.calorias = calorias;
    }
    
    public String getname(){
        return name;
    }
    
     public String getorigem() {
        return origem;
    }
     
     public String getinfo(){
         return name + " " + origem;
     }
}
