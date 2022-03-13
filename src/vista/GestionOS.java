package vista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class GestionOS {


    // Vista menu
    public static int printMenu() {
        System.out.println("\nSeleccione el metodo: ");
        System.out.println("---------------------");
        System.out.println("1. Gestion de articulos");
        System.out.println("2. Gestion de clientes");
        System.out.println("3. Gestion de pedidos");
        System.out.println("Para salir pulse 0");
        return getInput(3);
    }

    // Sub menu para la gestion de los articulos
    public static int printGestionArticulos() {
        System.out.println("\nSeleccione el metodo: ");
        System.out.println("---------------------");
        System.out.println("0. Volver al menu principal");
        System.out.println("1. Agregar articulo");
        System.out.println("2. Mostrar articulos");
        return getInput(2);
    }

    public static List printAgregarArticulo() {
        String codigo, descripcion;
        double pvp, envio;
        int tiempo;
        List<Object> parametros = new ArrayList<Object>();
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
        return parametros;
    }
    public static void articuloCreado(Boolean creado) {
        if (creado) {
            System.out.println("Se ha creado el articulo");
        } else {
           System.out.println("Ha habido un error al crear el articulo");
        }
    }

    public static void printMostrarArticulos(ArrayList array) {
        // todo
        System.out.println("Lista de clientes");
        System.out.println("---------------------");

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
            System.out.println("---------------------");
        }
    }

    // Sub menu para la gestion de los clientes
    public static int printGesionClientes() {
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
    public static void printAgregarCliente() {
        // todo
    }

    // Sub menu para mostrar los clientes existente
    public static void printMostrarClientes() {
        // todo
    }

    // Sub menu para mostrar los clientes estandard
    public static void printMostrarClientesEstandard() {
        // todo
    }

    // Sub menu para mostrar los clientes premium
    public static void printMostrarClientesPremium() {
        // todo
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
    public static void printAgregarPedido() {
        // todo
    }

    // Sub menu para eliminar un pedido
    public static void printEliminarPedido() {
        // todo
    }

    // Sub menu para mostrar pedidos por enviar
    public static void printMostrarPedidosPendientes() {
        //todo
    }

    // Sub menu para mostrar los pedidos enviados
    public static void printMostrarPedidosEnviados() {
        //todo
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
                // todo error personalizado en la clase de errores
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
