import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Client duplicatedCLient = new Client("Juan Guillermo","293248483", "juangui@gmail.com");
        List<Order> Orders = List.of(
                new Order((new Client("Felipe","1020222955", "villajaramillofelipe4@gmail.com")),orderStatus.PENDIENTE,200000),
                new Order((new Client("Juan Pablo","1029392", "jpcardona@gmail.com")), orderStatus.ENTREGADO,150000),
                new Order((new Client("Luis Pablo","5985548458", "luispablo@gmail.com")),orderStatus.ENTREGADO,3501450),
                new Order(duplicatedCLient,orderStatus.PENDIENTE,4000000),
                new Order(duplicatedCLient,orderStatus.ENTREGADO,4000000),
                new Order((new Client("Carl Jhonson (alejo)","2948484", "cj@gmail.com")),orderStatus.PENDIENTE,1450000)
        );

        // Obtener los pedidos cuya cantidad total sea mayor a 200,000 COP.
        List<Order> ordersGreaterThan200000 = getOrdersGreaterThan200000(Orders);
        for (Order order: ordersGreaterThan200000){
            System.out.println(order);
        }
        System.out.println("-------------------------------------------------");
        // Obtener una lista de clientes que tengan pedidos con estado "PENDIENTE".
        List<Order> pendingOrders = getPendingOrders(Orders);
        System.out.println(pendingOrders);
        System.out.println("-------------------------------------------------");

        //Calcular el total de todos los pedidos que han sido ENTREGADOS.
        int sumTotalEntregado = SumTotal(Orders);
        System.out.println("La suma total de los pedidos ENTREGADOS es: " + sumTotalEntregado);
        System.out.println("-------------------------------------------------");


        // Generar una lista de nombres de clientes únicos que han hecho pedidos.
        List<String> uniqueClients = getUniqueClients(Orders);
        System.out.println(uniqueClients);
        System.out.println("-------------------------------------------------");


        //Ordenar los pedidos por monto de mayor  a menor
        orderedOrders(Orders);
    }

    // 1. Obtener los pedidos cuya cantidad total sea mayor a 200,000 COP.
    public static List<Order> getOrdersGreaterThan200000(List<Order> orders){

        List<Order> ordersGreaterThan200000 = new ArrayList<>();
        for (Order order: orders){
            if (order.getTotal() > 200000){
                ordersGreaterThan200000.add(order);
            }
        }

        return ordersGreaterThan200000;
    }

    // 2. Obtener una lista de clientes que tengan pedidos con estado "PENDIENTE".
    public static List<Order> getPendingOrders(List<Order> orders){
        List<Order> pendingOrders = orders.stream().filter(order -> order.getOrderStatus() == orderStatus.PENDIENTE).collect(Collectors.toList());
        return pendingOrders;
    }

    // 3. Calcular el total de todos los pedidos que han sido ENTREGADOS.
    public static int SumTotal(List<Order> Orders) {
        return Orders.stream()
                .filter(order -> orderStatus.ENTREGADO.equals(order.getOrderStatus()))
                .mapToInt(Order::getTotal)
                .sum();
    }

    // 4. Generar una lista de nombres de clientes únicos que han hecho pedidos.
    public static List<String> getUniqueClients(List<Order> orders){
        List<String> uniqueClients = orders.stream().map(order -> order.getClient().getName())
                .distinct()
                .collect(Collectors.toList());
        return  uniqueClients;
    }

    // 5. Ordenar los pedidos por monto de mayor  a menor
    public static void orderedOrders(List<Order> Orders){
        List<Order> ordered = Orders.stream().sorted(Comparator.comparingInt(Order::getTotal).reversed()).collect(Collectors.toList());
        System.out.println(ordered);
    }
}

