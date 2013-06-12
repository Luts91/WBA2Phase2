package smack;

import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;

public class ConnectionHandler {
	public XMPPConnection connection;
	
	public void login(String userName, String password) throws XMPPException
    {
	    ConnectionConfiguration config = new ConnectionConfiguration("localhost",5222, "Work");
	    connection = new XMPPConnection(config);
	 
	    connection.connect();
	    connection.login(userName, password);
    }
	

    public void disconnect()
    {
    	connection.disconnect();
    }
 
}
