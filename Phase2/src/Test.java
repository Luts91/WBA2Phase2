import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import minirestwebservice.*;
import generated.*;
import generated.Benutzerliste.Benutzer;

public class Test {

  private static final String BENUTZERLISTE_XML = "C:/Users/Lutz/git/WBA2Phase2/Phase2/src/benutzer.xml";

  public static void main(String[] args) throws JAXBException, IOException {
    // create JAXB context and instantiate marshaller
    JAXBContext context = JAXBContext.newInstance(Benutzerliste.class);
    Marshaller m = context.createMarshaller();
    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
    
    // get variables from our xml file, created before
    System.out.println();
    System.out.println("Output from our XML File: ");
    Unmarshaller um = context.createUnmarshaller();
    Benutzerliste benutzerliste = (Benutzerliste) um.unmarshal(new FileReader(BENUTZERLISTE_XML));
    List<Benutzer> list = benutzerliste.getBenutzer();
    
    
    Benutzer test = new Benutzer();
    test.setName("HOMO");
    test.setBild("img.png");
    test.setEmail("homo@ho.mo");
    test.setPasswort("1234");
    
    Benutzer.Wohnort wo = new Benutzer.Wohnort();
    wo.setHausNr("1");
    wo.setPLZ("1234");
    wo.setStadt("teststadt");
    wo.setStrasse("homoallee");
    test.setWohnort(wo);
    
    Benutzer.Wunschliste wu = new Benutzer.Wunschliste();
    wu.getWunsch().add("Dildo");
    test.setWunschliste(wu);
    
    benutzerliste.getBenutzer().add(test);

    // Write to File
    m.marshal(benutzerliste, new File(BENUTZERLISTE_XML));
    
    for (Benutzer b : list) {
      System.out.println("Name: " + b.getName());
      System.out.println("Email: "+b.getEmail());
      System.out.println("Wohnort: "+b.getWohnort().getPLZ()+" "+b.getWohnort().getStadt()+", "+b.getWohnort().getStrasse()+" "+b.getWohnort().getHausNr());
      
      System.out.println("Wunschliste: ");
      for (String wunsch : b.getWunschliste().getWunsch()){
    	  System.out.println(wunsch);
      }
      System.out.println();
    }
  }
} 