import java.util.ArrayList;
import java.util.List;

public class Graph<DataType> {
    private List<Node<DataType>> nodes;

    public Graph() {
        nodes = new ArrayList<>();
    }
}
