/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpp;

import order.exceptions.ContainerException;
import order.exceptions.PositionException;
import order.packing.Color;
import order.packing.IContainer;
import order.packing.IItem;
import order.packing.IItemPacked;
import order.packing.IPosition;

/**
 *
 * @author Paulo
 */
public class Container extends Box implements IContainer {

    private ItemPacked[] array;
    private final int max = 3;
    private int maxVolume;
    private int occupiedVolume;
    private int nr_itens;
    private String reference = "Container:";
    private static int id = 1;
    private boolean state = false;
    
    public Container(int depth, int height, int lenght) {
        super(depth, height, lenght);
        this.array = new ItemPacked[max];
        this.occupiedVolume = 0;
        this.nr_itens = 0;
        this.maxVolume = super.getVolume();
        this.reference = this.reference + id;
        id++;
    }

    @Override
    public boolean addItem(IItem iitem, IPosition ip, Color color) throws ContainerException {

        if (state == true) {
            throw new ContainerException("ERROR to add : Container is closed") {
            };
        } else {
            if (nr_itens < max) {
                ItemPacked tmp = new ItemPacked(color, iitem, ip);
                this.array[nr_itens] = tmp;
                occupiedVolume += iitem.getVolume();
                nr_itens += 1;
                return true;
            }
            throw new ContainerException("ERROR: You can't add more itens! You just can add" + " " + max + "itens") {
            };
        }
    }

    @Override
    public boolean removeItem(IItem iitem) throws ContainerException {
        int pos;

        for (int i = 0; i < nr_itens; i++) { // percorremos array
            if (array[i].getItem() == iitem) { //// verificamos se encontrarmos algum item igual ao pedido de remoçao
                pos = i;
                this.array[pos] = null; //se encontrarmos o item apagamos ele do array

                //tirar espaços vazios no array, puxando da direita para esquerda os itens apartir da posição onde removemos o item
                for (int j = pos; j < nr_itens - 1; j++) {
                    this.array[j] = this.array[j + 1];
                }
                
                this.occupiedVolume = this.occupiedVolume - iitem.getVolume();
                this.nr_itens--;

                //retornamos true após o item ser removido com sucesso
                return true;
            }
        }
        throw new ContainerException("ERROR : Item inexistente") {
        };
    }

    /**
     *
     * @throws ContainerException
     * @throws PositionException
     */
    @Override
    public void validate() throws ContainerException, PositionException {
        if (occupiedVolume > maxVolume) {
            throw new ContainerException("ERROR : Volume do container excedido") {
            };
        } else {
            System.out.println("Todos os itens encontram se dentro do container");
        }

        for (int i = 0; i < nr_itens - 1; i++) {
            for (int j = i + 1; j < nr_itens; j++) {

                if (array[i].getPosition().getX() < array[j].getPosition().getX() + array[j].getItem().getDepth()
                        && array[i].getPosition().getY() < array[j].getPosition().getY() + array[j].getItem().getHeight()
                        && array[i].getPosition().getZ() < array[j].getPosition().getZ() + array[j].getItem().getLenght()) {
                    this.state = false;
                    throw new PositionException("ERROR : Overlapping") {
                    };
                }
            }
        }

        System.out.println("Without overlapping");
        this.state = true;
    }


    @Override
    public void close() throws ContainerException, PositionException {   
     validate();
    }

    @Override
    public IItem getItem(String string) {
        int pos;
        IItem item = null;

        for (int i = 0; i < nr_itens; i++) { // percorremos array
            //verificamos se a referencia de algum item no array é igual á string recebida
            if (array[i].getItem().getReference().equals(string)) {
                //guardamos a posição do item caso seja encontrado
                pos = i;
                //guardamos o item do array que se encontra na pos guardada (ou seja, que tem a referencia igual á string)
                item = this.array[pos].getItem();
            }
        }
        //retornamos o item
        return item;
    }

    @Override
    public int getOccupiedVolume() {
        return this.occupiedVolume;
    }

    @Override
    public IItemPacked[] getPackedItems() { //NAO SEI SE ESTÁ CORRETO, NECESSARIO VERIFICAR
        
        IItemPacked[] itemPacked = new IItemPacked[nr_itens];
        
         for (int i = 0; i < nr_itens; i++) { // percorremos array
            itemPacked[i] = array[i];
        }
        return itemPacked;
    }

    @Override
    public String getReference() {
        return reference;
    }

    @Override
    public int getNumberOfItems() {
        return nr_itens;
    }

    @Override
    public int getRemainingVolume() {
        int remainingVolume = maxVolume - occupiedVolume;
        return remainingVolume;
    }

    @Override
    public boolean isClosed() {
       return state;
    }
}
