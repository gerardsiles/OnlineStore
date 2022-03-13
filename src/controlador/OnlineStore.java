package controlador;

import modelo.*;
import vista.GestionOS;

import java.util.ArrayList;

public class OnlineStore {
    static boolean exit = false;
    private static ArrayDatos baseDeDatos = new ArrayDatos();
    private ArrayList<Articulo> articulo;
    private ArrayList<Pedido> pedido;
    private ArrayList<ClienteEstandard> clienteEstandard;
    private ArrayList<ClientePremium> clientePremium;

    public static void main(String[] args) throws Exception {
        // Precarga de datos en falsa base de datos
        baseDeDatos.cargarDatos();


        //arrancar el menu
        runMenu();

    }


    public static void runMenu() throws Exception {
        // iniciar el programa y cargar el menu
        while(!exit){
            Controlador.mostrarMenuPrincipal();
        }
    }

    public static ArrayList<Articulo> getArticulos() {
        return baseDeDatos.getArticulos();
    }
    public static void addArticulo(Articulo articulo) {
        baseDeDatos.addArticulo(articulo);
    }
     public static boolean articuloExiste(Articulo articulo) {
        return baseDeDatos.getArticulos().contains(articulo);
     }
    // Metodo para salir de la aplicacion
    public static void setExitTrue() {
        exit = true;
    }


}
