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
    public int cuotaAnual() {
        // TODO
        return 0;
    }

    @Override
    public int descuentoGastosDeEnvio() {
        // TODO
        return 0;
    }

    @Override
    public String toString(){
        // TODO
        return "";
    }
}
