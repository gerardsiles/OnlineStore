package modelo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListaArticulos extends Lista<Articulo>{
    //todo

    public ArrayList<Articulo> getArticulos(ArrayDatos datos) {
        ArrayList<Articulo> art = new ArrayList<>();
        art = datos.getArticulos();
        return art;

    }
}
