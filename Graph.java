import java.util.ArrayList;
import java.util.List;

public class Graph<DataType> {
    private List<Node<DataType>> nodes;

    public Graph() {
        nodes = new ArrayList<>();
    }

    private Node<DataType> getNode(DataType data) {
        return nodes.stream().filter(n -> n.getData().equals(data)).findFirst().orElse(null);
    } 

    public void add(DataType data) {
        nodes.add(new Node<DataType>(data));
    }

    public String toString() {
        String result = "";
        for (var node : nodes) {
            result += node.toString() + "\n";
        }
        return result;
    }
}
