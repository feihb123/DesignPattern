package cn.datacharm.bridge.shape;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.Iterator;
import java.util.List;

/**
 * Created by hjx
 */
public class XmlParser {

    private static Document getDocument() throws Exception{
        String filename = XmlParser.class.getResource("/bridgeconfig.xml").getPath();
        File xmlFile = new File(filename);
        SAXReader reader = new SAXReader();
        Document xmlDoc = reader.read(xmlFile);
        return xmlDoc;
    }

    public static BridgeConfig xmlParser() throws Exception{

        BridgeConfig bc = new BridgeConfig();

        Document xmlDoc = getDocument();
        List shapes = xmlDoc.selectNodes("/bridge/shapes/shape");
        Iterator it=shapes.iterator();
        while(it!=null && it.hasNext()){
            Element elem = (Element)it.next();
            String name = elem.attributeValue("name");
            String className = elem.attributeValue("class");
            bc.shapes.put(name,className);
        }

        List brushes = xmlDoc.selectNodes("/bridge/brushes/brush");
        Iterator it2=brushes.iterator();
        while(it2!=null && it2.hasNext()){
            Element elem = (Element)it2.next();
            String name = elem.attributeValue("name");
            String className = elem.attributeValue("class");
            bc.brushes.put(name,className);
        }

        return bc;
    }
}
