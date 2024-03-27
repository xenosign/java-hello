package access.a;

// 파일명과 동일한 퍼블릭 클래스 1개 존재
public class PublicClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 defaultClass1 = new DefaultClass1();
        DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}

// default 는 여러개 존재 가능
class DefaultClass1 {
};

class DefaultClass2 {
};

