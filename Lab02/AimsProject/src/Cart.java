public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private int qtyOrdered=0;
	private DigitalVideoDisc[] itemsOrdered=new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
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
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		// we will recreate a new itemsOrdered array without the removed dvds
	
		DigitalVideoDisc[] newItemsOrdered= new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
		int k = 0; // this is the index for newItemsOrdered
		int removed = 0;
	
		for (int i=0; i < MAX_NUMBERS_ORDERED ; i++) {
			if (this.itemsOrdered[i] != disc) {
				newItemsOrdered[k] = this.itemsOrdered[i];
				k++;
			}
			else {
				System.out.println("The disc '" + disc.getTitle() + "' has successfully been removed from cart.");
				this.qtyOrdered-=1;
				removed = 1;
			}
		}
		this.itemsOrdered = newItemsOrdered;

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
}