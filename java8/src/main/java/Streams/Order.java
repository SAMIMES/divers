package Streams;

public class Order {

    public enum OrderType {
        BUY, SELL
    };

    int id;
    OrderType type;
    Double price;
    String product;

    public Order(int id, OrderType type, Double price, String product) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public OrderType getType() {
        return type;
    }

    public Double getPrice() {
        return price;
    }

    public String getProduct() {
        return product;
    }
}
