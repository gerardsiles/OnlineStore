package modelo;

import controlador.OnlineStore;

public class ClienteEstandard extends Cliente {

    public ClienteEstandard(String nombre, String domicilio, String NIF, String email) {
        super(nombre, domicilio, NIF, email);
    }


    public boolean tipoDeCliente(String email) {
        boolean encontrado = false;
        // retornar objeto return OnlineStore.getClientes().stream().filter(cliente -> email.equals(cliente.getEmail())).findFirst().orElse(null);
        for (ClienteEstandard ce : ArrayDatos.getClientesEstandard()) {
            if (ce.getEmail().equals(email)) {
                encontrado = true;
            }
        }
        return encontrado;
    }


    public double cuotaAnual() {
        return 0;
    }


    public double descuentoGastosDeEnvio(double totalPedido) {
        return 0;
    }

    @Override
    public String toString(){
        return "Datos del cliente: \n" +
                "Tipo de cliente: Estandard" + "\n" +
                "Nombre: " + this.getNombre() + "\n" +
                "Domicilio: " + this.getDomicilio() + "\n" +
                "NIF: " + this.getNIF() + "\n" +
                "Email: " + this.getEmail() + "\n"
                ;
    }
}
