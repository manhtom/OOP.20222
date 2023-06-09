package hust.soict.cybersec.aims.disc;

public class DigitalVideoDisc extends Disc implements Playable {

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, cost, director, length);
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);
	}

	// public void swap(DigitalVideoDisc dvd) {
	//	super.setTitle(dvd.getTitle());
	//	super.setCategory(dvd.getCategory());
	//	this.director = dvd.getDirector();
	//	this.length = dvd.getLength();
	//	super.setCost(dvd.getCost());
	//	setID(dvd.getID());
	//}

	public boolean search(String title) {
		if (super.getTitle() == title) {
			return true;
		}
		else {
			return false;
		}
	}

	public boolean search(int id) {
		if (super.getID() == id) {
			return true;
		}
		else {
			return false;
		}
	}

	public void play() {
		System.out.println("Playing DVD: "+this.getTitle());
		System.out.println("DVD length: "+this.getLength());
	}
}