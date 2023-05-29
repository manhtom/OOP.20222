public class aims {
	public static void main(String[] args) {
		// create a new cart
		Cart anOrder = new Cart();

		// create new dvd objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin","Animation",18.99f);

		anOrder.addDigitalVideoDisc(dvd1);
		anOrder.addDigitalVideoDisc(dvd2);
		anOrder.addDigitalVideoDisc(dvd3);

		// print total cost of the items in the cart
		System.out.println("Total cost is: "+ anOrder.totalCost());
		anOrder.print(); // print the order to confirm again

		// empty the cart
		System.out.println("Now emptying the cart...");
		anOrder.removeDigitalVideoDisc(dvd1);

		anOrder.print(); // print the order to confirm

		anOrder.removeDigitalVideoDisc(dvd3);
		anOrder.removeDigitalVideoDisc(dvd3); // user is removing a non-existent dvd

		anOrder.removeDigitalVideoDisc(dvd2);
		anOrder.removeDigitalVideoDisc(dvd2); // user is removing dvd from an empty cart

		// confirm that the cart is empty by printing the order
		anOrder.print();
	}
}