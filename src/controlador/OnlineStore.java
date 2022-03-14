package controlador;

import modelo.*;
import vista.GestionOS;

import java.util.ArrayList;

public class OnlineStore {
    static boolean exit = false;

    public static void main(String[] args) throws Exception {
        // Precarga de datos en falsa base de datos
        Controlador.cargarDatos();

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
