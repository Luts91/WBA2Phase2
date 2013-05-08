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

  private static final String BOOKSTORE_XML = "C:/Users/Lutz/git/WBA2Phase2/Phase2/src/benutzer.xml";

  public static void main(String[] args) throws JAXBException, IOException {

    ArrayList<Benutzerliste> bookList = new ArrayList<Benutzerliste>();
/*
    // create books
    Book book1 = new Book();
    book1.setIsbn("978-0060554736");
    book1.setName("The Game");
    book1.setAuthor("Neil Strauss");
    book1.setPublisher("Harpercollins");
    bookList.add(book1);

    Book book2 = new Book();
    book2.setIsbn("978-3832180577");
    book2.setName("Feuchtgebiete");
    book2.setAuthor("Charlotte Roche");
    book2.setPublisher("Dumont Buchverlag");
    bookList.add(book2);

    // create bookstore, assigning book
    Bookstore bookstore = new Bookstore();
    bookstore.setName("Fraport Bookstore");
    bookstore.setLocation("Frankfurt Airport");
    bookstore.setBookList(bookList);
*/
    // create JAXB context and instantiate marshaller
    JAXBContext context = JAXBContext.newInstance(Benutzerliste.class);
    Marshaller m = context.createMarshaller();
    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
/*
    // Write to System.out
    m.marshal(bookstore, System.out);

    // Write to File
    m.marshal(bookstore, new File(BOOKSTORE_XML));
*/
    // get variables from our xml file, created before
    System.out.println();
    System.out.println("Output from our XML File: ");
    Unmarshaller um = context.createUnmarshaller();
    Benutzerliste bookstore2 = (Benutzerliste) um.unmarshal(new FileReader(BOOKSTORE_XML));
    List<Benutzer> list = bookstore2.getBenutzer();
    for (Benutzer book : list) {
      System.out.println("Name: " + book.getName());
      System.out.println("Email: "+book.getEmail());
      System.out.println("Wohnort: "+book.getWohnort().getPLZ()+" "+book.getWohnort().getStadt()+", "+book.getWohnort().getStraﬂe()+" "+book.getWohnort().getHausNr());
    }
  }
} 