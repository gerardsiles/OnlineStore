package controlador;

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

    public static class OnlineStore {
        public void imprimirDatosCliente() {
            System.out.println(
                    "Cliente: " + "getnombre" + "\n" +
                            "Tipo de cliente: " + "tipodecliente" + "\n" +
                            "Domicilio: " + "domicilio" + "\n" +
                            "NIF: " + "NIF" + "\n" +
                            "email: " + "email" + "\n"
            );
        }
    }
}
