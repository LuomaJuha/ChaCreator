/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chacreator;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Suolapurkki
 */
public class XmlReader {
   
    Map<String, String> texts = new HashMap<String, String>();
    
    public XmlReader() throws ParserConfigurationException, SAXException, IOException{
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("resources/res.xml");
        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
        
        Document doc = docBuilder.parse(in);
        
        NodeList nList = doc.getElementsByTagName("item");
        
        for(int i = 0; i < nList.getLength(); i++){
            Node node = nList.item(i);
            Element e = (Element)node;
            if(e.hasAttribute("name")){
                texts.put(e.getAttribute("name"), e.getTextContent());
            }
        }
        
    }
    
    public String getItem(String target){
        return texts.get(target);
    }
    
}
