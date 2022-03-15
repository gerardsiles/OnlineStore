package modelo;

import java.util.List;

public class ListaPedidos extends Lista<Pedido>{
    //todo

    public static List getPedidosPendientes() {
        return ArrayDatos.getPedidos().stream().filter(pedido -> pedido.getProcesado() == false).toList();
    }
}
