package oop1;

public class ValueMain1 {
    public static void main(String[] args) {
        ValueObj valueObj = new ValueObj();
        valueObj.add();
        valueObj.add();
        valueObj.add();

        System.out.println("최종 value 는 " + valueObj.value);
    }

    // 메서드는 기본적으로 객체를 생성해야 호출 할 수 있다. 그런데 static 이 붙으면 객체 생성을 하지 않고도 메서드 호출이 가능
    // 곧, 접근 제어자에서 배운다
}
