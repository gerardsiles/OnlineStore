package controlador;

import vista.GestionOS;
import modelo.Articulo;
import modelo.ClienteEstandard;
import modelo.ClientePremium;
import modelo.Pedido;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class OnlineStore {
    static boolean exit = false;
    private Controlador controlador;
    private ArrayList<Articulo> articulo;
    private ArrayList<Pedido> pedido;
    private ArrayList<ClienteEstandard> clienteEstandard;
    private ArrayList<ClientePremium> clientePremium;

    // Crear las arraylist en datos?

    public static void main(String[] args) throws Exception {
        //arrancar el menu
        runMenu();

    }

    public static void runMenu() throws Exception {
        // iniciar el programa y cargar el menu
        while(!exit){
            Controlador.mostrarMenuPrincipal();
        }
    }

    // Metodo para salir de la aplicacion
    public static void setExitTrue() {
        exit = true;
    }


}
