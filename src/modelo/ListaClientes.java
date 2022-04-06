package modelo;

import java.util.ArrayList;
import java.util.List;

public class ListaClientes extends Lista<Cliente>{
    private static ArrayList<Cliente> clientes = new ArrayList<>();


    public static ArrayList<Cliente> getClientes() {
        return clientes;
    }

    // Lambda para devolver un cliente concreto
    public static Cliente getCliente(String email) {
        return clientes.stream().filter(cliente -> email.equals(cliente.getEmail())).findFirst().orElse(null);
    }

    // Metodo para agregar a un cliente
    public static void addCliente(Cliente cliente) {clientes.add(cliente);}

    // metodo para comprobar si un cliente en concreto existe en los datos
    public static boolean clienteExiste(Cliente cliente) {
        return getClientes().contains(cliente);
    }

    public static List listarClientes() {
        List lista = getClientes();
        return lista;
    }

    public static List listarClientesEstandard() {
        List lista = new ArrayList();
        for (Cliente cliente : getClientes()) {
            if (cliente instanceof ClienteEstandard) {
                lista.add(cliente);
            }
        }
        return lista;
    }

    public static List listarClientesPremium() {
        List lista = new ArrayList();
        for(Cliente cliente : getClientes()) {
            if (cliente instanceof ClientePremium) {
                lista.add(cliente);
            }
        }
        return lista;
    }

    public static void cargarDatosClientes() {
        // PRECARGAR DATOS DE CLIENTES
        // CLIENTES ESTANDARD
        ClienteEstandard cl1 = new ClienteEstandard("nombre1", "domicilio1", "nif1", "email1@prueba.com");
        addCliente(cl1);
        ClienteEstandard cl2 = new ClienteEstandard("nombre2", "domicilio2", "nif2", "email2@prueba.com");
        addCliente(cl2);
        ClienteEstandard cl3 = new ClienteEstandard("nombre3", "domicilio3", "nif3", "email3@prueba.com");
        addCliente(cl3);
        ClienteEstandard cl4 = new ClienteEstandard("nombre4", "domicilio4", "nif4", "email4@prueba.com");
        addCliente(cl4);
        ClienteEstandard cl5 = new ClienteEstandard("nombre5", "domicilio5", "nif5", "email5@prueba.com");
        addCliente(cl5);
        ClienteEstandard cl6 = new ClienteEstandard("nombre6", "domicilio6", "nif6", "email6@prueba.com");
        addCliente(cl6);
        ClienteEstandard cl7 = new ClienteEstandard("nombre7", "domicilio7", "nif7", "email7@prueba.com");
        addCliente(cl7);
        ClienteEstandard cl8 = new ClienteEstandard("nombre8", "domicilio8", "nif8", "email8@prueba.com");
        addCliente(cl8);
        ClienteEstandard cl9 = new ClienteEstandard("nombre9", "domicilio9", "nif9", "email9@prueba.com");
        addCliente(cl9);
        // CLIENTES PREMIUM
        ClientePremium cl10 = new ClientePremium("nombre10", "domicilio10", "nif10", "email10@prueba.com");
        addCliente(cl10);
        ClientePremium cl11 = new ClientePremium("nombre11", "domicilio11", "nif11", "email11@prueba.com");
        addCliente(cl11);
        ClientePremium cl12 = new ClientePremium("nombre12", "domicilio12", "nif12", "email12@prueba.com");
        addCliente(cl12);
        ClientePremium cl13 = new ClientePremium("nombre13", "domicilio13", "nif13", "email13@prueba.com");
        addCliente(cl13);
        ClientePremium cl14 = new ClientePremium("nombre14", "domicilio14", "nif14", "email14@prueba.com");
        addCliente(cl14);
        ClientePremium cl15 = new ClientePremium("nombre15", "domicilio15", "nif15", "email15@prueba.com");
        addCliente(cl15);
        ClientePremium cl16 = new ClientePremium("nombre16", "domicilio16", "nif16", "email16@prueba.com");
        addCliente(cl16);
        ClientePremium cl17 = new ClientePremium("nombre17", "domicilio17", "nif17", "email17@prueba.com");
        addCliente(cl17);
        ClientePremium cl18 = new ClientePremium("nombre18", "domicilio18", "nif18", "email18@prueba.com");
        addCliente(cl18);
        ClientePremium cl19 = new ClientePremium("nombre19", "domicilio19", "nif19", "email19@prueba.com");
        addCliente(cl19);
    }

}