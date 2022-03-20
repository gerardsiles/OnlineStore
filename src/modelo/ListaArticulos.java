package modelo;

import java.util.ArrayList;
import java.util.List;

public class ListaArticulos extends Lista<Articulo>{
    private static ArrayList<Articulo> articulos = new ArrayList<>();


    // metodo para agregar un articulo
    public static void addArticulo(Articulo articulo) {
        articulos.add(articulo);
    }

    // metodo que devuelve una lista con todos los articulos
    public static List getArticulos() {
        return articulos;
    }

    // lambda para recibir un articulo especifico
    public static Articulo getArticulo(String codigo) {
        return articulos.stream().filter(articulo -> codigo.equals(articulo.getCodigoProducto())).findFirst().orElse(null);
    }

    // metodo para comprobar si un articulo existe
    public static boolean articuloExiste(String codArticulo) {
        Articulo articulo = getArticulo(codArticulo);
        return getArticulos().contains(articulo);
    }

    public static void cargarDatosArticulos() {
        // PRECARGAR DATOS DE ARTICULOS
        Articulo articulo1 = new Articulo("AS235D", "descripcion1", 34.5, 4.24, 67);
        addArticulo(articulo1);
        Articulo articulo2 = new Articulo("AS235E", "descripcion2", 3412.45, 7.24, 12);
        addArticulo(articulo2);
        Articulo articulo3 = new Articulo("AS235F", "descripcion3", 67.34, 2.35, 5);
        addArticulo(articulo3);
        Articulo articulo4 = new Articulo("AS235G", "descripcion4", 98.34, 5.26, 34);
        addArticulo(articulo4);
        Articulo articulo5 = new Articulo("AS235H", "descripcion5", 2.45, 1.9, 23);
        addArticulo(articulo5);
        Articulo articulo6 = new Articulo("AS235I", "descripcion6", 98.5, 3.4, 12);
        addArticulo(articulo6);
        Articulo articulo7 = new Articulo("AS235J", "descripcion7", 2.3, 2.90, 98);
        addArticulo(articulo7);
        Articulo articulo8 = new Articulo("AS235K", "descripcion8", 3.89, 4.5, 22);
        addArticulo(articulo8);
        Articulo articulo9 = new Articulo("AS235L", "descripcion9", 25.63, 1.97, 14);
        addArticulo(articulo9);
    }

}
