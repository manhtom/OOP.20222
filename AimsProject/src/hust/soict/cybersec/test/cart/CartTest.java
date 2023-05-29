public class CartTest {
    public static void main(String[] args) {
		Cart anOrder = new Cart();
		
		// create new dvd objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin","Animation",18.99f);

        anOrder.addDigitalVideoDisc(dvd1);
		anOrder.addDigitalVideoDisc(dvd2);
		anOrder.addDigitalVideoDisc(dvd3);

        System.out.println("");
        
        // print everything in the order
        anOrder.print();

        System.out.println("");
    
        // search
        anOrder.search("Aladdin");
        anOrder.search("Cinderella");
        anOrder.search(2);
    }
}