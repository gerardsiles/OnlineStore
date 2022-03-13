package modelo;

import java.util.ArrayList;

public class ArrayDatos {
    // esta clase es temporal, substituye la conexion con la base de datos.
    private ArrayList<Articulo> articulos;
    private ArrayList<Cliente> cliente;
    private ArrayList<Pedido> pedido;

    public ArrayDatos() {
        this.articulos = new ArrayList<>();
        this.cliente = new ArrayList<>();
        this.pedido = new ArrayList<>();
    }


    public void addCliente() {
        // todo, generic method
    }

    public void addArticulo(Articulo articulo) {
        this.articulos.add(articulo);
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void addPedido() {
        // todo
    }

    // PRECARGAR DATOS AL INICIAR APLICACION
    public void cargarDatos() {
        // PRECARGAR DATOS
        Articulo articulo1 = new Articulo("AS235D", "descripcion1", 34.5, 4.24, 67);
        this.addArticulo(articulo1);
        Articulo articulo2 = new Articulo("AS235E", "descripcion2", 3412.45, 7.24, 12);
        this.addArticulo(articulo2);
        Articulo articulo3 = new Articulo("AS235F", "descripcion3", 67.34, 2.35, 5);
        this.addArticulo(articulo3);
        Articulo articulo4 = new Articulo("AS235G", "descripcion4", 98.34, 5.26, 34);
        this.addArticulo(articulo4);
        Articulo articulo5 = new Articulo("AS235H", "descripcion5", 2.45, 1.9, 23);
        this.addArticulo(articulo5);
        Articulo articulo6 = new Articulo("AS235I", "descripcion6", 98.5, 3.4, 12);
        this.addArticulo(articulo6);
        Articulo articulo7 = new Articulo("AS235J", "descripcion7", 2.3, 2.90, 98);
        this.addArticulo(articulo7);
        Articulo articulo8 = new Articulo("AS235K", "descripcion8", 3.89, 4.5, 22);
        this.addArticulo(articulo8);
        Articulo articulo9 = new Articulo("AS235L", "descripcion9", 25.63, 1.97, 14);
        this.addArticulo(articulo9);
    }

}
