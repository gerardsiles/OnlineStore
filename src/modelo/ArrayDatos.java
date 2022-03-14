package modelo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayDatos {
    // esta clase es temporal, substituye la conexion con la base de datos.
    private static ArrayList<Articulo> articulos = new ArrayList<>();
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static ArrayList<ClienteEstandard> ce = new ArrayList<>();
    private static ArrayList<ClientePremium> cp = new ArrayList<>();
    private static ArrayList<Pedido> pedido = new ArrayList<>();





    // metodos para articulo
    public static void addArticulo(Articulo articulo) {
        articulos.add(articulo);
    }

    public static Articulo getArticulo(String codigo) {
        return articulos.stream().filter(articulo -> codigo.equals(articulo.getCodigoProducto())).findFirst().orElse(null);}

    public static ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public static boolean articuloExiste(Articulo articulo) {
        return getArticulos().contains(articulo);
    }

    public static ArrayList<Cliente> getClientes() {return clientes;};

    public static ArrayList<ClienteEstandard> getClientesEstandard() {return ce;}

    public static void addClienteEstandard(ClienteEstandard clienteEstandard) {ce.add(clienteEstandard);}

    public static ArrayList<ClientePremium> getClientesPremium() {return cp;}

    public static void addClientePremium(ClientePremium clientePremium) {cp.add(clientePremium);}


    public static boolean clienteExiste(Cliente cliente) {
        return getClientes().contains(cliente);
    }



    public ArrayList<ClientePremium> getClientePremium() {return cp;};

    public void addPedido() {
        // todo
    }

    // PRECARGAR DATOS AL INICIAR APLICACION
    public static void cargarDatos() {
        // PRECARGAR DATOS
        // ARTICULOS
        Articulo articulo1 = new Articulo("AS235D", "descripcion1", 34.5, 4.24, 67);
        addArticulo(articulo1);
        Articulo articulo2 = new Articulo("AS235E", "descripcion2", 3412.45, 7.24, 12);
        addArticulo(articulo2);
        Articulo articulo3 = new Articulo("AS235F", "descripcion3", 67.34, 2.35, 5);
        addArticulo(articulo3);
        Articulo articulo4 = new Articulo("AS235G", "descripcion4", 98.34, 5.26, 34);
        addArticulo(articulo4);
        Articulo articulo5 = new Articulo("AS235H", "descripcion5", 2.45, 1.9, 23);
        addArticulo(articulo5);
        Articulo articulo6 = new Articulo("AS235I", "descripcion6", 98.5, 3.4, 12);
        addArticulo(articulo6);
        Articulo articulo7 = new Articulo("AS235J", "descripcion7", 2.3, 2.90, 98);
        addArticulo(articulo7);
        Articulo articulo8 = new Articulo("AS235K", "descripcion8", 3.89, 4.5, 22);
        addArticulo(articulo8);
        Articulo articulo9 = new Articulo("AS235L", "descripcion9", 25.63, 1.97, 14);
        addArticulo(articulo9);

        // CLIENTES ESTANDARD
        ClienteEstandard cl1 = new ClienteEstandard("nombre1", "domicilio1", "nif1", "email1@prueba.com");
        addClienteEstandard(cl1);
        ClienteEstandard cl2 = new ClienteEstandard("nombre2", "domicilio2", "nif2", "email2@prueba.com");
        addClienteEstandard(cl2);
        ClienteEstandard cl3 = new ClienteEstandard("nombre3", "domicilio3", "nif3", "email3@prueba.com");
        addClienteEstandard(cl3);
        ClienteEstandard cl4 = new ClienteEstandard("nombre4", "domicilio4", "nif4", "email4@prueba.com");
        addClienteEstandard(cl4);
        ClienteEstandard cl5 = new ClienteEstandard("nombre5", "domicilio5", "nif5", "email5@prueba.com");
        addClienteEstandard(cl5);
        ClienteEstandard cl6 = new ClienteEstandard("nombre6", "domicilio6", "nif6", "email6@prueba.com");
        addClienteEstandard(cl6);
        ClienteEstandard cl7 = new ClienteEstandard("nombre7", "domicilio7", "nif7", "email7@prueba.com");
        addClienteEstandard(cl7);
        ClienteEstandard cl8 = new ClienteEstandard("nombre8", "domicilio8", "nif8", "email8@prueba.com");
        addClienteEstandard(cl8);
        ClienteEstandard cl9 = new ClienteEstandard("nombre9", "domicilio9", "nif9", "email9@prueba.com");
        addClienteEstandard(cl9);
        // CLIENTES PREMIUM
        ClientePremium cl10 = new ClientePremium("nombre10", "domicilio10", "nif10", "email10@prueba.com");
        addClientePremium(cl10);
        ClientePremium cl11 = new ClientePremium("nombre11", "domicilio11", "nif11", "email11@prueba.com");
        addClientePremium(cl11);
        ClientePremium cl12 = new ClientePremium("nombre12", "domicilio12", "nif12", "email12@prueba.com");
        addClientePremium(cl12);
        ClientePremium cl13 = new ClientePremium("nombre13", "domicilio13", "nif13", "email13@prueba.com");
        addClientePremium(cl13);
        ClientePremium cl14 = new ClientePremium("nombre14", "domicilio14", "nif14", "email14@prueba.com");
        addClientePremium(cl14);
        ClientePremium cl15 = new ClientePremium("nombre15", "domicilio15", "nif15", "email15@prueba.com");
        addClientePremium(cl15);
        ClientePremium cl16 = new ClientePremium("nombre16", "domicilio16", "nif16", "email16@prueba.com");
        addClientePremium(cl16);
        ClientePremium cl17 = new ClientePremium("nombre17", "domicilio17", "nif17", "email17@prueba.com");
        addClientePremium(cl17);
        ClientePremium cl18 = new ClientePremium("nombre18", "domicilio18", "nif18", "email18@prueba.com");
        addClientePremium(cl18);
        ClientePremium cl19 = new ClientePremium("nombre19", "domicilio19", "nif19", "email19@prueba.com");
        addClientePremium(cl19);
        // PEDIDOS
    }

}
