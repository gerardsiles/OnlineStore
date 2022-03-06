package controlador;

import vista.*;
import modelo.*;

public class Controlador {
    public static void main(String[] args) {
        //todo
        Cliente modelo = retrieveClienteFromDatabase();
        VistaCliente vista = new VistaCliente();
        ControladorCliente controlador = new ControladorCliente();
        controlador.actualizarVista();
    }

    private static Cliente retrieveClienteFromDatabase() {
        Cliente cliente = new Cliente();
        cliente.setNombre ("prueba");
        cliente.setDomicilio("calle pantomima");
        cliente.setNIF ("asdf1234");
        cliente.setEmail("abc@uoc.edu");
    }
}
