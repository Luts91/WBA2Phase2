//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.05.10 um 05:09:15 PM CEST 
//


package generated;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Benutzerliste }
     * 
     */
    public Benutzerliste createBenutzerliste() {
        return new Benutzerliste();
    }

    /**
     * Create an instance of {@link Benutzerliste.Benutzer }
     * 
     */
    public Benutzerliste.Benutzer createBenutzerlisteBenutzer() {
        return new Benutzerliste.Benutzer();
    }

    /**
     * Create an instance of {@link Benutzerliste.Benutzer.Wohnort }
     * 
     */
    public Benutzerliste.Benutzer.Wohnort createBenutzerlisteBenutzerWohnort() {
        return new Benutzerliste.Benutzer.Wohnort();
    }

    /**
     * Create an instance of {@link Benutzerliste.Benutzer.Wunschliste }
     * 
     */
    public Benutzerliste.Benutzer.Wunschliste createBenutzerlisteBenutzerWunschliste() {
        return new Benutzerliste.Benutzer.Wunschliste();
    }

}
