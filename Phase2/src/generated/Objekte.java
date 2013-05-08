//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.05.08 um 05:24:24 PM CEST 
//


package generated;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="objekt" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Verleiher" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Tags">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Tag" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Kategorie" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Beschreibung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ZeitraumStart" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="ZeitraumEnde" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="Pfand" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="Bilder">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Bild" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
    "objekt"
})
@XmlRootElement(name = "objekte")
public class Objekte {

    protected List<Objekte.Objekt> objekt;

    /**
     * Gets the value of the objekt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objekt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjekt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Objekte.Objekt }
     * 
     * 
     */
    public List<Objekte.Objekt> getObjekt() {
        if (objekt == null) {
            objekt = new ArrayList<Objekte.Objekt>();
        }
        return this.objekt;
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
     *         &lt;element name="Verleiher" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Tags">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Tag" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Kategorie" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Beschreibung" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ZeitraumStart" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="ZeitraumEnde" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="Pfand" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="Bilder">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Bild" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "verleiher",
        "tags",
        "kategorie",
        "beschreibung",
        "zeitraumStart",
        "zeitraumEnde",
        "pfand",
        "bilder"
    })
    public static class Objekt {

        @XmlElement(name = "Name", required = true)
        protected String name;
        @XmlElement(name = "Verleiher", required = true)
        protected String verleiher;
        @XmlElement(name = "Tags", required = true)
        protected Objekte.Objekt.Tags tags;
        @XmlElement(name = "Kategorie", required = true)
        protected String kategorie;
        @XmlElement(name = "Beschreibung", required = true)
        protected String beschreibung;
        @XmlElement(name = "ZeitraumStart", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar zeitraumStart;
        @XmlElement(name = "ZeitraumEnde", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar zeitraumEnde;
        @XmlElement(name = "Pfand", required = true)
        protected BigDecimal pfand;
        @XmlElement(name = "Bilder", required = true)
        protected Objekte.Objekt.Bilder bilder;

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
         * Ruft den Wert der verleiher-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVerleiher() {
            return verleiher;
        }

        /**
         * Legt den Wert der verleiher-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVerleiher(String value) {
            this.verleiher = value;
        }

        /**
         * Ruft den Wert der tags-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Objekte.Objekt.Tags }
         *     
         */
        public Objekte.Objekt.Tags getTags() {
            return tags;
        }

        /**
         * Legt den Wert der tags-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Objekte.Objekt.Tags }
         *     
         */
        public void setTags(Objekte.Objekt.Tags value) {
            this.tags = value;
        }

        /**
         * Ruft den Wert der kategorie-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKategorie() {
            return kategorie;
        }

        /**
         * Legt den Wert der kategorie-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKategorie(String value) {
            this.kategorie = value;
        }

        /**
         * Ruft den Wert der beschreibung-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBeschreibung() {
            return beschreibung;
        }

        /**
         * Legt den Wert der beschreibung-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBeschreibung(String value) {
            this.beschreibung = value;
        }

        /**
         * Ruft den Wert der zeitraumStart-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getZeitraumStart() {
            return zeitraumStart;
        }

        /**
         * Legt den Wert der zeitraumStart-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setZeitraumStart(XMLGregorianCalendar value) {
            this.zeitraumStart = value;
        }

        /**
         * Ruft den Wert der zeitraumEnde-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getZeitraumEnde() {
            return zeitraumEnde;
        }

        /**
         * Legt den Wert der zeitraumEnde-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setZeitraumEnde(XMLGregorianCalendar value) {
            this.zeitraumEnde = value;
        }

        /**
         * Ruft den Wert der pfand-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPfand() {
            return pfand;
        }

        /**
         * Legt den Wert der pfand-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPfand(BigDecimal value) {
            this.pfand = value;
        }

        /**
         * Ruft den Wert der bilder-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Objekte.Objekt.Bilder }
         *     
         */
        public Objekte.Objekt.Bilder getBilder() {
            return bilder;
        }

        /**
         * Legt den Wert der bilder-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Objekte.Objekt.Bilder }
         *     
         */
        public void setBilder(Objekte.Objekt.Bilder value) {
            this.bilder = value;
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
         *         &lt;element name="Bild" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
            "bild"
        })
        public static class Bilder {

            @XmlElement(name = "Bild")
            protected List<String> bild;

            /**
             * Gets the value of the bild property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the bild property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBild().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getBild() {
                if (bild == null) {
                    bild = new ArrayList<String>();
                }
                return this.bild;
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
         *         &lt;element name="Tag" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
            "tag"
        })
        public static class Tags {

            @XmlElement(name = "Tag")
            protected List<String> tag;

            /**
             * Gets the value of the tag property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the tag property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTag().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getTag() {
                if (tag == null) {
                    tag = new ArrayList<String>();
                }
                return this.tag;
            }

        }

    }

}
