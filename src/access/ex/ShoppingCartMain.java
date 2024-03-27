package access.ex;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("상추", 100, 1);
        Item item2 = new Item("사과", 200, 2);
        Item item3 = new Item("딸기", 300, 3);
        Item item4 = new Item("배", 400, 4);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        cart.addItem(item4);

        cart.displayItems();
    }
}
