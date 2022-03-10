package controlador;

import vista.GestionOS;

public class OnlineStore {
    static boolean exit = false;
    private Controlador controlador;

    public static void main(String[] args) throws Exception {
        //arrancar el menu
        runMenu();

    }

    // Metodo para cargar el menu
    public static void runMenu() throws Exception {
        while(!exit){
            Controlador.mostrarMenuPrincipal();
        }
    }

    // Metodo para salir de la aplicacion
    public static void setExitTrue() {
        exit = true;
    }


}
