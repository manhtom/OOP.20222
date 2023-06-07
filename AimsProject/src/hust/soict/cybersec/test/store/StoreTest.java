package hust.soict.cybersec.test.store;
import hust.soict.cybersec.aims.disc.*;
import hust.soict.cybersec.aims.store.*;

public class StoreTest {
    public static void main(String[] args) {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin","Animation",18.99f);

        Store aStore= new Store();
        //add DVDs to store
        aStore.addMedia(dvd1);
        aStore.addMedia(dvd2);
        aStore.addMedia(dvd3);

        //remove "Aladdin" and "The Lion King" from store
        aStore.removeMedia(dvd3);
        aStore.removeMedia(dvd3); // attempt to trigger the error message
        aStore.removeMedia(dvd1);

    }
}