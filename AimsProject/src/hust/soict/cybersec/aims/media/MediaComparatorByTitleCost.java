package hust.soict.cybersec.aims.media;
import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {
    public int compare(Media firstMedia, Media secondMedia) {
        int compare = firstMedia.getTitle().compareTo(secondMedia.getTitle());
        if (compare != 0) {
            return compare;
        }
        else {
            return Float.compare(firstMedia.getCost(), secondMedia.getCost());
        }
    }
}
