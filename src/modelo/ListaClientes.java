package modelo;

import java.util.ArrayList;
import java.util.List;

public class ListaClientes extends Lista<Cliente>{

    public static List listarClientes() {
        List lista = ArrayDatos.getClientes();
        return lista;
    }

    public static List listarClientesEstandard() {
        List lista = new ArrayList();
        for (Cliente cliente : ArrayDatos.getClientes()) {
            if (cliente instanceof ClienteEstandard) {
                lista.add(cliente);
            }
        }
        return lista;
    }

    public static List listarClientesPremium() {
        List lista = new ArrayList();
           for(Cliente cliente : ArrayDatos.getClientes()) {
               if (cliente instanceof ClientePremium) {
                   lista.add(cliente);
               }
           }
        return lista;
    }
}
