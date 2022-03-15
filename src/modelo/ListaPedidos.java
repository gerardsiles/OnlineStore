package modelo;

import java.util.List;

public class ListaPedidos extends Lista<Pedido>{


    public static List getPedidosPendientes() {
        return ArrayDatos.getPedidos().stream().filter(pedido -> pedido.getProcesado() == false).toList();
    }

    public static List getPedidosEnviados() {
        return ArrayDatos.getPedidos().stream().filter(pedido -> pedido.getProcesado() == true).toList();
    }
}
