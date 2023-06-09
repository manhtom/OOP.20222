package hust.soict.cybersec.aims.cart;

import hust.soict.cybersec.aims.media.*;
import java.util.*;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private List<Media> itemsOrdered=new ArrayList<Media>();

    public boolean addMedia(Media media) {
        if (!itemsOrdered.contains(media)) {
            itemsOrdered.add(media);
            System.out.println("Added product: "+media.getTitle());
            return true;
        }
        else {
            System.out.println("Unable to add product: "+media.getTitle()+" because the product is already in the cart");
            return false;
        }
    }

    public boolean removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println("Removed product: "+media.getTitle());
            return true;
        }
        else {
            System.out.println("Unable to remove product: "+media.getTitle()+" because the product is not in the cart");
            return false;
        }
    }
	public float totalCost() {
		float total=0;
		for (Media i : itemsOrdered) {
			total+=i.getCost();
		}
		return total;
	}

	public void print() {
		int k = 0;
		System.out.println("");
		System.out.println("***********************CART***********************");
		if (itemsOrdered.size() > 0) {
			System.out.println("Ordered Items:");
			for (Media i : itemsOrdered){
				System.out.printf("%d. %s - %s - %s - %s%n", k+1, i.getTitle(), i.getCategory(), i.getCost(), i.getDate());
				k++;
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
		for (Media i : itemsOrdered){
			if (i.getTitle() == title) {
				System.out.printf("%d. %s - %s - %s - %s%n", k+1, i.getTitle(), i.getCategory(), i.getCost(), i.getDate());
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
		System.out.printf("Search results for '%s':%n", id);
		for (Media i : itemsOrdered){
			if (i.getID() == id) {
				System.out.printf("%d. %s - %s - %s - %s%n", k+1, i.getTitle(), i.getCategory(), i.getCost(), i.getDate());
				k = 1; // flag triggers when there is a matching
			}
		}
		if (k == 0) { // no matching
			System.out.println("No results");
		}
		System.out.println("");
	}

	public void sortItems() {
		Scanner input = new Scanner(System.in);
		System.out.println("Type 1 if you want to sort by title.\nType 2 if you want to sort by cost.");
		int selected = input.nextInt();
		if (selected == 1) {
			Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
			System.out.println("Sorting completed.");
			print();
		}
		else {
			Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
			System.out.println("Sorting completed.");
			print();
		}
		input.close();
	}
}