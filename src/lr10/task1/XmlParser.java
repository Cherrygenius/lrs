package lr10.task1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XmlParser {
    public static void main(String[] args) {
        try {
            File inputFile = new File("C:\\Users\\Максим\\IdeaProjects\\lrs\\Songs.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Корневой элемент: " + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("song");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                System.out.println("\nТекущий элемент: " + node.getNodeName());
                if  (node.getNodeType() == node.ELEMENT_NODE){
                    Element element = (Element) node;
                    System.out.println("Жанр: "
                            + element.getElementsByTagName("janre").item(0).getTextContent());
                    System.out.println("Исполнитель: "
                            + element.getElementsByTagName("singer").item(0).getTextContent());
                    System.out.println("Трек: "
                            + element.getElementsByTagName("track").item(0).getTextContent());
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
