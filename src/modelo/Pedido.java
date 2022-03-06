package modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {
    private int numeroDePedido;
    private ArrayList<Articulo> articulo;
    private ArrayList<Cliente> cliente;
    private int cantidad;
    private LocalDate fecha;
    private boolean procesado;

    public Pedido(int numeroDePedido, ArrayList<Articulo> articulo, ArrayList<Cliente> cliente,
                  int cantidad, LocalDate fecha, boolean procesado) {
        this.articulo = new ArrayList<>();
        this.cliente = new ArrayList<>();
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

    public ArrayList<Articulo> getArticulo() {
        return articulo;
    }

    public void setArticulo(ArrayList<Articulo> articulo) {
        this.articulo = articulo;
    }

    public ArrayList<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(ArrayList<Cliente> cliente) {
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

    @Override
    public String toString() {
        // todo
        return "";
    }
}
