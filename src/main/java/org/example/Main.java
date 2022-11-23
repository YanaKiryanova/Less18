package org.example;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;



public class Main {
    public static void main(String[] args) throws JAXBException, FileNotFoundException {
      Name name = new Name("Harry","Potter","9.3/4");
      marshal(name);
      unmarshal();
    }
    public static void marshal(Name name) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Name.class);
        Marshaller mar = context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(name, new File("src\\main\\resources\\name.xml"));
    }
    public static void unmarshal()throws FileNotFoundException, JAXBException{
        JAXBContext context = JAXBContext.newInstance(Name.class);
        Name name = (Name) context.createUnmarshaller().unmarshal(new FileReader("src\\main\\resources\\name.xml"));
        System.out.println(name);

       try(FileReader fr = new FileReader("src\\main\\resources\\name.xml");
            FileWriter fw = new FileWriter("src\\main\\resources\\Potter.txt");
            BufferedReader reader = new BufferedReader(fr)) {

            String line;
            while ((line = reader.readLine()) != null){
                fw.write("\r\n" + line + "\r\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
