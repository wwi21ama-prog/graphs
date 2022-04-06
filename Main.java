public class Main {
    public static void main(String[] args) {
        Graph<String> g1 = new Graph<>();

        g1.add("A");
        g1.add("B");
        g1.add("C");

        g1.connect("A", "C");

        System.out.println(g1);
    }
}