import java.util.ArrayList;
import java.util.List;

/** Klasse für die Speicherung und Verwaltung eines Graphen.
 * 
 * Diese Klasse verwendet intern den Datentyp Node, um die Graphenstruktur zu verwalten.
 * Jeder Node kennt das Datenelement, das er speichert sowie seine Nachbarn.
 * 
 * Die Knoten werden aber nicht extern sichtbar gemacht. Die Methoden hier in Graph
 * erwarten immer ein Datenelement und konstruieren oder suchen dann den
 * entsprechenden Knoten.
 * 
 * Diese Klasse ist generisch, d.h. der genaue Typ des Datenelements bleibt
 * zunächst offen. In den spitzen Klammern hinter dem Klassennamen ist ein Platzhalter
 * für diesen Datentyp, der vom Compiler durch den echten Datentyp ersetzt wird.
 * In der main()-Funktion wird bspw. ein Graph<String> instanziiert, dadurch wird
 * DataType hier zu String.
 */
public class Graph<DataType> {
    private List<Node<DataType>> nodes;

    /** Konstruktor, erzeugt einen neuen Graphen. */
    public Graph() {
        nodes = new ArrayList<>();
    }

    /** liefert einen Konoten mit dem angegebenen Datenelement.
     *  Nur für den internen Gebrauch gedacht.
     */
    private Node<DataType> getNode(DataType data) {
        return nodes.stream().filter(n -> n.getData().equals(data)).findFirst().orElse(null);
    } 

    /** Fügt einen Knoten mit dem angegebenen Datenelement hinzu. */
    public void add(DataType data) {
        nodes.add(new Node<DataType>(data));
    }

    /** Erzeugt eine Kante zwischen den Knoten mit den angegebenen Datenelementen. */
    public void connect(DataType data1, DataType data2) {
        var node1 = getNode(data1);
        var node2 = getNode(data2);

        node1.addNeighbour(node2);
    }

    /** Liefert eine String-Repräsentation des Graphen, an der man Knoten und Kanten 
     *  erkennen kann. 
     */
    public String toString() {
        String result = "";
        for (var node : nodes) {
            result += node.toString() + "\n";
        }
        return result;
    }

    /** Liefert true, falls es im Graphen einen Pfad zwischen den Knoten mit den
     *  angegebenen Datenelementen gibt. */
    public boolean containsPath(DataType from, DataType to) {
        // TODO
        return false;
    }

    /** Liefert true, falls es im Graphen einen Kreis gibt, auf dem er angegebene
     *  Knoten liegt.
     */
    public boolean containsCycle(DataType start) {
        // TODO
        return false;
    }

    /** Liefert den Abstand zwischen den beiden Knoten mit den
     *  angegebenen Datenelementen.
     */
    public int distance(DataType data1, DataType data2) {
        // TODO
        return -1;
    }
}
