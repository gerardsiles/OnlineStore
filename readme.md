## Programacion orientada a objetos con acceso a bases de datos
<br>

### Producto 1
<br>
En el producto 1 hemos realizado el diagrama uml con el patron
de diseno MVC.
<br>

[link al uml](https://drive.google.com/file/d/1I1cvdOLk6Yn9HK_WoC_wMYl8NhQNS6OM/view?usp=sharing)

A parte, hemos implementado el esqueleto de la aplicacion con todas las clases en cada parte del modelo.

### Producto 2
Apartados implementados en el producto 2:
* Implementar el modelo estático de clases en lenguaje Java.
<br>
las clases estan declaradas como estaticas, de esta manera no hace falta instanciarlas para poder acceder a sus metodos.
<br>
* En la implementación deberán utilizarse como mínimo las Clases Genéricas o Java Generics.
<br>
La clase cliente es una clase generica, implementando sus metodos en las especificaciones de cliente estandard y
la de cliente permium.
<br>
* Elegir el Tipo de Colecciones en Java óptimo para cada caso en función de la necesidad o requisito a implementar.
<br>
Cada clase solamente importara los paquetes y clases con las que interactue.
<br>
* Se debe tener en cuenta la correcta gestión de Excepciones, así como implementar Excepciones personalizadas.
* Realizar un programa en Java en modo de consola que almacene la información en estructuras dinámicas de datos.
* Realizar pruebas unitarias utilizando el entorno JUnit. Elegir dos métodos que apliquen lógica de negocio y realizar las pruebas unitarias con JUnit para evaluar su correcto funcionamiento.

#### **Implementacion del menu**
Gestión Artículos:
* Añadir Articulo.<br>
* Mostrar Artículos.<br>

Gestión de Clientes:
* Añadir Clientes
* Mostrar Clientes
* Mostrar Clientes Estándar
* Mostrar Clientes Premium

Gestión de Pedidos<br>
* Añadir Pedido. En caso de que al pedir los datos del pedido el cliente no existe, es decir, se trata de un nuevo cliente, se deben pedir los datos del nuevo cliente y se añadirá a la lista de clientes. El articulo en el momento de añadir un pedido debe existir.
* Eliminar Pedido. Un pedido puede ser borrado únicamente si no ha sido enviado, es decir, si el tiempo transcurrido a desde la fecha y hora del pedido no supera el tiempo de preparación para el envío del artículo.
* Mostar pedidos pendientes de envío con la opción de filtrar por cliente.
* Mostrar pedidos enviados con la opción de filtrar por cliente.

Implementacion del MVC:
* **grupofp.vista**: la vista contendrá todas las clases relacionadas con el manejo del menú de opciones, así como la entrada y visualización de los datos. Este paquete contendrá las clases OnlineStore y GestionOS.
* **grupofp.controlador**: el paquete controlador únicamente contendrá la clase Controlador, que hará de puente entre la vista y el modelo. La vista sólo podrá utilizar esta clase para acceder a la información del modelo.
* **grupofp.modelo*: el modelo contendrá todas las clases que modelan los datos que deben gestionarse dentro de la aplicación. Dentro del modelo, merece especial mención la clase Datos, que contendrá todos los datos de la aplicación y llevará a cabo todas las acciones que afectan a las mismas. Este paquete contendrá las clases Datos, Cliente, ListaClientes así como el resto de clases necesarias en la capa Modelo.

### Clases del proyecto

**Clase Artículo**

La clase Artículo almacena toda la información relevante de los artículos.
Se debe añadir un constructor que permita inicializar los valores, los getters y setters y el toString.

**Clase Cliente y Clases Heredadas**

La clase Cliente guardará la información de los clientes. Esta información incluye el correo electrónico, nombre y dirección de cada cliente. Debe declararse la clase Cliente como clase abstracta, incorporando un constructor que inicialice sus atributos, así como los getters y setters necesarios. Además, será necesario declarar los métodos abstractos, que devuelven el tipo de cliente y los que calculan la cuota anual de cada cliente dependiendo del tipo de cliente, así como el descuento de gastos de envío:

```java
public abstract String tipoCliente();

public abstract float calcAnual();

public abstract float descuentoEnv();
```




Las clases hijas, ClienteEstandard y ClientePremium, implementarán los métodos abstractos indicados.

Además, también se necesita definir un método toString con los datos de todos los atributos.

<br>

**Clase Pedido**

La clase Pedido almacena toda la información relacionada con cada pedido.

El articulo y el cliente del pedido no deben ser de tipo String, sino que deben ser de tipo Articulo y Cliente respectivamente.

Se debe añadir un constructor que permita inicializar los valores, los getters y setters y el toString.

También debe contener los métodos siguientes:


```java
public boolean pedidoEnviado();

public float precioEnvio();
```

El método toString debe construir una cadena con los datos siguientes: número de pedido, fecha y hora del pedido, Nif y nombre del cliente, código y descripción del artículo, cantidad, precio artículo, coste envío, precio total y si ya se ha enviado.

<br>

**Clase Lista**

La aplicación que debemos implementar debe gestionar colecciones de tres tipos de objetos: Artículo, Cliente y Pedido. Dado que las operaciones que necesitamos realizar son muy similares para las tres colecciones, deberemos implementar la mayoría de estas operaciones en una clase genérica, y a partir de ella derivar clases para las tres listas que se necesitan.

Las clases genéricas en Java constituyen una herramienta muy útil para reutilizar software. En concreto, son clases similares a las clases convencionales pero que reciben tipos como parámetro a la hora de instanciarse. El esqueleto de la clase genérica que se debe desarrollar en este producto se muestra en el Anexo II y se declara de la siguiente forma:

```java
public class Lista<T> {

protected ArrayList<T> lista;

…

}
```


En la declaración anterior, T constituye un parámetro que incide en el tipo de elemento que se gestiona en el atributo lista, de tipo ArrayList.

A partir de la clase Lista, se definirán las clases derivadas: ListaArticulos, ListaClientes y ListaPedidos, según el tipo de objeto a gestionar. Por ejemplo, la definición de ListaArticulos se realizará de la siguiente forma:

```java
public class ListaArticulos extends Lista<Articulo>{….}
```

<br>

**Clase Controlador**

La clase Controlador será utilizada para intervenir entre la vista y los datos del modelo. Con este objetivo, la clase Controlador utilizará una instancia de la clase Datos, por ser la clase principal de la capa modelo.