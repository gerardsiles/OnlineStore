package modelo;

import java.time.LocalDate;
import java.util.ArrayList;

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

    public int getNumeroDePedido() {
        return numeroDePedido;
    }

    public void setNumeroDePedido(int numeroDePedido) {
        this.numeroDePedido = numeroDePedido;
    }

    public Articulo getArticulo() {
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

    public boolean isProcesado() {
        return procesado;
    }

    public void setProcesado(boolean procesado) {
        this.procesado = procesado;
    }

    public boolean pedidoEnviado(Pedido pedido) {
        //todo
        return false;
    }

    public boolean pedidoProcesado(Pedido pedido) {
        // TODO
        return true;
    }

    public void cancelarPedido(Pedido pedido) {
        //todo
    }

    public double calcularPrecio(Pedido pedido) {
        //todo
        return 0.0;
    }

    public double precioEnvio() {
        // todo
        return 0.0;
    }

    @Override
    public String toString() {
        // todo
        // El método toString debe construir una cadena con los datos siguientes:
        // número de pedido, fecha y hora del pedido, Nif y nombre del cliente,
        // código y descripción del artículo, cantidad, precio artículo, coste envío,
        // precio total y si ya se ha enviado.
        return "";
    }
}
