package modelo;
import controlador.Controlador;
import controlador.OnlineStore;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class Datos {
    // GESTION ARTICULOS
    private static ArrayDatos baseDeDatos = new ArrayDatos();

    public static void cargarDatos() {
        ArrayDatos.cargarDatos();
    }
    public static boolean crearArticulo(List<Object> parametros) {

        // crear un nuevo objeto de tipo Articulo
        Articulo articulo = new Articulo(parametros.get(0).toString(),parametros.get(1).toString(),
                (Double)parametros.get(2), (Double)parametros.get(3), (Integer)parametros.get(4));

        // agregarlo a la arraylist en main
        ArrayDatos.addArticulo(articulo);
        // enviar al controlador si el articulo se ha creado o no
        return ArrayDatos.articuloExiste(articulo);
    }

    public static List listarArticulos() {
        //todo
        List lista = ListaArticulos.getArticulos();
        return lista;
    }
    // FIN GESTION ARTICULOS

    // GESTION CLIENTES
    public static boolean clienteExiste(String email) {
        boolean existe = false;
        for (ClienteEstandard cl : ArrayDatos.getClientesEstandard()) {
            if (cl.getEmail().equals(email)){
                existe = true;
            }
        }
        for (ClientePremium cp : ArrayDatos.getClientesPremium()) {
            if (cp.getEmail().equals(email)){
                existe = true;
            }
        }
        return existe;
    }
    public static void crearCliente(List<Object> parametros) {
        //todo
        if (parametros.get(0).equals(1)) {
            // crear cliente estandard
            ClienteEstandard ce = new ClienteEstandard(parametros.get(1).toString(),parametros.get(2).toString(),
                    parametros.get(3).toString(),parametros.get(4).toString());
            ArrayDatos.addClienteEstandard(ce);
        } else if (parametros.get(0).equals(2)) {
            // crear cliente premium
            ClientePremium cp = new ClientePremium(parametros.get(1).toString(),parametros.get(2).toString(),
                    parametros.get(3).toString(),parametros.get(4).toString());
            ArrayDatos.addClientePremium(cp);
        }
        // Comprobar que el cliente se ha creado correctamente
        // enviar ok al controlador
    }

    public void recibirDatosClientes() {
        //todo
        // crear metodo en lista
        // override en listaClientes
        // llamar al metodo
        // enviarlo al controlador
    }

    public void recibirDatosClientesEstandard() {
        //todo
        // override en listaClientes
        // llamar al metodo
        // enviarlo al controlador
    }

    public void recibirDatosClientesPremium() {
        //todo
        // override en listaClientes
        // llamar al metodo
        // enviarlo al controlador
    }

    // FIN GESTION CLIENTES

    // GESTION PEDIDOS
    public static void crearDatosPedido() {
        //todo
        // conseguir el articulo
        // conseguir el cliente
        // crear nuevo pedido
        // agregar datos al pedido
        // agregar pedido a la arraylist
        // enviar informacion al controlador
    }

    public static void eliminarPedido() {
        //todo
        // recibir numero de pedido
        // buscar pedido en la arraylist
        // informar si encontrado o no
        // si encontrado enviar informacion pedido
        // confirmar eliminar
        // eliminar o cancelar

    }

    public static void recibirDatosPedidosPendientes() {
        //todo
        // recibir todos los pedidos WHERE enviado == FALSE
        // meterlos en una nueva arraylist
        // enviar arraylist a controlador
    }

    public static void recibirDatosPedidosEnviados() {
        //todo
        // recibir todos los pedidos WHERE enviado == TRUE
        // meterlos en ujna nueva arraylist
        // enviar arraylist al controlador
    }
    // FIN GESTION PEDIDOS
}

