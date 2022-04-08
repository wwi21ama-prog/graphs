import java.util.ArrayList;
import java.util.List;

/** Klasse zur Verwaltung von Knoten im Graphen.
 *  Jeder Knoten kennt seine Daten und seine Nachbarn.
 * 
 *  Auch diese Klasse ist generisch, d.h. der genaue Typ
 *  des Datenelements bleibt zunächst offen.
 */
public class Node<DataType> {
    private DataType data;
    private List<Node<DataType>> neighbours;

    /** Konstruktor, erstellt eien neuen Knoten. */
    public Node(DataType data) {
        this.data = data;
        neighbours = new ArrayList<>();
    }

    /** Liefert das Datenelement dieses Knoten. */
    public DataType getData() {
        return data;
    }

    /** Fügt einen Nachbarn hinzu, d.h. eine Kante im Graphen. */
    public void addNeighbour(Node<DataType> other) {
        neighbours.add(other);
    }

    /** Liefert eine String-Repräsentation des Knotens, bestehend aus
     *  der String-Repäsentation des Datenelements sowie der Kanten. 
     */
    public String toString() {
        String result = data.toString() + "\n";
        for (var n : neighbours) {
            result += data.toString() + " -> " + n.data.toString() + "\n";
        }
        return result;
    }
}
