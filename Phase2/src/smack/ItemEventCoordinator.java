package smack;

import org.jivesoftware.smackx.pubsub.Item;
import org.jivesoftware.smackx.pubsub.ItemPublishEvent;
import org.jivesoftware.smackx.pubsub.PayloadItem;
import org.jivesoftware.smackx.pubsub.SimplePayload;
import org.jivesoftware.smackx.pubsub.listener.ItemEventListener;

class ItemEventCoordinator  implements ItemEventListener<Item>
{

	public void handlePublishedItems(ItemPublishEvent<Item> items)
    {
        System.out.println("Item count: " + items.getItems().size());

        for(int i=0; i<=items.getItems().size(); i++){
        	Item curr= items.getItems().get(i);

        	System.out.println(((PayloadItem<SimplePayload>)curr).getId());
    
        	System.out.println(((PayloadItem<SimplePayload>)curr).getPayload().toXML());
        }
	}
}