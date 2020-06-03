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
 * @author Paulo Filipe Ferreira Brito
 * Nr: 8160279
 * Turma 3
 * @author Hugo Maia Alves
 * Nr: 8160521
 * Turma: 2
 */

public class Container extends Box implements IContainer {

    private ItemPacked[] array;
    private final int max = 20;
    private int maxVolume;
    private int occupiedVolume;
    private int nr_itens;
    private String reference = "Container:";
    private static int id = 1;
    private boolean state = false;
    
    /**
     *
     * @param depth do tipo inteiro
     * @param height do tipo inteiro
     * @param lenght do tipo inteiro
     */
    public Container(int depth, int height, int lenght) {
        super(depth, height, lenght);
        this.array = new ItemPacked[max];
        this.occupiedVolume = 0;
        this.nr_itens = 0;
        this.maxVolume = super.getVolume();
        this.reference = this.reference + id;
        id++;
    }

    /**
     *
     * @param iitem do tipo IItem
     * @param ip do tipo IPosition
     * @param color do tipo Color
     * @return true em caso de adicionado com sucesso e false se o item já existir no container
     * @throws ContainerException excepção caso o container esteja fechado não permitindo adicionar mais items ou
     * excepção caso sejam enviados parametros nulls
     * Método para adicionar um item ao container
     */
    @Override
    public boolean addItem(IItem iitem, IPosition ip, Color color) throws ContainerException {

        if (state == true) {
            throw new ContainerException("ERROR: You can't add more items because container is closed") {
            };
        } else if (iitem == null || ip == null || color == null) {
            throw new ContainerException("ERROR: You can't add null parameter") {
            };
        } else {
            for (int i = 0; i < nr_itens; i++) {
                if (this.array[i].getItem().equals(iitem)) {
                    return false;
                }
            }
            
            if (nr_itens < max) {
                ItemPacked tmp = new ItemPacked(color, iitem, ip);
                this.array[nr_itens] = tmp;
                occupiedVolume += iitem.getVolume();
                nr_itens += 1;
                return true;
            } else {
                this.array = new ItemPacked[nr_itens + 10];
                ItemPacked tmp = new ItemPacked(color, iitem, ip);
                this.array[nr_itens] = tmp;
                occupiedVolume += iitem.getVolume();
                nr_itens += 1;
                return true;
            }
        }
    }


    /**
     *
     * @param iitem do tipo IItem
     * @return true se for removido com sucesso ou false se o item não existir no container
     * @throws ContainerException excepção se o container estiver fechado ou excepção se forem enviados nulls
     * Método para remover um item do container
     */
    @Override
    public boolean removeItem(IItem iitem) throws ContainerException {
        int pos;
        
        if (state == true) {
            throw new ContainerException("ERROR: You can't remove more items because container is closed") {
            };
        } else if (iitem == null) {
            throw new ContainerException("ERROR: You can't remove null parameter") {
            };
        } else {
            for (int i = 0; i < nr_itens; i++) { // percorremos array
                if (array[i].getItem() == iitem) { // verificamos se existe algum item igual ao pedido de remoçao
                    pos = i;
                    this.array[pos] = null; //se encontrarmos o item apagamos do array

                    //puxamos da direita para esquerda os itens apartir da posição onde removemos o item
                    for (int j = pos; j < nr_itens - 1; j++) {
                        this.array[j] = this.array[j + 1];
                    }

                    this.occupiedVolume = this.occupiedVolume - iitem.getVolume();
                    this.nr_itens--;

                    //retornamos true após o item ser removido com sucesso
                    return true;
                }
            }
            return false;
        }
    }

    /**
     *
     * @throws ContainerException excepção caso o volume do container seja excedido
     * @throws PositionException excepção caso haja items em overlapping ou excepção caso haja items em overflowing
     * Método para validar se os items não excedem o volume do container e se não existe items em
     * overlapping ou overflowing
     */
    @Override
    public void validate() throws ContainerException, PositionException {
        
        //se o volume ocupado pelos items for maior que o volume do container lançamos uma excepção
        if (occupiedVolume > maxVolume) {
            throw new ContainerException("ERROR : Volume do container excedido") {
            };
           // se o item estiver fora do container em alguma das arestas lança excepção 
        } else {
            for (int i = 0; i < nr_itens; i++) {
                if (this.array[i].getItem().getDepth() > this.getDepth()
                        || this.array[i].getItem().getHeight() > this.getHeight()
                        || this.array[i].getItem().getLenght() > this.getLenght()) {
                    throw new PositionException("ERROR : Overflowing") {
                    };
                }
            }
        }
            
        //percorremos o array
        for (int i = 0; i < nr_itens - 1; i++) {
            for (int j = i + 1; j < nr_itens; j++) {
                //Se houver overlapping lançamos excepção
                if (array[i].getPosition().getX() < array[j].getPosition().getX() + array[j].getItem().getDepth() 
                        && array[j].getPosition().getX() < array[i].getPosition().getX() + array[i].getItem().getDepth()
                        && array[i].getPosition().getY() < array[j].getPosition().getY() + array[j].getItem().getHeight()
                        && array[j].getPosition().getY() < array[i].getPosition().getY() + array[i].getItem().getHeight()
                        && array[i].getPosition().getZ() < array[j].getPosition().getZ() + array[j].getItem().getLenght()
                        && array[j].getPosition().getZ() < array[i].getPosition().getZ() + array[i].getItem().getLenght()) {
                    this.state = false;
                    throw new PositionException("ERROR : Overlapping") {
                    };
                }
            }
        }

        System.out.println("Container validated");
        this.state = true;
    }

    /**
     *
     * @throws ContainerException excepção caso o volume do container seja excedido
     * @throws PositionException excepção caso haja items em overlapping ou excepção caso haja items em overflowing 
     * Método para validar se o volume dos items que estão dentro do container nao excedem o volume do container
     * e se não existe overlapping ou overflowing de items para assim fechar o container.
     */
    @Override
    public void close() throws ContainerException, PositionException {
        validate();
    }

    /**
     *
     * @param string do tipo String
     * @return item do tipo IItem
     * Método para procurar e obter a info de um item do container caso ele exista 
     */
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

    /**
     *
     * @return occupiedVolume do tipo inteiro
     * Método para retornar o volume ocupado pelos items dentro do container
     */
    @Override
    public int getOccupiedVolume() {
        return this.occupiedVolume;
    }

    /**
     *
     * @return itemPacked do tipo IItemPacked[]
     * Método que retorna os items que estão dentro do container
     */
    @Override
    public IItemPacked[] getPackedItems() { 
        
        IItemPacked[] itemPacked = new IItemPacked[nr_itens];
        
         for (int i = 0; i < nr_itens; i++) { // percorremos array
            itemPacked[i] = array[i];
        }
        return itemPacked;
    }

    /**
     *
     * @return reference do tipo String
     * Método que retorna a referencia do container
     */
    @Override
    public String getReference() {
        return reference;
    }

    /**
     *
     * @return nr_itens do tipo inteiro
     * Método que retorna o número de items dentro do container
     */
    @Override
    public int getNumberOfItems() {
        return nr_itens;
    }

    /**
     *
     * @return remainingVolume do tipo inteiro
     * Método que retorno o volume do container que ainda está disponivel
     */
    @Override
    public int getRemainingVolume() {
        int remainingVolume = maxVolume - occupiedVolume;
        return remainingVolume;
    }

    /**
     *
     * @return state do tipo boolean
     * Método que torna um booleano para sabermos se o container está aberto ou fechado
     */
    @Override
    public boolean isClosed() {
       return state;
    }
    
    
    /**
     * @return text do tipo String
     * Método para imprimir a info do container
     */
    @Override
    public String toString(){
        String text = reference + "\nNr de itens: " + nr_itens + "\n";
        for (int i = 0; i < nr_itens; i++) {
            text = text + this.array[i].toString() + "\n";
        }
        return text;
    }
}
