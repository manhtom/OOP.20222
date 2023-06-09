package hust.soict.cybersec.aims.media;
import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {
    public int compare(Media firstMedia, Media secondMedia) {
        int compare = Float.compare(firstMedia.getCost(), secondMedia.getCost());
        if (compare != 0) {
            return compare;
        }
        else {
            return firstMedia.getTitle().compareTo(secondMedia.getTitle());
        }
    }
}
