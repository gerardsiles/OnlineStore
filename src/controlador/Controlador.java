package controlador;

import modelo.Datos;
import vista.GestionOS;


public class Controlador {

    private static GestionOS vista;
    private static Datos datos;
    private static int opcion = 0;

    // constructor? es necesario?
    public Controlador() {
        this.vista = vista;
        this.datos = datos;
        this.opcion = 0;
    }


    // MENU PRINCIPAL

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
        GestionOS.printGestionArticulos();
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
        // todo
    }

    public static void mostrarArticulos() {
        // todo
    }
    // GIN GESTION DE ARTICULOS

    // GESTION DE CLIENTES
    private static void gestionClientes() throws Exception {
        GestionOS.printGesionClientes();
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
        // todo
    }

    // metodo para mostrar los clientes
    public static void mostrarClientes() {
        // todo
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
        performActionMenu(opcion);
    }
    // FIN GESTION DE PEDIDOS




}
