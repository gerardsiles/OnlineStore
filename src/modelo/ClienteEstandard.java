package modelo;

public class ClienteEstandard extends Cliente {

    public ClienteEstandard(String nombre, String domicilio, String NIF, String email) {
        super(nombre, domicilio, NIF, email);
    }

    @Override
    public Cliente tipoDeCliente(String email) {
        //todo
        return null;
    }

    @Override
    public double cuotaAnual() {
        return 0;
    }

    @Override
    public int descuentoGastosDeEnvio() {
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
