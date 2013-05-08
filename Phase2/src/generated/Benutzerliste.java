//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.05.08 um 05:24:36 PM CEST 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="benutzer" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Passwort" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Wohnort">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Stadt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PLZ" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Straße" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="HausNr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Bild" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Wunschliste">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Wunsch" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "benutzer"
})
@XmlRootElement(name = "benutzerliste")
public class Benutzerliste {

    protected List<Benutzerliste.Benutzer> benutzer;

    /**
     * Gets the value of the benutzer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the benutzer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBenutzer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Benutzerliste.Benutzer }
     * 
     * 
     */
    public List<Benutzerliste.Benutzer> getBenutzer() {
        if (benutzer == null) {
            benutzer = new ArrayList<Benutzerliste.Benutzer>();
        }
        return this.benutzer;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Passwort" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Wohnort">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Stadt" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="PLZ" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Straße" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="HausNr" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Bild" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Wunschliste">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Wunsch" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "passwort",
        "email",
        "wohnort",
        "bild",
        "wunschliste"
    })
    public static class Benutzer {

        @XmlElement(name = "Name", required = true)
        protected String name;
        @XmlElement(name = "Passwort", required = true)
        protected String passwort;
        @XmlElement(name = "Email", required = true)
        protected String email;
        @XmlElement(name = "Wohnort", required = true)
        protected Benutzerliste.Benutzer.Wohnort wohnort;
        @XmlElement(name = "Bild", required = true)
        protected String bild;
        @XmlElement(name = "Wunschliste", required = true)
        protected Benutzerliste.Benutzer.Wunschliste wunschliste;

        /**
         * Ruft den Wert der name-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Legt den Wert der name-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Ruft den Wert der passwort-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPasswort() {
            return passwort;
        }

        /**
         * Legt den Wert der passwort-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPasswort(String value) {
            this.passwort = value;
        }

        /**
         * Ruft den Wert der email-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmail() {
            return email;
        }

        /**
         * Legt den Wert der email-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmail(String value) {
            this.email = value;
        }

        /**
         * Ruft den Wert der wohnort-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Benutzerliste.Benutzer.Wohnort }
         *     
         */
        public Benutzerliste.Benutzer.Wohnort getWohnort() {
            return wohnort;
        }

        /**
         * Legt den Wert der wohnort-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Benutzerliste.Benutzer.Wohnort }
         *     
         */
        public void setWohnort(Benutzerliste.Benutzer.Wohnort value) {
            this.wohnort = value;
        }

        /**
         * Ruft den Wert der bild-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBild() {
            return bild;
        }

        /**
         * Legt den Wert der bild-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBild(String value) {
            this.bild = value;
        }

        /**
         * Ruft den Wert der wunschliste-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Benutzerliste.Benutzer.Wunschliste }
         *     
         */
        public Benutzerliste.Benutzer.Wunschliste getWunschliste() {
            return wunschliste;
        }

        /**
         * Legt den Wert der wunschliste-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Benutzerliste.Benutzer.Wunschliste }
         *     
         */
        public void setWunschliste(Benutzerliste.Benutzer.Wunschliste value) {
            this.wunschliste = value;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Stadt" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="PLZ" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Straße" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="HausNr" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "stadt",
            "plz",
            "stra\u00dfe",
            "hausNr"
        })
        public static class Wohnort {

            @XmlElement(name = "Stadt", required = true)
            protected String stadt;
            @XmlElement(name = "PLZ", required = true)
            protected String plz;
            @XmlElement(name = "Stra\u00dfe", required = true)
            protected String straße;
            @XmlElement(name = "HausNr", required = true)
            protected String hausNr;

            /**
             * Ruft den Wert der stadt-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStadt() {
                return stadt;
            }

            /**
             * Legt den Wert der stadt-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStadt(String value) {
                this.stadt = value;
            }

            /**
             * Ruft den Wert der plz-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPLZ() {
                return plz;
            }

            /**
             * Legt den Wert der plz-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPLZ(String value) {
                this.plz = value;
            }

            /**
             * Ruft den Wert der straße-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStraße() {
                return straße;
            }

            /**
             * Legt den Wert der straße-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStraße(String value) {
                this.straße = value;
            }

            /**
             * Ruft den Wert der hausNr-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHausNr() {
                return hausNr;
            }

            /**
             * Legt den Wert der hausNr-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHausNr(String value) {
                this.hausNr = value;
            }

        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Wunsch" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "wunsch"
        })
        public static class Wunschliste {

            @XmlElement(name = "Wunsch")
            protected List<String> wunsch;

            /**
             * Gets the value of the wunsch property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the wunsch property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWunsch().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getWunsch() {
                if (wunsch == null) {
                    wunsch = new ArrayList<String>();
                }
                return this.wunsch;
            }

        }

    }

}
