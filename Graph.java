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

    public void connect(DataType data1, DataType data2) {
        var node1 = getNode(data1);
        var node2 = getNode(data2);

        node1.addNeighbour(node2);
    }

    public String toString() {
        String result = "";
        for (var node : nodes) {
            result += node.toString() + "\n";
        }
        return result;
    }
}
