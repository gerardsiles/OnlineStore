package modelo;

public class ClientePremium extends Cliente {
    private final double cuota;
    private final double descuento;

    public ClientePremium(String nombre, String domicilio, String NIF, String email) {
        super(nombre, domicilio, NIF, email);
        this.cuota = 12;
        this.descuento = 20;
    }

    // Get cliente?

    @Override
    public Cliente tipoDeCliente(String email) {
        // TODO
        return null;
    }

    @Override
    public double cuotaAnual() {
        return this.cuota * 12;
    }

    @Override
    public double descuentoGastosDeEnvio(double totalPedido) {
        return totalPedido - (totalPedido * 0.2);
    }

    @Override
    public String toString(){
        return "Datos del cliente: \n" +
                "Tipo de cliente: Premium" + "\n" +
                "Nombre: " + this.getNombre() + "\n" +
                "Domicilio: " + this.getDomicilio() + "\n" +
                "NIF: " + this.getNIF() + "\n" +
                "Email: " + this.getEmail() + "\n" +
                "Cuota: " + this.cuota + "\n" +
                "Descuento en el envio: " + this.descuento
                ;
    }
}
