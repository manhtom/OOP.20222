public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private int qtyOrdered=0;
	private DigitalVideoDisc[] itemsOrdered=new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		// this will add a single copy of the disc each time it's run. must run multiple times to add multiple copies of the same disc
		if (this.qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is full. Please remove some discs to continue.");
			return;
		}

		else {
			this.itemsOrdered[qtyOrdered] = disc;
			this.qtyOrdered++;
			System.out.println("The disc '" + disc.getTitle() + "' has successfully been added to cart.");
		}
	}

	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList){ // add a list of DVDs to the current cart
		for (DigitalVideoDisc i : dvdList) {
			addDigitalVideoDisc(i);
		}
	}

	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) { // pass an arbitrary number of arguments for dvd (in this case 2)
		// personally i prefer the method using array parameter because it's more flexible in terms of the number of dvds one wants to add
		addDigitalVideoDisc(dvd1);
		addDigitalVideoDisc(dvd2);
	}

	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		// this will remove a single copy of the disc each time it's run. must run multiple times to remove multiple copies of the same disc
		// we will recreate a new itemsOrdered array without the removed dvds
	
		DigitalVideoDisc[] newItemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
		int k = 0; // the index for newItemsOrdered
		int removed = 0; // removal flag
	
		for (int i=0; i < MAX_NUMBERS_ORDERED ; i++) {
			if (this.itemsOrdered[i] != disc || (this.itemsOrdered[i] == disc && removed == 1)) {
				newItemsOrdered[k] = this.itemsOrdered[i];
				k++;
			}
			else {
				System.out.println("The disc '" + disc.getTitle() + "' has successfully been removed from cart.");
				this.qtyOrdered-=1;
				removed = 1; // trigger the flag
			}
		}
		this.itemsOrdered = newItemsOrdered; // operate directly on the object

		if (removed == 0) { // different messages shown to user depending on whether the cart is empty or not
			if (this.qtyOrdered == 0) { // the cart is empty
				System.out.println("The disc '" + disc.getTitle() + "' is not in the cart. The cart is currently empty.");
				return;
			}
			else { // the cart has something
				System.out.println("The disc '" + disc.getTitle() + "' is not in the cart. You can only remove what is in the cart.");
			}
		}
	}
	public float totalCost() {
		float total=0;
		for (int i=0; i < qtyOrdered ; i++) {
			total+=this.itemsOrdered[i].getCost();
		}
		return total;
	}

	public void print() {
		System.out.println("");
		System.out.println("***********************CART***********************");
		if (qtyOrdered > 0) {
			System.out.println("Ordered Items:");
			for (int i=0; i<qtyOrdered; i++){
				System.out.printf("%d. %s%n", i+1, this.itemsOrdered[i].getDetail());
			}
			System.out.printf("Total cost: %.2f%n", totalCost());
		}
		else {
			System.out.println("Nothing in cart here.");
		}
		System.out.println("***************************************************");
	}

	public void search(String title) {
		int k = 0; // matching flag
		System.out.println("");
		System.out.printf("Search results for '%s':%n", title);
		for (int i=0; i < qtyOrdered ; i++) {
			if (itemsOrdered[i].search(title)) {
				System.out.printf("%s%n", itemsOrdered[i].getDetail());
				k = 1; // flag triggers when there is a matching
			}
		}
		if (k == 0) { // no matching
			System.out.println("No results");
		}
		System.out.println("");
	}

	public void search(int id) {
		int k = 0; // matching flag
		System.out.println("");
		System.out.printf("Search results for ID %d:%n", id);
		for (int i=0; i < qtyOrdered ; i++) {
			if (itemsOrdered[i].search(id)) {
				System.out.printf("%s%n", itemsOrdered[i].getDetail());
				k = 1; // flag triggers when there is a matching
			}
		}
		if (k == 0) { // no matching
			System.out.println("No results");
		}
		System.out.println("");
	}
}