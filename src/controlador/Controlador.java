package controlador;



import modelo.Datos;
import vista.GestionOS;

import java.util.ArrayList;
import java.util.List;


public class Controlador {

    private static GestionOS vista;
    private static Datos datos;
    private static int opcion = 0;


    // MENU PRINCIPAL
    public static void cargarDatos() {
        Datos.cargarDatos();
    }
    // Vista menu general
    public static void mostrarMenuPrincipal() throws Exception {
        opcion = GestionOS.printMenu();
        performActionMenu(opcion);
    }


    // Accion del menu principal
    public static void performActionMenu(int choice) throws Exception {
        switch (choice) {
            case 0 -> OnlineStore.setExitTrue();
            case 1 -> gestionArticulos();
            case 2 -> gestionClientes();
            case 3 -> gestionDePedidos();
        }
    }

    // GESTION DE ARTICULOS
    public static void gestionArticulos() throws Exception {
        opcion = GestionOS.printGestionArticulos();
        performActionArticulo(opcion);

    }

    public static void performActionArticulo(int choice) throws Exception {
        switch (choice) {
            case 0 -> mostrarMenuPrincipal();
            case 1 -> agregarArticulo();
            case 2 -> mostrarArticulos();
        }
    }

    public static void agregarArticulo() {
        boolean creado = false;
        List<Object> parametros = new ArrayList<Object>();
        parametros = GestionOS.printAgregarArticulo();
        // enviar informacion a Datos
        creado = Datos.crearArticulo(parametros);
        GestionOS.articuloCreado(creado);
    }

    public static void mostrarArticulos() {
        // Crear una array temporal para recibir articulos
        List lista = Datos.listarArticulos();;
        // Llenar la array con los articulos
        // Llamar a la vista para mostrar los articulos
        GestionOS.printMostrarArticulos(lista);
    }
    // FIN GESTION DE ARTICULOS

    // GESTION DE CLIENTES
    private static void gestionClientes() throws Exception {
        opcion = GestionOS.printGesionClientes();
        performActionCliente(opcion);
    }

    public static void performActionCliente(int choice) throws Exception {
        switch (choice) {
            case 0 -> mostrarMenuPrincipal();
            case 1 -> agregarCliente();
            case 2 -> mostrarClientes();
            case 3 -> mostrarClientesEstandard();
            case 4 -> mostrarClientesPremium();
        }
    }

    // metodo para agregar un cliente
    public static void agregarCliente() {
        //todo
        List<Object> parametros;
        parametros = GestionOS.printAgregarCliente();

        // llamar al metodo en datos para crear el cliente
        if (!parametros.isEmpty()){
            Datos.crearCliente(parametros);
        }
        // enviar ok a vista o fail
    }

    public static boolean comprobarClienteExiste(String email) {
        return Datos.clienteExiste(email);
    }

    // metodo para mostrar los clientes
    public static void mostrarClientes() {
        //todo
        // llamar al metodo en datos
        // enviar a vista
    }

    // metodo para mostrar clientes estandard
    public static void mostrarClientesEstandard() {
        // todo
    }

    public static void mostrarClientesPremium() {
        // todo
    }

    // FIN GESTION DE CLIENTES

    //  GESTION DE PEDIDOS
    private static void gestionDePedidos() throws Exception {
        GestionOS.printGesionPedidos();
        performActionPedido(opcion);
    }

    // Sub menu para los pedidos
    public static void performActionPedido(int choice) throws Exception {
        switch (choice) {
            case 0 -> mostrarMenuPrincipal();
            case 1 -> agregarPedido();
            case 2 -> eliminarPedido();
            case 3 -> mostrarPedidosPendientes();
            case 4 -> mostrarPedidosEnviados();
        }
    }

    // metodo para agregar un pedido
    public static void agregarPedido() {
        // todo
    }

    // metodo para eliminar un pedido
    public static void eliminarPedido() {
        // todo
    }

    // metodo para mostrar los pedidos pendientes de envio
    public static void mostrarPedidosPendientes() {
        // todo
    }

    // metodo para mostrar los pedidos enviados
    public static void mostrarPedidosEnviados() {
        // todo
    }

    // metodo para eliminar un pedido
    // FIN GESTION DE PEDIDOS




}
