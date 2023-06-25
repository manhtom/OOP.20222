package hust.soict.cybersec.aims.disc;

import hust.soict.cybersec.aims.exception.*;

public class DigitalVideoDisc extends Disc implements Playable {

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, cost, director, length);
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);
	}

	public DigitalVideoDisc(String title, String category, float cost, int length) {
        super(title, category, cost, length);
    }

	// public void swap(DigitalVideoDisc dvd) {
	//	super.setTitle(dvd.getTitle());
	//	super.setCategory(dvd.getCategory());
	//	this.director = dvd.getDirector();
	//	this.length = dvd.getLength();
	//	super.setCost(dvd.getCost());
	//	setID(dvd.getID());
	//}

	public void play() throws PlayerException {
		if (Integer.compare(this.getLength(), 0) <= 0) {
			throw new PlayerException("The DVD you entered cannot be played because the length is invalid.");
		}
		System.out.println("Playing DVD: "+this.getTitle());
		System.out.println("DVD length: "+this.getLength());
	}
}