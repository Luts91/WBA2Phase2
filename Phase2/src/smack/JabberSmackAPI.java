package smack;
import java.util.*;
import java.io.*;
 
import org.jivesoftware.smack.Chat;
import org.jivesoftware.smack.Connection;
import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.MessageListener;
import org.jivesoftware.smack.Roster;
import org.jivesoftware.smack.RosterEntry;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smackx.pubsub.*;

 
public class JabberSmackAPI {
 
    //XMPPConnection connection;
    
    public void createNode(Connection connection, String name) throws XMPPException{
        // Create a pubsub manager using an existing Connection
        PubSubManager mgr = new PubSubManager(connection, "pubsub." + connection.getServiceName());

        // Create the node
        LeafNode leaf = mgr.createNode(name);
        ConfigureForm form = new ConfigureForm(FormType.submit);
        form.setAccessModel(AccessModel.open);
        form.setDeliverPayloads(true);
        form.setNotifyRetract(true);
        form.setPersistentItems(true);
        form.setPublishModel(PublishModel.open);
        
        leaf.sendConfigurationForm(form);
    }
    
    public void publishItem(Connection connection, String nodeName, String id, String payload) throws XMPPException{
    	// Create a pubsub manager using an existing Connection
        PubSubManager mgr = new PubSubManager(connection, "pubsub." + connection.getServiceName());

        // Get the node
        LeafNode node = mgr.getNode(nodeName);

        node.publish(new PayloadItem<SimplePayload>(id, 
        		new SimplePayload(id,null,payload)));
    }
 
    public void subscribe(Connection connection, String nodeName) throws XMPPException{
    	// Create a pubsub manager using an existing Connection
        PubSubManager mgr = new PubSubManager(connection, "pubsub." + connection.getServiceName());
   
        // Get the node
        LeafNode node = mgr.getNode(nodeName);
        
        node.addItemEventListener(new ItemEventCoordinator());
        node.subscribe(connection.getUser()+"@localhost");
    }
    
    
    
    public static void main(String args[]) throws XMPPException, IOException
    {
	    // declare variables
	    JabberSmackAPI c = new JabberSmackAPI();
	    ConnectionHandler ch = new ConnectionHandler();
	 
	    // Enter your login information here
	    ch.login("user1", "12345");
	    //c.createNode(ch.connection,"testNode2");
	    c.subscribe(ch.connection,"testNode2");
	    c.publishItem(ch.connection,"testNode2","test1","<bla>testpayload</bla>");

	    //c.publishItem(ch.connection,"testNode2","test2","<bla>testpayload</bla>");
	    ch.disconnect();
	    System.exit(0);
    }
 
}
