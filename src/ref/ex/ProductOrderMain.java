package ref.ex;

import java.util.Scanner;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 2);

        printOrder(orders);

        // Ctrl + Alt + V 누르면 변수 자동 추천!
        int totalAmount = getTotalAmount(orders);
        System.out.println(totalAmount);
    }

    static ProductOrder createOrder(String productName, int price, int qty) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.qty = qty;
        return productOrder;
    }

    static void printOrder(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println(order.productName + " / " + order.price + " / " + order.qty);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int total = 0;
        for (ProductOrder order : orders) {
            total += order.price * order.qty;
        }
        return total;
    }
}
