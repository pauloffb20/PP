/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpp;

import order.exceptions.PositionException;
import order.packing.IPosition;

/**
 *
 * @author Paulo
 */
public class Position implements IPosition{
    private int x, y, z;
    
    public Position(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getZ() {
        return z;
    }

    @Override
    public void setX(int i) throws PositionException {
        if(i < 0)
        throw new PositionException("Invalid option : number negative") {};
         else 
            this.x = i;
                
    }

    @Override
    public void setY(int i) throws PositionException {
            if(i < 0)
        throw new PositionException("Invalid option : number negative") {};
         else 
            this.y = i;    
    }
    

    @Override
    public void setZ(int i) throws PositionException {
        if (i < 0) {
            throw new PositionException("Invalid option : number negative") {
            };
        } else {
            this.z = i;
        }
    }

        @Override
    public String toString(){
        String text = x + " " + y + " " + z;
        return text;
    }    
}
