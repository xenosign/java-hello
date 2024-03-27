package access.ex;

public class ShoppingCart {
    private int max = 3;
    private Item[] cart = new Item[max];
    private int itemCount;
    private int totalPrice;

    public void addItem(Item item) {
        if (isFull()) {
            System.out.println("장바구니가 가득 찼습니다");
            return;
        }

        cart[itemCount++] = item;
    }

    public void displayItems() {
        for (int i = 0; i < itemCount; i++) {
            Item item = cart[i];
            System.out.println("상품명 : " + item.getName() + " / 금액 합계 : " + item.getTotalPrice());
            totalPrice += item.getTotalPrice();
        }

        System.out.println("전체 가격의 합 : " + totalPrice);
    }

    private boolean isFull() {
        return itemCount >= max;
    }
}
