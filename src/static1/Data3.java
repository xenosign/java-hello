package static1;

public class Data3 {
    public static int count;
    public String name;

    public Data3(String name) {
        this.name = name;
        // Data3.count++ -> 생략 가능
        count++;
    }
}
