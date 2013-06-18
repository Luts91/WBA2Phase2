package minirestwebservice;

import java.io.File;
import java.io.FileNotFoundException;
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
import generated.Objekte.Objekt;

public class XMLMarshaller {

  public static final String BENUTZERLISTE_XML = "C:/Users/Lutz/git/WBA2Phase2/Phase2/src/benutzer.xml";
  public static final String OBJEKTLISTE_XML = "C:/Users/Lutz/git/WBA2Phase2/Phase2/src/objekte.xml";
  
  
  public Marshaller m;
  private Unmarshaller um;
  private JAXBContext context;
  private List<Benutzer> blist; 
  public List<Objekt> olist; 
  public Benutzerliste benutzerliste;
  public Objekte objekte;
  
  public void readBenutzer(){
	
	try {
		context = JAXBContext.newInstance(Benutzerliste.class);
		
		m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		um = context.createUnmarshaller();
	
		benutzerliste = (Benutzerliste) um.unmarshal(new FileReader(BENUTZERLISTE_XML));
		blist = benutzerliste.getBenutzer();
    } catch (JAXBException e) {
		e.printStackTrace();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
  }
  
  public void writeBenutzer(){
	try {
		m.marshal(benutzerliste, new File(BENUTZERLISTE_XML));
	} catch (JAXBException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  
  public Benutzerliste getBenutzer(String benutzer){
	  Benutzerliste benutzerliste=new Benutzerliste();
	  for (Benutzer b : blist){
		  if (b.getName().equals(benutzer)){
			  benutzerliste.getBenutzer().add(b);
			  return benutzerliste;
		  }
	  }
	  return null;
  }
  
  public String printBenutzer(){
	  String r="";  
	  for (Benutzer b : blist) {
	      r+="Name: " + b.getName();
	      System.out.println("Email: "+b.getEmail());
	      System.out.println("Wohnort: "+b.getWohnort().getPLZ()+" "+b.getWohnort().getStadt()+", "+b.getWohnort().getStrasse()+" "+b.getWohnort().getHausNr());
	      
	      System.out.println("Wunschliste: ");
	      for (String wunsch : b.getWunschliste().getWunsch()){
	    	  System.out.println(wunsch);
	      }
	      System.out.println();
	    }
	  return r;
  }
  
  
  
  public void readObjekte(){
		
	try {
		context = JAXBContext.newInstance(Objekte.class);
		
		m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		um = context.createUnmarshaller();
	
		objekte = (Objekte) um.unmarshal(new FileReader(OBJEKTLISTE_XML));
		olist = objekte.getObjekt();
    } catch (JAXBException e) {
		e.printStackTrace();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
  }
  
  public void writeObjekte(){
	try {
		m.marshal(objekte, new File(OBJEKTLISTE_XML));
	} catch (JAXBException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  
  public Objekte getObjekt(String objekt){
	  Objekte objekte=new Objekte();
	  for (Objekt b : olist){
		  if (b.getName().equals(objekt)){
			  objekte.getObjekt().add(b);
			  return objekte;
		  }
	  }
	  return null;
  }
  
  public String printObjekte(){
	  	String r="";
	    for (Objekt b : olist) {
	    	r+="Name: " + b.getName();
	    	
	      System.out.println("Verleiher: "+b.getVerleiher());
	      System.out.println("Kategorie: "+b.getKategorie());
	      System.out.println("Beschreibung: "+b.getBeschreibung());
	      System.out.println("Pfand: "+b.getPfand());
	      
	      System.out.println("Tags:");
	      
	      
	      for (String t : b.getTags().getTag()){
	    	  System.out.println(t);
	      }
	      
	      System.out.println("Bilder:");
	      
	      for (String bild : b.getBilder().getBild()){
	    	  System.out.println(bild);
	      }
	      
	      System.out.println();
	    }
	    return r;
  }
  
  
  
  public static void main(String[] args) throws JAXBException, IOException {
	  XMLMarshaller xmlm=new XMLMarshaller();
	  xmlm.readBenutzer();
	  System.out.println(xmlm.getBenutzer("Lutz"));
  }
  
  
} 