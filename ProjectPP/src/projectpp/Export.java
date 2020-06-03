/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpp;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import shippingorder.IExporter;
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

public class Export implements IExporter{

    /**
     *
     * @param iso do tipo IShippingOrder
     * @throws IOException excepção default
     * Método para passar a info de order para json
     */
    @Override
    public void export(IShippingOrder iso) throws IOException {

        Gson json = new Gson();
        String string = json.toJson(iso.summary());

        try {
            FileWriter writer = new FileWriter("ShippingOrder.json");
            writer.write(string);
            writer.close();

        } catch (IOException e) {
            e.getMessage();
        }

        System.out.println(string);
    }
}
