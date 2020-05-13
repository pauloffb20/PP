/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new10b;


public abstract class Company {
    private String name;
    private int varnumber;
    
   public Company(String name, int varnumber){
       this.name = name;
       this.varnumber = varnumber;
   }
   
   public String getname(){
       return name;
   }
   
    public void setname(String name){
       this.name = name;
   }
   
    public int getvarnumber(){
       return varnumber;
   }
    
       public void setvarnumber(int varnumber){
       this.varnumber = varnumber;
   }   
}
