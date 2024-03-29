package lr10.example1;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.util.List;
import java.util.stream.Collectors;

public class BookFinder {
    public static void FindBook(List<Element> nodeList){
        List<Element> books = nodeList.stream()
                .filter(node -> node.getNodeType() == Node.ELEMENT_NODE)
                .map(node -> (Element) node)
                .filter(element -> {
                    String author = element.getElementsByTagName("author").item(0).getTextContent();
                    String year = element.getElementsByTagName("year").item(0).getTextContent();
                    return author.equalsIgnoreCase("Лев Толстой") && year.equals("1869");
                })
                .collect(Collectors.toList());

    }
}
