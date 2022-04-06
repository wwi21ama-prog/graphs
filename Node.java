import java.util.ArrayList;
import java.util.List;

public class Node<DataType> {
    private DataType data;
    private List<Node<DataType>> neighbours;

    public Node(DataType data) {
        this.data = data;
        neighbours = new ArrayList<>();
    }    
}
