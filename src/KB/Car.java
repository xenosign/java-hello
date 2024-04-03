package KB;

public class Car {
    private int gas;

    void setGas(int gas) {
        this.gas = gas;
    }

    public boolean isLeftGas() {
        return gas > 0;
    }

    void run() {
        if (isLeftGas()) {
            System.out.println("gas 가 있습니다.");
            System.out.println("출발 합니다.");

            while (isLeftGas()) {
                System.out.println("달립니다. (gas 잔량 : " + gas-- + ")");
            }

            System.out.println("멈춥니다. (gas 잔량 : " + gas + ")");
        } else {
            System.out.println("Gas 를 주입하세요.");
        }
    }
}
