package modelo;

public class ClientePremium extends Cliente {
    private double cuota;
    private double descuento;

    public ClientePremium(String nombre, String domicilio, String NIF, String email,double cuota, double descuento) {
        super(nombre, domicilio, NIF, email);
        this.cuota = cuota;
        this.descuento = descuento;
    }

    @Override
    public Cliente tipoDeCliente(String email) {
        // TODO
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
