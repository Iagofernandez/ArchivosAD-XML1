
package xmlproba0;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

public class XMLproba0 {
 
    public static void main(String[] args) throws IOException, XMLStreamException {
       
        //Creamos un nuevo fichero, sera de tipo XML
        File fichero = new File("/home/oracle/Desktop/AD/Eje13/xmlproba.xml");
        // metodo de escritura FileWriter
        FileWriter ficheroesc = new FileWriter(fichero);
        
        
        //Como necesitamos escribir en un archivo .xml
        //necesitamos el método newInstance de XMLOutput
        XMLOutputFactory factory = XMLOutputFactory.newInstance();
        //Con esta invocacion ya podemos acceder al metodo XMLStreamWriter
        //invocando al método createXMLStreamWriter (); del objeto OutputStream craedo anteriormente
        XMLStreamWriter factory2 = factory.createXMLStreamWriter (ficheroesc);

       
    }
    
}

