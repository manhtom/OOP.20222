package hust.soict.cybersec.aims.disc;

import hust.soict.cybersec.aims.media.*;

public class Disc extends Media {
    private String director;
	private int length;

    public Disc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public Disc(String title, String category, float cost, String director, int length) {
        super(title, category, cost);
		this.director = director;
		this.length = length;
    }

	public Disc(String title, String category, float cost, int length) {
        super(title, category, cost);
		this.length = length;
    }

    public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}
}