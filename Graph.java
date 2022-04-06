import java.util.ArrayList;
import java.util.List;

public class Graph<DataType> {
    private List<Node<DataType>> nodes;

    public Graph() {
        nodes = new ArrayList<>();
    }

    public String toString() {
        String result = "";
        for (var node : nodes) {
            result += node.toString() + "\n";
        }
        return result;
    }
}
