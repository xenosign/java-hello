package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder product1 = new ProductOrder();
        product1.productName = "두부";
        product1.price = 2000;
        product1.qty = 2;

        ProductOrder product2 = new ProductOrder();
        product2.productName = "김치";
        product2.price = 5000;
        product2.qty = 1;

        ProductOrder product3 = new ProductOrder();
        product3.productName = "콜라";
        product3.price = 1500;
        product3.qty = 2;

        ProductOrder[] productOrders = {product1, product2, product3};

        int totalPrice = 0;

        for (ProductOrder p : productOrders) {
            System.out.println(p.productName + " / " + p.price + " / " + p.qty);
            totalPrice += p.price * p.qty;
        }

        System.out.println(totalPrice);
    }
}
