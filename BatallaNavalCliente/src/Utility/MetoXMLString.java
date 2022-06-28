
package Utility;

import java.io.IOException;
import java.io.StringReader;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;


public class MetoXMLString {
    
    // me envian un nodo y lo convierto a string
    public static String xmlToString(Element element) {
        XMLOutputter outputter=new XMLOutputter(Format.getCompactFormat().getCompactFormat());
        String xmlStringElement=outputter.outputString(element);
        xmlStringElement=xmlStringElement.replace("\n", "");
        return xmlStringElement;
    }    
    //covierte   string a un element xml
    public static Element stringToXML(String stringElement) throws JDOMException, IOException{
        SAXBuilder saxBuilder=new SAXBuilder();
        StringReader stringReader=new StringReader(stringElement);
        Document doc=saxBuilder.build(stringReader);// reconstruye el elemnto 
        return doc.getRootElement();
    } // stringToXML    
    
} // fin clase
