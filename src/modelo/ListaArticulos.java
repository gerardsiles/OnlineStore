package modelo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ListaArticulos extends Lista<Articulo>{
    //todo

    public static List getArticulos() {
        List art;
        art = ArrayDatos.getArticulos();
        return art;
    }
}
