public class Store {
    private DigitalVideoDisc itemsInStore[];
    private int qty = 0;

    public Store() {
        itemsInStore=new DigitalVideoDisc[1000];
    }

    public void addDVD(DigitalVideoDisc disc) {
        itemsInStore[qty]=disc;
        qty++;
        System.out.println("The disc '" + disc.getTitle() + "' has successfully been added to store.");
    }

    public void removeDVD(DigitalVideoDisc disc) {
		DigitalVideoDisc[] newItemsInStore= new DigitalVideoDisc[qty-1];
		int k = 0; // the index for newItemsOrdered
		int removed = 0; // removal flag
	
		for (int i=0; i < qty ; i++) {
			if (this.itemsInStore[i] != disc || (this.itemsInStore[i] == disc && removed == 1)) {
				newItemsInStore[k] = this.itemsInStore[i];
				k++;
			}
			else {
				System.out.println("The disc '" + disc.getTitle() + "' has successfully been removed from store.");
				this.qty-=1;
				removed = 1; // trigger the flag
			}
		}
		this.itemsInStore = newItemsInStore; // operate directly on the object

		if (removed == 0) { // different messages shown to user depending on whether the store is empty or not
			if (this.qty == 0) { // the store is empty
				System.out.println("The disc '" + disc.getTitle() + "' is not available in the store. The store is currently empty.");
				return;
			}
			else { // the cart has something
				System.out.println("The disc '" + disc.getTitle() + "' is not available in the store. You can only remove what is in the store.");
			}
		}
	}
}
