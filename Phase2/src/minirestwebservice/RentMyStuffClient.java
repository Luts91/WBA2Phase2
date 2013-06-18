package minirestwebservice;

import java.io.IOException;

import com.sun.grizzly.http.SelectorThread;
import com.sun.jersey.api.client.*;
import com.sun.jersey.api.container.grizzly.GrizzlyServerFactory;

public class RentMyStuffClient
{
   public static void main( String[] args ) throws InterruptedException, IllegalArgumentException, IOException
   {
	  String url = ( args.length > 0 ) ? args[0] : "http://localhost:4434";
	  //String url = ( args.length > 0 ) ? args[0] : "http://localhost:5222";
	  String nam = ( args.length > 1 ) ? args[1] : "";
      url = url + "/benutzer";
      System.out.println( "URL: " + url );
 
     
      WebResource wrs = Client.create().resource( url );

      //System.out.println( "\nXML-Ausgabe:" );
      System.out.println( wrs.accept( "text/xml"  ).get( String.class ) );
      //wrs.post();
   }
}