# Proyecto de Gestión de Pedidos

Este proyecto es una aplicación de consola en Java que gestiona pedidos de clientes. Permite realizar diversas operaciones como obtener pedidos con un monto mayor a 200,000 COP, listar clientes con pedidos pendientes, calcular el total de pedidos entregados, generar una lista de nombres de clientes únicos y ordenar los pedidos por monto de mayor a menor.

## Integrantes

- Felipe Villa Jaramillo
- Juan Pablo Cardona Bedoya
- Luis Pablo Goez

## Estructura del Proyecto

## Clases y Funcionalidades

### `Client.java`

Define la clase `Client` que representa a un cliente con los siguientes atributos:

- `name`: Nombre del cliente.
- `identification`: Identificación del cliente.
- `email`: Correo electrónico del cliente.

### `Order.java`

Define la clase `Order` que representa un pedido con los siguientes atributos:

- `client`: Cliente que realizó el pedido.
- `orderStatus`: Estado del pedido (`PENDIENTE` o `ENTREGADO`).
- `total`: Monto total del pedido.
- `id`: Identificador único del pedido.

### `orderStatus.java`

Define el enum `orderStatus` que representa los posibles estados de un pedido:

- `PENDIENTE`
- `ENTREGADO`

### `Main.java`

Contiene la clase `Main` con el método `main` y varias funciones para realizar operaciones sobre los pedidos:

- `getOrdersGreaterThan200000`: Obtiene los pedidos con un monto mayor a 200,000 COP.
- `getPendingOrders`: Obtiene una lista de pedidos con estado `PENDIENTE`.
- `SumTotal`: Calcula el total de todos los pedidos que han sido `ENTREGADOS`.
- `getUniqueClients`: Genera una lista de nombres de clientes únicos que han hecho pedidos.
- `orderedOrders`: Ordena los pedidos por monto de mayor a menor.

## Ejecución

Para ejecutar el proyecto, compila y ejecuta la clase `Main` en tu entorno de desarrollo Java preferido.

```sh
javac src/*.java
java src/Main
```
