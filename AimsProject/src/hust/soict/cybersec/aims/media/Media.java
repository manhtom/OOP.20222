package hust.soict.cybersec.aims.media;

import java.time.LocalDate;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;
    private LocalDate date;

    public Media() {
        // to do
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
}