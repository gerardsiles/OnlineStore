package vista;

public class VistaCliente {
    public void imprimirDatosCliente(String nombreCliente, String domicilio, String NIF, String email) {
        System.out.println(
                "Cliente: " + nombreCliente +
                "Domicilio: " + domicilio +
                "NIF: " + NIF +
                "email: " + email
                );
    }
}
