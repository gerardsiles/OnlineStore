package modelo;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ArrayDatos {
    // esta clase es temporal, substituye la conexion con la base de datos.
    private static ArrayList<Articulo> articulos = new ArrayList<>();
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static ArrayList<ClienteEstandard> ce = new ArrayList<>();
    private static ArrayList<ClientePremium> cp = new ArrayList<>();
    private static ArrayList<Pedido> pedidos = new ArrayList<>();





    // metodos para articulo
    public static void addArticulo(Articulo articulo) {
        articulos.add(articulo);
    }

    public static Articulo getArticulo(String codigo) {
        return articulos.stream().filter(articulo -> codigo.equals(articulo.getCodigoProducto())).findFirst().orElse(null);}

    public static List getArticulos() {
        return articulos;
    }

    public static boolean articuloExiste(String codArticulo) {
        Articulo articulo = getArticulo(codArticulo);
        return getArticulos().contains(articulo);
    }

    public static ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public static Cliente getCliente(String email) {
        return clientes.stream().filter(cliente -> email.equals(cliente.getEmail())).findFirst().orElse(null);
}

    public static void addCliente(Cliente cliente) {clientes.add(cliente);}

    public static ArrayList<ClienteEstandard> getClientesEstandard() {return ce;}

    public static void addClienteEstandard(ClienteEstandard clienteEstandard) {ce.add(clienteEstandard);}

    public static ArrayList<ClientePremium> getClientesPremium() {return cp;}

    public static void addClientePremium(ClientePremium clientePremium) {cp.add(clientePremium);}

    // metodo para comprobar si un cliente en concreto existe en los datos
    public static boolean clienteExiste(Cliente cliente) {
        return getClientes().contains(cliente);
    }


    public static Pedido getPedido(int numeroPedido) {
        return pedidos.stream().filter(pedido -> numeroPedido == pedido.getNumeroDePedido()).findFirst().orElse(null);
    }

    public static void addPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public static ArrayList<Pedido> getPedidos() { return pedidos;}

    // metodo para comprobar si un pedido en concreto existe en los datos
    public static boolean pedidoExiste(Pedido pedido) { return getPedidos().contains(pedido);}

    public static boolean eliminarPedido(int numPedido) {
        boolean eliminado = false;
        eliminado = pedidos.removeIf(pedido -> numPedido == pedido.getNumeroDePedido());
        return eliminado;
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
        // PEDIDOS
        Pedido pedido1 = new Pedido(1,articulo1, cl1, 1, LocalDate.now(), false);
        addPedido(pedido1);
        Pedido pedido2 = new Pedido(2,articulo1, cl4, 4, LocalDate.now(), false);
        addPedido(pedido2);
        Pedido pedido3 = new Pedido(3,articulo1, cl8, 15, LocalDate.now(), true);
        addPedido(pedido3);
        Pedido pedido4 = new Pedido(4,articulo1, cl19, 3, LocalDate.now(), false);
        addPedido(pedido4);
        Pedido pedido5 = new Pedido(5,articulo1, cl14, 7, LocalDate.now(), true);
        addPedido(pedido5);
        Pedido pedido6 = new Pedido(6,articulo1, cl11, 9, LocalDate.now(), false);
        addPedido(pedido6);
        Pedido pedido7 = new Pedido(7,articulo1, cl6, 12, LocalDate.now(), false);
        addPedido(pedido7);
        Pedido pedido8 = new Pedido(8,articulo1, cl17, 3, LocalDate.now(), false);
        addPedido(pedido8);
        Pedido pedido9 = new Pedido(9,articulo1, cl12, 11, LocalDate.now(), true);
        addPedido(pedido9);
    }

}
