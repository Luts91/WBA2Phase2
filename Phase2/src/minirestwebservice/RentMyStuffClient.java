package minirestwebservice;

import com.sun.jersey.api.client.*;

public class RentMyStuffClient
{
   public static void main( String[] args )
   {
      String url = ( args.length > 0 ) ? args[0] : "http://localhost:4434";
      String nam = ( args.length > 1 ) ? args[1] : "";
      url = url + "/benutzer/peter";
      System.out.println( "URL: " + url );

      WebResource wrs = Client.create().resource( url );

      //System.out.println( "\nXML-Ausgabe:" );
      //System.out.println( wrs.accept( "text/xml"  ).get( String.class ) );
      //wrs.post();
      wrs.delete();
   }
}