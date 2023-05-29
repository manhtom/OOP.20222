public class StoreTest {
    public static void main(String[] args) {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin","Animation",18.99f);

        Store aStore= new Store();
        //add DVDs to store
        aStore.addDVD(dvd1);
        aStore.addDVD(dvd2);
        aStore.addDVD(dvd3);

        //remove "Aladdin" from store
        aStore.removeDVD(dvd3);

    }
}