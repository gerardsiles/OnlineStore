package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public interface PedidoDAO {

    public Pedido getPedido(int numeroPedido);

    public boolean addPedido(Pedido pedido);

    public List<Pedido> getPedidos();

    public void actualizarPedidos();

    public boolean eliminarPedido(int numPedido);

    public List getPedidosPendientes();

    public List getPedidosEnviados();

}
