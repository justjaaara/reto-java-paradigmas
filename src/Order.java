public class Order {
    private final Client client;
    private final orderStatus orderStatus;
    private final int total;
    private static int idCounter = 0;
    private int id = 0;

    public Order(Client client,orderStatus orderStatus, int total){
        this.client = client;
        this.id = ++idCounter;
        this.orderStatus = orderStatus;
        this.total = total;

    }

    public orderStatus getOrderStatus(){
        return orderStatus;
    }

    public Client getClient() {
        return client;
    }

    @Override
    public String toString() {
        return "("+"ID: "+ id + " " + client + " Order status: " + orderStatus + " Total: " + total + ")";
    }

    public int getTotal() {
        return total;
    }

}