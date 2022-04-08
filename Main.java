public class Main {
    public static void main(String[] args) {
        Graph<String> g1 = new Graph<>();

        g1.add("A");
        g1.add("B");
        g1.add("C");

        g1.connect("A", "C");

        System.out.println(g1);
        
        Graph<Integer> g2 = new Graph<>();
        
        g2.add(42);
        g2.add(23);
        g2.add(57);
        g2.add(38);
        
        g2.connect(42, 23);
        g2.connect(42, 57);
        g2.connect(57, 38);
        g2.connect(23, 38);

        System.out.println(g2);
    }
}