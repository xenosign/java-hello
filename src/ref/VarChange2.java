package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println(dataA + "/" + dataB);
        System.out.println(dataA.value + "/" + dataB.value);

        // dataA 변경
        dataA.value = 20;
        System.out.println(dataA + "/" + dataB);
        System.out.println(dataA.value + "/" + dataB.value); // 둘 다 20

        // dataB 변경
        dataB.value = 30;
        System.out.println(dataA + "/" + dataB);
        System.out.println(dataA.value + "/" + dataB.value); // 둘 다 30

        // 대원칙 : 자바는 항상 변수의 값을 복사해서 대입힌다!!!!!!
        // 결국 생성된 인스턴스는 dataA 하나이고 dataB 는 dataA 의 참조 주소만을 가지므로 결국 둘은 하나의 인스턴스를 바라보고 있는 것
    }
}
