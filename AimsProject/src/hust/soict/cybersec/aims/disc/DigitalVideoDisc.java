package hust.soict.cybersec.aims.disc;

import java.net.CacheRequest;

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
		this.title = dvd.getTitle();
		this.category = dvd.getCategory();
		this.director = dvd.getDirector();
		this.length = dvd.getLength();
		this.cost = dvd.getCost();
		this.id = dvd.getID();
	}

	public String getDetail(){
		return String.format("DVD - %s - %s - %s - %s minutes: %.2f $", this.getTitle(),this.getCategory(), this.getDirector(), this.getLength(), this.getCost());
	}

	public boolean search(String title) {
		if (this.title == title) {
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