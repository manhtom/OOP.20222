package hust.soict.cybersec.aims.disc;

import java.util.*;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();

    public CompactDisc(String title, String genre, float cost, String artist) {
        super(title, genre, cost);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public boolean addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
            System.out.println("Added track: "+track.getTitle());
            return true;
        }
        else {
            System.out.println("Unable to add track: "+track.getTitle()+" because the track is already in the list");
            return false;
        }
    }

    public boolean removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Removed track: "+track.getTitle());
            return true;
        }
        else {
            System.out.println("Unable to removed track: "+track.getTitle()+" because the track is not in the list");
            return false;
        }
    }

    public int getLength() {
        int total = 0;
        for (Track i : tracks) {
            total += i.getLength();
        }
        return total;
    }

	public void play() {
        System.out.println("Playing CD: "+this.getTitle());
        System.out.printf("Genre: %s - Artist: %s - Length: %d%n", this.getCategory(), this.getArtist(), this.getLength());
    
		for (Track i : tracks) {
            i.play();
        }
	}
}