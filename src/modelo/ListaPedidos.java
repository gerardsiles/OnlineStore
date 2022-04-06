package modelo;

// importar la conexion a la base de datos
import modelo.ConexionMysql;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ListaPedidos extends Lista<Pedido> {
    private static ArrayList<Pedido> pedidos = new ArrayList<>();

    public static Pedido getPedido(int numeroPedido) {
        return pedidos.stream().filter(pedido -> numeroPedido == pedido.getNumeroDePedido()).findFirst().orElse(null);
    }

    public static void addPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public static ArrayList<Pedido> getPedidos() { return pedidos;}

    // metodo para comprobar si un pedido en concreto existe en los datos
    public static boolean pedidoExiste(Pedido pedido) { return getPedidos().contains(pedido);}

    public static boolean eliminarPedido(int numPedido) {
        boolean eliminado = false;
        eliminado = pedidos.removeIf(pedido -> numPedido == pedido.getNumeroDePedido());
        return eliminado;
    }


    public static List getPedidosPendientes() {
        return getPedidos().stream().filter(pedido -> pedido.getProcesado() == false).toList();
    }

    public static List getPedidosEnviados() {
        return getPedidos().stream().filter(pedido -> pedido.getProcesado() == true).toList();
    }

    public static void cargarDatosPedidos() {

        // PEDIDOS
        Cliente cliente = ListaClientes.getCliente("email1@prueba.com");
        Articulo articulo = ListaArticulos.getArticulo("AS235D");
        Pedido pedido1 = new Pedido(1,articulo, cliente, 1, LocalDate.now(), false);
        addPedido(pedido1);
        Pedido pedido2 = new Pedido(2,articulo, cliente, 4, LocalDate.now(), false);
        addPedido(pedido2);
        Pedido pedido3 = new Pedido(3,articulo, cliente, 15, LocalDate.now(), true);
        addPedido(pedido3);
        Pedido pedido4 = new Pedido(4,articulo, cliente, 3, LocalDate.now(), false);
        addPedido(pedido4);
        Pedido pedido5 = new Pedido(5,articulo, cliente, 7, LocalDate.now(), true);
        addPedido(pedido5);
        Pedido pedido6 = new Pedido(6,articulo, cliente, 9, LocalDate.now(), false);
        addPedido(pedido6);
        Pedido pedido7 = new Pedido(7,articulo, cliente, 12, LocalDate.now(), false);
        addPedido(pedido7);
        Pedido pedido8 = new Pedido(8,articulo, cliente, 3, LocalDate.now(), false);
        addPedido(pedido8);
        Pedido pedido9 = new Pedido(9,articulo, cliente, 11, LocalDate.now(), true);
        addPedido(pedido9);
    }
}
