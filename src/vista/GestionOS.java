package vista;

import controlador.ArticuloNoExisteException;
import controlador.Controlador;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionOS {
    // constructor
    public GestionOS() {
    }

    // Vista menu
    public int printMenu() {
        System.out.println("\nSeleccione el metodo: ");
        System.out.println("---------------------");
        System.out.println("1. Gestion de articulos");
        System.out.println("2. Gestion de clientes");
        System.out.println("3. Gestion de pedidos");
        System.out.println("Para salir pulse 0");
        return getInput(3);
    }

    // Sub menu para la gestion de los articulos
    public int printGestionArticulos() {
        System.out.println("\nSeleccione el metodo: ");
        System.out.println("---------------------");
        System.out.println("0. Volver al menu principal");
        System.out.println("1. Agregar articulo");
        System.out.println("2. Mostrar articulos");
        return getInput(2);
    }

    public List printAgregarArticulo() {
        String codigo, descripcion;
        double pvp, envio;
        int tiempo;
        List<Object> parametros = new ArrayList<>();
        // pedir informacion del artiulo y guardarlo en variables locales
        System.out.println("Introduzca el codigo del producto");
        codigo = getString();
        parametros.add(codigo);
        System.out.println("Introduzca la descripcion del articulo:");
        descripcion = getString();
        parametros.add(descripcion);
        System.out.println("Introduzca el precio de venta:");
        pvp = getDouble();
        parametros.add(pvp);
        System.out.println("Introduzca los gastos de envio:");
        envio = getDouble();
        parametros.add(envio);
        System.out.println("Introduzca el tiempo de preparacion en minutos:");
        tiempo = getInt();
        parametros.add(tiempo);

        // Devolver al controlador los parametros para crear el articulo
        return parametros;
    }
    public void articuloCreado(Boolean creado) {
        if (creado) {
            System.out.println("Se ha creado el articulo");
        } else {
           System.err.println("Ha habido un error al crear el articulo");
        }
    }

    public void printMostrarArticulos(List lista) {
        System.out.println("Lista de articulos");
        System.out.println("---------------------");

        for (Object o : lista) {
            System.out.println(o);
            System.out.println("---------------------");
        }
    }

    // Sub menu para la gestion de los clientes
    public int printGesionClientes() {
        System.out.println("\nSeleccione el metodo: ");
        System.out.println("---------------------");
        System.out.println("0. Volver al menu principal");
        System.out.println("1. Agregar cliente");
        System.out.println("2. Mostrar clientes");
        System.out.println("3. Mostrar clientes Estandard");
        System.out.println("4. Mostrar clientes Premium");
        return getInput(4);
    }

    // Sub menu para agregar un cliente
    public List printAgregarCliente() {
        int tipoDeCliente;
        String nombre, domicilio, nif, email;
        List parametros = new ArrayList<>();


        System.out.println("Introduzca que tipo  de cliente quiere crear");
        System.out.println("1. Cliente estandard");
        System.out.println("2. Cliente premium");
        tipoDeCliente = getInput(2);
        parametros.add(tipoDeCliente);

        System.out.println("Introduzca el email");
        email = getString();
        System.out.println("Introduzca el nombre");
        nombre = getString();
        parametros.add(nombre);
        System.out.println("Introduzca el domicilio");
        domicilio = getString();
        parametros.add(domicilio);
        System.out.println("Introduzca el nif");
        nif = getString();
        parametros.add(nif);
        parametros.add(email);

        // devolver la lista de parametros para crear el cliente
        return parametros;
    }

    public void clienteCreado(Boolean creado) {
        if (creado) {
            System.out.println("Se ha creado el cliente");
        } else {
            System.err.println("Este cliente ya existe");
        }
    }

    // Sub menu para mostrar los clientes existente
    public void printMostrarClientes(List lista) {
        System.out.println("Lista de clientes");
        System.out.println("---------------------");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
            System.out.println("---------------------");
        }
    }

    // Sub menu para mostrar los clientes estandard
    public void printMostrarClientesEstandard(List lista) {
        System.out.println("Lista de clientes Estandard");
        System.out.println("---------------------");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
            System.out.println("---------------------");
        }
    }

    // Sub menu para mostrar los clientes premium
    public void printMostrarClientesPremium(List lista) {
        System.out.println("Lista de clientes Premium");
        System.out.println("---------------------");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
            System.out.println("---------------------");
        }
    }

    // Sub menu para la gestion de los pedidos
    public static int printGesionPedidos() {
        System.out.println("\nSeleccione el metodo: ");
        System.out.println("---------------------");
        System.out.println("0. Volver al menu principal");
        System.out.println("1. Agregar pedido");
        System.out.println("2. Eliminar pedido");
        System.out.println("3. Mostrar pedidos pendientes de envio");
        System.out.println("4. Mostrar pedidos enviados");
        return getInput(4);
    }

    // Sub menu para agregar un pedido
    public List printAgregarPedido() throws Exception {
        List<Object> parametros = new ArrayList<>();
//        boolean articuloExiste, clienteExiste;
//        String codArticulo, emailCliente;
//        int cantidad;
//        LocalDate fecha = LocalDate.now();
//        boolean procesado = false;
//        System.out.println("\nIntroduzca la informacion del pedido: ");
//        System.out.println("--------------------------------------");
//        System.out.println("Introduzca el articulo");
//        codArticulo = getString();
//
//        // Comprobar si el articulo introducido existe
//        try {
//            articuloExiste = Controlador.comprobarArticuloExiste(codArticulo);
//            if (!articuloExiste) {
//                throw new ArticuloNoExisteException("Este articulo no existe");
//            }
//        }catch (ArticuloNoExisteException e) {
//            // si el articulo no existe, informamos al uruario y devolvemos una lista vacia
//            System.err.println(e);
//            controlador.mostrarMenuPrincipal();
//        }
//
//        System.out.println("Introduzca el email del cliente");
//        emailCliente = getString();
//
//        // comprobar si el cliente existe
//        try {
//             clienteExiste = controlador.comprobarClienteExiste(emailCliente);
//             if (!clienteExiste) {
//                 throw new ClienteNoExisteException("Este cliente no existe");
//             }
//        } catch (ClienteNoExisteException e) {
//            // si el cliente no existe, informamos al usuario y velvolemos una lista vacia
//            System.err.println(e);
//            controlador.mostrarMenuPrincipal();
//        }
//
//        //si el cliente y el articulo existen, procedemos a crear el pedido
//        System.out.println("Introduzca la cantidad de articulos");
//        cantidad = getInt();
//
//        parametros.add(codArticulo);
//        parametros.add(emailCliente);
//        parametros.add(cantidad);
//        parametros.add(fecha);
//        parametros.add(procesado);

        return parametros;
    }

    public static void pedidoCreado(Boolean creado) {
        if (creado) {
            System.out.println("Se ha creado el pedido");
        } else {
            System.err.println("Ha habido un error al crear el cliente");
        }
    }

    // Sub menu para eliminar un pedido
    public int printEliminarPedido() throws Exception {
        int numPedido = 0;
//        boolean existe;
//        System.out.println("Introduzca el numero de pedido a borrar");
//        numPedido = getInt();
//        try {
//            existe = Controlador.pedidoExiste(numPedido);
//            if (!existe) {
//                throw new PedidoNoExisteException("Ese pedido no existe, compruebe el numero");
//            }
//        } catch (PedidoNoExisteException e){
//            System.err.println(e);
//            controlador.mostrarMenuPrincipal();
//        }
        return numPedido;
    }

    public static void pedidoEliminado(boolean eliminado) {
        if (eliminado) {
            System.out.println("se ha eliminado el pedido exitosamente");
        } else {
            System.err.println("Ha ocurrido un error al eliminar el pedido");
        }
    }

    // Sub menu para mostrar pedidos por enviar
    public static void printMostrarPedidosPendientes(List lista) {
        System.out.println("Mostrando pedidos pendientes de envio");
        System.out.println("-------------------------------------");
        for (Object o : lista) {
            System.out.println(o);
            System.out.println("---------------------");
        }
    }

    // Sub menu para mostrar los pedidos enviados
    public static void printMostrarPedidosEnviados(List lista) {
        System.out.println("Mostrando pedidos enviados");
        System.out.println("-------------------------------------");
        for (Object o : lista) {
            System.out.println(o);
            System.out.println("---------------------");
        }
    }

    // Metodo para recibir el input del usuario para el menu
    public static int getInput(int max){
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while(choice < 0 || choice > max){
            try {
                System.out.print("\nIntroduzca la opcion: \n");
                // recibir input en forma de String y parse a int
                choice = Integer.parseInt(scanner.nextLine());
            }
            catch(NumberFormatException e){
                System.err.println("Introduzca un numero valido\n");
            }
        }
        return choice;
    }

    // metodo para recibir un input en forma de string
    public static String getString() {
        Scanner scanner = new Scanner(System.in);
        // try catch error
        String string = scanner.nextLine();
        return string;
    }

    // metodo para recibir un input en forma de int
    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        try {
            numero = Integer.parseInt(scanner.nextLine());
        } catch (Exception e){
            System.err.println(e);
        }
        return numero;
    }

    // metodo para recibir un double
    public static double getDouble() {
        Scanner scanner = new Scanner(System.in);
        double numero = 0;
        try {
        numero = Double.parseDouble(scanner.nextLine());
        } catch (Exception e){
            System.err.println(e);
    }
        return numero;
    }
}
