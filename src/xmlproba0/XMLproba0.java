
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

        //Declaracion de XML con versión especifica.
        factory2.writeStartDocument("1.0");
        
        
        
        //writeStartElement--> escribe tag de inicio de un elemento
        //writeAttribute--> escribe un atributo para el elemento actual
        //writeCharacters--> escribe el contendio del elemento
        //writeEndElement--> escribe tag de cierre del elemento actual
        //writeEndDocument--> cierra el documento
        factory2.writeStartElement("autores");
        factory2.writeStartElement("autor");
        factory2.writeAttribute("codigo", "a1");
        factory2.writeStartElement("nome");
        factory2.writeCharacters("Alejandro Dumas");
        factory2.writeEndElement();
        factory2.writeStartElement("titulo");
        factory2.writeCharacters("El conde de Montecristo");
        factory2.writeEndElement();
        factory2.writeStartElement("titulo");
        factory2.writeCharacters("Los miserables");
        factory2.writeEndElement();
        factory2.writeEndElement();
        factory2.writeStartElement("autor");
        factory2.writeAttribute("codigo2", "a2");
        factory2.writeStartElement("nome");
        factory2.writeCharacters("Fiodor Dostoyesvski");
        factory2.writeEndElement();
        factory2.writeStartElement("titulo");
        factory2.writeCharacters("El idiota");
        factory2.writeEndElement();
        factory2.writeStartElement("titulo");
        factory2.writeCharacters("noches blancas");
        factory2.writeEndElement();
        factory2.writeEndElement();
        factory2.writeEndElement();
        factory2.writeEndDocument();
      
        factory2.close();
    }
    
}

