package hust.soict.cybersec.aims.media;

import java.time.LocalDate;
import java.util.Comparator;

import hust.soict.cybersec.aims.disc.*;
import hust.soict.cybersec.aims.book.*;

public abstract class Media {
    private static int nbMedia = 0;
    private int id;
    private String title;
    private String category;
    private float cost;
    private LocalDate date;
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();


    public Media(String title, String category, float cost) {
        nbMedia++;
        this.id = nbMedia;
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.date = LocalDate.now();
    } 

    public int getID() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public boolean equals(Object o) {
        if (o instanceof Media) {
            if (this.title == ((Media)o).title) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
    
	public String getDetail(){
		if (this instanceof DigitalVideoDisc) {
			return String.format("DVD - %s - %s - %s - %d minutes: %.2f $", this.getTitle(),this.getCategory(), ((Disc)this).getDirector(), ((Disc)this).getLength(), this.getCost());
		}

		else if (this instanceof CompactDisc) {
			return String.format("CD - %s - %s - %d minutes: %.2f $", this.getTitle(),this.getCategory(), ((Disc)this).getLength(), this.getCost());
		}

		else {
			return String.format("Book - %s - %s - %s: %.2f $", this.getTitle(), ((Book)this).getAuthors(), this.getCategory(), this.getCost());
		}
	}

	public boolean search(String title) {
		if (this.title.equals(title)) {
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