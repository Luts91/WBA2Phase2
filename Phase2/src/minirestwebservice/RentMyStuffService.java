package minirestwebservice;

import generated.Benutzerliste.Benutzer;
import generated.Objekte.Objekt;

import java.io.StringWriter;
import java.math.BigDecimal;

import javax.ws.rs.*;
import javax.xml.bind.JAXBException;

@Path( "/" )
public class RentMyStuffService
{
   
   @GET @Path("benutzer") @Produces( "text/xml" )
   public String benutzerXml(@QueryParam("name") String name){
	     
	   XMLMarshaller xmlm = new XMLMarshaller();
	   xmlm.readBenutzer();
	   java.io.StringWriter sw = new StringWriter();
	   try {
		   if (name != null)
			   xmlm.m.marshal(xmlm.getBenutzer(name), sw);
		   if (name == null)
			   xmlm.m.marshal(xmlm.benutzerliste, sw);
	   } catch (JAXBException e) {
		   e.printStackTrace();
	   }
	   
	   return sw.toString();
   }
   
   @POST @Path("benutzer")
   public void postBenutzer(@QueryParam("name") String name, 
		   @QueryParam("passwort") String passwort, 
		   @QueryParam("email") String email, 
		   @QueryParam("stadt") String stadt, 
		   @QueryParam("plz") String plz, 
		   @QueryParam("strasse") String strasse, 
		   @QueryParam("hausnr") String hausnr, 
		   @QueryParam("bild") String bild){
	   XMLMarshaller xmlm = new XMLMarshaller();
	   xmlm.readBenutzer();
	   
	   Benutzer b=new Benutzer();
	   b.setName(name);
	   b.setPasswort(passwort);
	   b.setEmail(email);
	   
	   Benutzer.Wohnort w=new Benutzer.Wohnort();
	   w.setStadt(stadt);
	   w.setPLZ(plz);
	   w.setStrasse(strasse);
	   w.setHausNr(hausnr);
	   
	   b.setWohnort(w);
	   b.setBild(bild);
	   
	   xmlm.benutzerliste.getBenutzer().add(b);
	   xmlm.writeBenutzer();
   }
   
   
   @GET @Path("objekte") @Produces( "text/xml" )
   public String objekteXml(@QueryParam("name") String name){
	     
	   XMLMarshaller xmlm = new XMLMarshaller();
	   xmlm.readObjekte();
	   
	   java.io.StringWriter sw = new StringWriter();
	   try {
		   if (name !=null)
			   xmlm.m.marshal(xmlm.getObjekt(name), sw);
		   if (name ==null)
			   xmlm.m.marshal(xmlm.objekte, sw);
	   } catch (JAXBException e) {
		   e.printStackTrace();
	   }
	   
	   return sw.toString();
   }
   
   @POST @Path("objekte")
   public void postBenutzer(@QueryParam("name") String name,
		   @QueryParam("verleiher") String verleiher,
		   @QueryParam("kategorie") String kategorie,
		   @QueryParam("beschreibung") String beschreibung,
		   @QueryParam("zeitraumstart") String zeitraumstart,
		   @QueryParam("zeitraumende") String zeitraumende,
		   @QueryParam("pfand") String pfand
		   ){
	   XMLMarshaller xmlm = new XMLMarshaller();
	   xmlm.readObjekte();
	   
	   Objekt o=new Objekt();
	   o.setName(name);
	   o.setVerleiher(verleiher);
	   o.setKategorie(kategorie);
	   o.setBeschreibung(beschreibung);
	   o.setZeitraumStart(zeitraumstart);
	   o.setZeitraumEnde(zeitraumende);
	   o.setPfand(new BigDecimal(pfand));
	   
	   xmlm.objekte.getObjekt().add(o);
	   xmlm.writeObjekte();
   }
    
}