package controlador;

// importar modelo
import modelo.Datos;
// importar vista
import vista.GestionOS;

import java.util.ArrayList;
import java.util.List;


public class Controlador {
    private final Datos modelo;
    private final GestionOS vista;
    private int opcion = 0;

    // constructor
    public Controlador(Datos modelo, GestionOS vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    // MENU PRINCIPAL
    public void cargarDatos() {
        modelo.cargarDatos();
    }
    // Vista menu general
    public void mostrarMenuPrincipal() throws Exception {
        opcion = vista.printMenu();
        performActionMenu(opcion);
    }


    // Accion del menu principal
    public void performActionMenu(int choice) throws Exception {
        switch (choice) {
            case 0 -> OnlineStore.setExitTrue();
            case 1 -> gestionArticulos();
            case 2 -> gestionClientes();
            case 3 -> gestionDePedidos();
        }
    }

    // GESTION DE ARTICULOS
    public void gestionArticulos() throws Exception {
        opcion = vista.printGestionArticulos();
        performActionArticulo(opcion);

    }

    public void performActionArticulo(int choice) throws Exception {
        switch (choice) {
            case 0 -> mostrarMenuPrincipal();
            case 1 -> agregarArticulo();
            case 2 -> mostrarArticulos();
        }
    }

    public void agregarArticulo() {
        boolean creado = false;
        List<Object> parametros = new ArrayList<>();
        parametros = vista.printAgregarArticulo();
        // enviar informacion a Datos
        if (!parametros.isEmpty()) {
            creado = Datos.crearArticulo(parametros);
        }
        vista.articuloCreado(creado);
    }
    public static boolean comprobarArticuloExiste(String codArticulo) throws ArticuloNoExisteException {
        boolean existe = Datos.articuloExiste(codArticulo);
        return existe;
    }

    public void mostrarArticulos() {
        // Crear una array temporal para recibir articulos
        List lista = Datos.listarArticulos();;
        // Llenar la array con los articulos
        // Llamar a la vista para mostrar los articulos
        vista.printMostrarArticulos(lista);
    }
    // FIN GESTION DE ARTICULOS

    // GESTION DE CLIENTES
    private void gestionClientes() throws Exception {
        opcion = vista.printGesionClientes();
        performActionCliente(opcion);
    }

    public void performActionCliente(int choice) throws Exception {
        switch (choice) {
            case 0 -> mostrarMenuPrincipal();
            case 1 -> agregarCliente();
            case 2 -> mostrarClientes();
            case 3 -> mostrarClientesEstandard();
            case 4 -> mostrarClientesPremium();
        }
    }

    // metodo para agregar un cliente
    public void agregarCliente() {
        boolean creado = false;
        boolean existe = false;
        List<Object> parametros;
        parametros = vista.printAgregarCliente();

        // comprobar que nos lleguen parametros de entrada
        if (!parametros.isEmpty()) {
            // comprobar si el cliente introducido ya existe
            existe = modelo.clienteExiste(parametros.get(1).toString());
            if(!existe) {
                creado = modelo.crearCliente(parametros);
                vista.clienteCreado(creado);
            }
        }

    }



    // metodo para mostrar los clientes
    public void mostrarClientes() {
        List lista = modelo.recibirDatosClientes();
        vista.printMostrarClientes(lista);
    }

    // metodo para mostrar clientes estandard
    public void mostrarClientesEstandard() {
        List lista = modelo.recibirDatosClientesEstandard();
        vista.printMostrarClientesEstandard(lista);
    }

    public void mostrarClientesPremium() {
        List lista = modelo.recibirDatosClientesPremium();
        vista.printMostrarClientesPremium(lista);
    }

    // FIN GESTION DE CLIENTES


    //  GESTION DE PEDIDOS
    private void gestionDePedidos() throws Exception {
        opcion = vista.printGesionPedidos();
        performActionPedido(opcion);
    }

    // Sub menu para los pedidos
    public  void performActionPedido(int choice) throws Exception {
        switch (choice) {
            case 0 -> mostrarMenuPrincipal();
            case 1 -> agregarPedido();
            case 2 -> eliminarPedido();
            case 3 -> mostrarPedidosPendientes();
            case 4 -> mostrarPedidosEnviados();
        }
    }

    // metodo para agregar un pedido
    public void agregarPedido() throws Exception {
        boolean pedidoCreado = false;
        List parametros = vista.printAgregarPedido();

        // comprobar que los parametros no esten vacios
        if (!parametros.isEmpty()) {
            // si no estan vacios, creamos el pedido
            pedidoCreado = Datos.crearDatosPedido(parametros);
        }

    }

    public static boolean pedidoExiste(int numPedido) {
        boolean existe = Datos.pedidoExiste(numPedido);
        return existe;
    }

    // metodo para eliminar un pedido
    public void eliminarPedido() throws Exception {
        int numPedido = 0;
        boolean pedidoEliminado = false;

        // recibir el número del pedido a ser borrado
        numPedido = vista.printEliminarPedido();

        pedidoEliminado = Datos.eliminarPedido(numPedido);

        vista.pedidoEliminado(pedidoEliminado);

    }

    // metodo para mostrar los pedidos pendientes de envio
    public void mostrarPedidosPendientes() {
        List lista = new ArrayList<>();
        // llenar la lista con los pedidos pendientes
        lista = Datos.recibirDatosPedidosPendientes();
        // enviar la lista a vista
        vista.printMostrarPedidosPendientes(lista);
    }

    // metodo para mostrar los pedidos enviados
    public void mostrarPedidosEnviados() {
        List lista = new ArrayList<>();
        // llenar la lista con los pedidos enviados
        lista = Datos.recibirDatosPedidosEnviados();
        // enviar la lista a vista para ser impresa
        vista.printMostrarPedidosEnviados(lista);
    }

    // FIN GESTION DE PEDIDOS




}
