package modelo;

import java.time.LocalDate;
import java.util.ArrayList;

import static java.lang.Math.floor;


public class Pedido {
    private int numeroDePedido;
    private Articulo articulo;
    private Cliente cliente;
    private int cantidad;
    private LocalDate fecha;
    private boolean procesado;

    public Pedido(int numeroDePedido, Articulo articulo, Cliente cliente,
                  int cantidad, LocalDate fecha, boolean procesado) {
        this.articulo = articulo;
        this.cliente = cliente;
        this.numeroDePedido = numeroDePedido;
        this.articulo = articulo;
        this.cliente = cliente;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.procesado = procesado;
    }

    // GETTERS Y SETTERS
    public int getNumeroDePedido() {
        return numeroDePedido;
    }

    public void setNumeroDePedido(int numeroDePedido) {
        this.numeroDePedido = numeroDePedido;
    }

    public Articulo getArticulos() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public boolean getProcesado() {return this.procesado;}

    public void setProcesado(boolean procesado) {
        this.procesado = procesado;
    }
    // FIN GETTERS Y SETTERS

    // Metodos de clase

    // recibir el untimo numero de pedido
    public static int recibirNumeroPedido() {
        int numeroUltimoPedido = 0;
        ArrayList<Pedido> pedido = ArrayDatos.getPedidos();
        // Accede a los pedidos, en la ultima posicion, y recibe el numero de esa reserva
        numeroUltimoPedido = (pedido.get(pedido.size() - 1).getNumeroDePedido()) + 1;
        return numeroUltimoPedido;
    }
    // Comprobar si el pedido esta procesado
    // pedido procesado y pedido enviado no es lo mismo?
    public boolean isProcesado() {
        return procesado;
    }


    public String pedidoEnviado() {
        if(this.procesado){
            return "si";
        } else {
            return "no";
        }
    }


    public double calcularPrecio() {
        double total;
        total = this.articulo.getPvp() * this.cantidad +precioEnvio();
        // si el cliente es premium, descontar el 20%
        if (this.getCliente() instanceof ClientePremium) {
            total -= total * 0.2;
        }
        // acotar el total a 2 decimales
        floor(total);
        return total;

    }

    public double precioEnvio() {
        return this.articulo.getGastosDeEnvio() * this.cantidad;
    }



    @Override
    public String toString() {

        // El método toString debe construir una cadena con los datos siguientes:
        // número de pedido, fecha y hora del pedido, Nif y nombre del cliente,
        // código y descripción del artículo, cantidad, precio artículo, coste envío,
        // precio total y si ya se ha enviado.
        return "El numero del pedido es: " + this.numeroDePedido + "\n" +
                "Fecha del pedido: " + this.fecha + "\n" +
                "Cliente: " + this.cliente.getNIF() + ", " + this.cliente.getNombre() + "\n" +
                "Codigo del articulo: " + this.articulo.getCodigoProducto() + "\n" +
                "Cantidad: " + this.cantidad + "\n" +
                "Precio del articulo: " + articulo.getPvp() + "\n" +
                "Costes de envio: " + articulo.getGastosDeEnvio() + "\n" +
                "Coste total de envio: " + precioEnvio() + "\n" +
                "Precio total: " + calcularPrecio() + "\n" +
                "Procesado: " + pedidoEnviado() + "\n"
                ;
    }
}
