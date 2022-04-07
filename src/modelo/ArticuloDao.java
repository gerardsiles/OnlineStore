package modelo;

import java.util.List;

public interface ArticuloDao {

    // metodo para agregar un articulo
    public boolean addArticulo(Articulo articulo);

    // metodo que devuelve una lista con todos los articulos
    public  List getArticulos();

    // lambda para recibir un articulo especifico
    public Articulo getArticuloByID(String codigo);

    // metodo para comprobar si un articulo existe
    public boolean articuloExiste(String codArticulo);
}
