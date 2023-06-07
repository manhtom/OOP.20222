package hust.soict.cybersec.aims.disc;

public class DigitalVideoDisc extends Disc {
	private static int nbDigitalVideoDiscs = 0;
	private int id;
	private String director;
	private int length;

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		nbDigitalVideoDiscs++;
		this.director=director;
		this.length=length;
		this.id=nbDigitalVideoDiscs;
	}

	public DigitalVideoDisc(String title) {
		nbDigitalVideoDiscs++;
		super.setTitle(title);
		this.id=nbDigitalVideoDiscs;
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		nbDigitalVideoDiscs++;
		super.setTitle(title);
		super.setCategory(category);
		super.setCost(cost);
		this.id=nbDigitalVideoDiscs;
	}

	public DigitalVideoDisc(String title, String category, String director, float cost) {
		nbDigitalVideoDiscs++;
		super.setTitle(title);
		super.setCategory(category);
		this.director=director;
		super.setCost(cost);
		this.id=nbDigitalVideoDiscs;
	}

	public int getID() {
		return id;
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
		this.id = dvd.getID();
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
		if (this.id == id) {
			return true;
		}
		else {
			return false;
		}
	}
}