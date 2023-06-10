package hust.soict.cybersec.aims;

import hust.soict.cybersec.aims.book.Book;
import hust.soict.cybersec.aims.cart.*;
import hust.soict.cybersec.aims.disc.CompactDisc;
import hust.soict.cybersec.aims.disc.DigitalVideoDisc;
import hust.soict.cybersec.aims.store.*;
import java.util.*;

public class aims {
	static Store aStore = new Store();
	static Cart anOrder = new Cart();
	static Scanner input = new Scanner(System.in);

	public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
		int selected = input.nextInt();

		if (selected == 1) {
			aStore.print(anOrder);
			storeMenu();
			showMenu();
		}
		else if (selected == 2) {
			aStore.update();
			showMenu();
		}
		else if (selected == 3) {
			anOrder.print();
			cartMenu();
			showMenu();
		}
		else {
			input.close();
			return;
		}
	}

	public static void storeMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media’s details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");

		int selected = input.nextInt();
		if (selected == 1) {
			aStore.getDetail(anOrder);
			showMenu();
		}
		else if (selected == 2) {
			aStore.addMedia(anOrder);
			showMenu();
		}
		else if (selected == 3) {
			aStore.playMedia();
			showMenu();
		}
		else if (selected == 4) {
			anOrder.print();
			cartMenu();
			showMenu();
		}
		else {
			return;
		}
	}

	public static void cartMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");

		int selected = input.nextInt();
		if (selected == 1) {
			anOrder.filterItems();
			cartMenu();
		}
		else if (selected == 2) {
			anOrder.sortItems();
			cartMenu();
		}
		else if (selected == 3) {
			anOrder.removeMedia();
			cartMenu();
		}
		else if (selected == 4) {
			anOrder.playMedia();
			cartMenu();
		}
		else if (selected == 5) {
			System.out.println("An order has been created. The cart will now be emptied.");
			anOrder.empty();
			cartMenu();
		}
		else {
			return;
		}
	}

	public static void main(String[] args) { // preadded 3 products to the store
		CompactDisc cd = new CompactDisc("Ninth Symphony", "Classical", 14.00f, "Beethoven");
        DigitalVideoDisc dvd = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
        Book book = new Book("Gone with the Wind", "Fiction", 19.88f, "Margaret Mitchell");
		aStore.addMedia(cd);
		aStore.addMedia(dvd);
		aStore.addMedia(book);
		showMenu();
	}

	// public static void main(String[] args) {
	// 	// create a new cart
	// 	Cart anOrder = new Cart();

	// create new dvd objects and add them to the cart
	// 	DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
	// 	DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
	// 	DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin","Animation",18.99f);

	// 	anOrder.addMedia(dvd1);
	// 	anOrder.addMedia(dvd2);
	// 	anOrder.addMedia(dvd3);

		// print total cost of the items in the cart
	// 	System.out.println("Total cost is: "+ anOrder.totalCost());
	// 	anOrder.print(); // print the order to confirm again

		// empty the cart
	// 	System.out.println("Now emptying the cart...");
	// 	anOrder.removeMedia(dvd1);

	// 	anOrder.print(); // print the order to confirm

	// 	anOrder.removeMedia(dvd3);
	// 	anOrder.removeMedia(dvd3); // user is removing a non-existent dvd

	// 	anOrder.removeMedia(dvd2);
	// 	anOrder.removeMedia(dvd2); // user is removing dvd from an empty cart

		// confirm that the cart is empty by printing the order
	// 	anOrder.print();
	// }
}