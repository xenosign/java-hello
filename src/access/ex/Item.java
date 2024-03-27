package access.ex;

public class Item {
    private String name;
    private int price;
    private int qty;

    public Item(String name, int price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public int getTotalPrice() {
        return price * qty;
    }
}
