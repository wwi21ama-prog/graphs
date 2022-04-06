import java.util.ArrayList;
import java.util.List;

public class Node<DataType> {
    private List<Node<DataType>> neighbours;

    public Node() {
        neighbours = new ArrayList<>();
    }    
}
