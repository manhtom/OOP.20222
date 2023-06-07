package hust.soict.cybersec.aims.disc;

public class Track implements Playable {
    private String title;
    private int length;

    public Track() {
        // to do
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

	public void play() {
		System.out.println("Playing track: "+this.getTitle());
		System.out.println("Track length: "+this.getLength());
	}
}