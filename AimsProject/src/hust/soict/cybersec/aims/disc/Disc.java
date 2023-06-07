package hust.soict.cybersec.aims.disc;

import hust.soict.cybersec.aims.media.*;

public class Disc extends Media {
    private String director;
	private int length;

    public Disc() {
        super();
    }

    public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}
}