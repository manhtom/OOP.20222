package hust.soict.cybersec.aims.store;

import hust.soict.cybersec.aims.media.*;
import java.util.*;

public class Store {
    private List<Media> itemsInStore = new ArrayList<Media>();
    private int qty = 0;

	public boolean addMedia(Media media) {
        if (!itemsInStore.contains(media)) {
            itemsInStore.add(media);
            System.out.println("Added product: "+media.getTitle());
			qty++;
            return true;
        }
        else {
            System.out.println("Unable to add product: "+media.getTitle()+" because the product is already in the store");
            return false;
        }
    }

    public boolean removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
			qty--;
            System.out.println("Removed product: "+media.getTitle());
            return true;
        }
        else {
            System.out.println("Unable to removed product: "+media.getTitle()+" because the product is not in the store");
            return false;
        }
    }
	public float totalCost() {
		float total=0;
		for (Media i : itemsInStore) {
			total+=i.getCost();
		}
		return total;
	}
}