package ref.ex;

import java.util.Scanner;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int orderQty = 0;

        System.out.print("입력할 주문의 개수를 입력하세요 : ");
        orderQty = scanner.nextInt();
        scanner.nextLine(); // 정수 입력 후의 \n 이 남아 아래 입력에 방해 되는 것을 처리

        ProductOrder[] orders = new ProductOrder[orderQty];

        String productName;
        int price;
        int qty;

        for (int i = 0; i < orderQty; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요");
            System.out.print("상품명 : ");
            productName = scanner.nextLine();
            System.out.print("가격 : ");
            price = scanner.nextInt();
            System.out.print("수량 : ");
            qty = scanner.nextInt();
            scanner.nextLine();

            orders[i] = createOrder(productName, price, qty);
        }

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
