package static1;

public class Data2 {
    public String name;

    public Data2(String name, Counter couter) {
        this.name = name;
        couter.count++;
    }
}
