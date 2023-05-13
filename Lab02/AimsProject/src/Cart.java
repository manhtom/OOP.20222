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
		}

		System.out.println("The disc '" + disc.getTitle() + "' has successfully been added to cart.");
		
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		// we will recreate a new itemsOrdered array without the removed dvds
	
		DigitalVideoDisc[] newItemsOrdered= new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
		int k = 0; // this is the index for newItemsOrdered
	
		for (int i=0; i < MAX_NUMBERS_ORDERED ; i++) {
			if (this.itemsOrdered[i] != disc) {
				newItemsOrdered[k] = this.itemsOrdered[i];
				k++;
			}
		}
		this.qtyOrdered-=1; // updates quantity in cart
		this.itemsOrdered = newItemsOrdered;

		System.out.println("The disc '" + disc.getTitle() + "' has successfully been removed from cart.");
	}
	public float totalCost() {
		float total=0;
		for (int i=0; i < qtyOrdered ; i++) {
			total+=this.itemsOrdered[i].getCost();
		}
		return total;
	}
}