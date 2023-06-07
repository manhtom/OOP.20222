package hust.soict.cybersec.aims.disc;

public class DigitalVideoDisc extends Disc implements Playable {
	private static int nbDigitalVideoDiscs = 0;
	private String director;
	private int length;

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		nbDigitalVideoDiscs++;
		this.director=director;
		this.length=length;
		setID(nbDigitalVideoDiscs);
	}

	public DigitalVideoDisc(String title) {
		nbDigitalVideoDiscs++;
		super.setTitle(title);
		setID(nbDigitalVideoDiscs);
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		nbDigitalVideoDiscs++;
		super.setTitle(title);
		super.setCategory(category);
		super.setCost(cost);
		setID(nbDigitalVideoDiscs);
	}

	public DigitalVideoDisc(String title, String category, String director, float cost) {
		nbDigitalVideoDiscs++;
		super.setTitle(title);
		super.setCategory(category);
		this.director=director;
		super.setCost(cost);
		setID(nbDigitalVideoDiscs);
	}

	public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}

	public void swap(DigitalVideoDisc dvd) {
		super.setTitle(dvd.getTitle());
		super.setCategory(dvd.getCategory());
		this.director = dvd.getDirector();
		this.length = dvd.getLength();
		super.setCost(dvd.getCost());
		setID(dvd.getID());
	}

	public String getDetail(){
		return String.format("DVD - %s - %s - %s - %s minutes: %.2f $", this.getTitle(),this.getCategory(), this.getDirector(), this.getLength(), this.getCost());
	}

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