package modelo;

import java.util.ArrayList;
import java.util.Iterator;

// clase generica
public class Lista<T> {
    //todo
    // metodos genericos par imprimir la informacion
    // especificar en las clases tipo de informacion que imprime
    public  ArrayList<T>  retrieveObjetosClase (ArrayList<T> arrayOrigen) {
        // declarar array nueva
        ArrayList<T> array = new ArrayList<T>();
        // iniciar iterador
        Iterator<T> it = arrayOrigen.iterator();
        // Recorrer la array
        while (it.hasNext()) {
            // agregar cada valor a la nueva array
            array.add(it.next());
        }
        // Devolver array
        return array;

    }

}
