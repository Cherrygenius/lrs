package lr10.example1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;

public class NewBook {
    public static void addNewBook(Document doc){
    try {
        Scanner scanner = new Scanner(System.in);
        Element newBook = doc.createElement("book");
        Element title = doc.createElement("title");
        title.appendChild(doc.createTextNode(scanner.nextLine()));
        newBook.appendChild(title);

        Scanner scanner1 = new Scanner(System.in);
        Element author = doc.createElement("author");
        author.appendChild(doc.createTextNode(scanner1.nextLine()));
        newBook.appendChild(author);

        Scanner scanner2 = new Scanner(System.in);
        Element year = doc.createElement("year");
        year.appendChild(doc.createTextNode(scanner2.nextLine()));
        newBook.appendChild(year);
        NodeList rootList = doc.getElementsByTagName("library");
        Node root = rootList.item(0);
        root.appendChild(newBook);
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File("C:\\Users\\Максим\\IdeaProjects\\lrs\\examlpe.xml"));
        transformer.transform(source, result);
    }catch (Exception e){
        e.printStackTrace();
    }
}
}
