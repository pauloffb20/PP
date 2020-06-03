/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpp;


import order.base.ICustomer;
import order.base.IPerson;
import order.base.OrderStatus;
import order.exceptions.ContainerException;
import order.exceptions.OrderException;
import order.exceptions.PositionException;
import order.packing.IContainer;
import shippingorder.IShippingOrder;

/**
 *
 * @author Paulo Filipe Ferreira Brito
 * Nr: 8160279
 * Turma 3
 * @author Hugo Maia Alves
 * Nr: 8160521
 * Turma: 2
 */

public class ShippingOrder implements IShippingOrder{
    
    private static int id = 1;
    private int orderid;
    private final int max = 5;
    private int nr_containers;
    private IContainer[] containers;
    private OrderStatus status;
    private ICustomer customer;
    private IPerson destination;

    /**
     *
     * @param customer do tipo ICustomer
     * @param person do tipo Iperson
     */
    public ShippingOrder(ICustomer customer, IPerson person){
        this.orderid = id;
        id++;
        this.nr_containers = 0;
        this.containers = new Container[max];
        this.status = OrderStatus.IN_TREATMENT;
        this.customer = customer;
        this.destination = person;
    }

    /**
     * Método para adicionar um container na order
     * @param ic do tipo Icontainer
     * @return true se adicionar com sucesso ou false caso o container já exista
     * @throws OrderException excepção caso o estado da order não esteja "In Treatment"
     * @throws ContainerException excepção se for enviado um null ou excepção se o container estiver aberto
     */
    @Override
    public boolean addContainer(IContainer ic) throws OrderException, ContainerException {

        if (status != OrderStatus.IN_TREATMENT) {
            throw new OrderException("ERROR: You can't add because order is not in treatment") {
            };
        } else if (ic == null) {
            throw new ContainerException("ERROR: You can't add null parameter") {
            };
        } else if (ic.isClosed() == false) {
            throw new ContainerException("ERROR: You can't add because container is open!") {
            };
        } else {
            for (int i = 0; i < nr_containers; i++) {
                if (this.containers[i].equals(ic)) {
                    return false;
                }
            }
        }

        if (nr_containers < max) {
            this.containers[nr_containers] = ic;
            nr_containers += 1;
            return true;
        } else {
            this.containers = new Container[nr_containers + 10];
            this.containers[nr_containers] = ic;
            nr_containers += 1;
            return true;
        }
    }

    /**
     * Método para remover um container da order
     * @param ic do tipo IContainer
     * @return true se o container for encontrado e removido com sucesso ou false se o a ser removido não existir
     * @throws OrderException excepção se a order não estiver no estado de "In Treatment"
     * @throws ContainerException excepção caso seja enviado um parametro null
     * 
     */
    @Override
    public boolean removeContainer(IContainer ic) throws OrderException, ContainerException {

        if (status != OrderStatus.IN_TREATMENT) {
            throw new OrderException("ERROR : Impossivel to remove because order is not in treatment") {
            };
        } else if (ic == null) {
            throw new ContainerException("ERROR : Impossivel to remove nulls") {
            };
        } else {
            for (int i = 0; i < nr_containers; i++) {
                if (containers[i].equals(ic)) {

                    this.containers[i] = null;

                    for (int j = i; j < nr_containers - 1; j++) {
                        this.containers[j] = this.containers[j + 1];
                    }

                    this.nr_containers--;
                    return true;
                }
            }
            return false;
        }
    }

    /**
     * Método para ver se o container existe na order
     * @param ic do tipo IContainer
     * @return true se o container existir na order ou retorna false se o container não existir na order
     * 
     */
    @Override
    public boolean existsContainer(IContainer ic) {

        for (int i = 0; i < nr_containers; i++) { 
            if (containers[i].equals(ic)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Método para encontrar a posição de um container na coleção
     * @param string do tipo String
     * @return a posição na coleção do container pedido ou -1 se o container pedido não estiver na coleção
     * 
     */
    @Override
    public int findContainer(String string) {
        int pos = -1;

        for (int i = 0; i < nr_containers; i++) { 
            if (containers[i].getReference().equals(string)) {
                pos = i;
                return pos;
            }
        }
        return pos;
    }

    /**
     * Método que retorna o destino da order, ou seja, o endereço da pessoa que vai receber
     * @return destination do tipo IPerson
     */
    @Override
    public IPerson getDestination() {
        return destination;
    }

    /**
     * Método para alterar o destino da order
     * @param ip do tipo IPerson
     */
    @Override
    public void setDestination(IPerson ip) {
       this.destination = ip;
    }

    /**
     * Método para retornar o customer que fez a order
     * @return customer do tipo ICustomer
     * 
     */
    @Override
    public ICustomer getCustomer() {
        return customer;
    }

    /**
     * Método para retornar os status da order
     * @return status do tipo OrderStatus
     * 
     */
    @Override
    public OrderStatus getStatus() {
        return status;
    }

    /**
     * Método para alterar o status da order
     * @param os do tipo OrderStatus
     * @throws OrderException excepção se os status para alteração nao for compativeis para mudança
     * @throws ContainerException excepção se o volume dos itens dentro do container for maior que o volume do container
     * @throws PositionException excepção se houver overllpaing ou overflowing dos itens que estão dentro do container
     */
    @Override
    public void setStatus(OrderStatus os) throws OrderException, ContainerException, PositionException {
        if(os == OrderStatus.IN_TREATMENT){
           this.status = OrderStatus.AWAITS_TREATMENT; 
        } else if(os == OrderStatus.CLOSED){
            this.status = OrderStatus.IN_TREATMENT;
        } else if (os == OrderStatus.SHIPPED) {
            validate();
            this.status = OrderStatus.CLOSED;
        } else {
            throw new OrderException("ERROR : The current status is not compatible with the status to change") {
            };
        }
    }

    /**
     * Método para retornar o id da order
     * @return orderid do tipo inteiro
     * 
     */
    @Override
    public int getId() {
       return orderid;
    }

    /**
     * Método para retornar um conjunto de containers existentes na order
     * @return containers do tipo IContainer[]
     */
    @Override
    public IContainer[] getContainers() {

        IContainer[] containers2 = new IContainer[nr_containers];

        for (int i = 0; i < nr_containers; i++) { // percorremos array
            containers2[i] = containers[i];
        }
        return containers2;
    }

    /**
     * Método que verifica se todos os containers que estão na order são validos
     * @throws ContainerException excepção se o volume dos itens dentro do container for maior que o volume do container
     * @throws PositionException  excepção se houver overllpaing ou overflowing dos itens que estão dentro do container
     * 
     */
    @Override
    public void validate() throws ContainerException, PositionException {
        for (int i = 0; i < nr_containers-1; i++) {
            try {
                this.containers[i].validate();
            } catch (ContainerException | PositionException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     * Método para retornar um sumário da order que contem o id da order, status, todos os containers existentes
     * na order e itens que estão nos containers
     * @return text do tipo String
     */
    @Override
    public String summary() {
        String text = "Order Id: " + getId() + "\n" + "Status: " + getStatus() + "\n";
        for(int i = 0; i < nr_containers; i++){
            text = text + this.containers[i].toString();
        }
        return text;
    }       
}
