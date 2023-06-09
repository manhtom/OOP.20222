package hust.soict.cybersec.aims.book;

import java.util.*;
import hust.soict.cybersec.aims.media.*;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>() ;

    public Book(String title, String category, float cost, ArrayList<String> authors) { // for multiple authors
        super(title, category, cost);
        this.authors = authors;
    }

    public Book(String title, String category, float cost, String authors) { // for single author
        super(title, category, cost);
        this.authors.add(authors);
    }

    public String getAuthors() {
        StringBuffer authorList = new StringBuffer();
        for (String i : authors) {
            authorList.append(String.format("%s, ",i));
        }
        return authorList.toString();
    }

    public boolean addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
            System.out.println("Added author: "+authorName);
            return true;
        }
        else {
            System.out.println("Author: "+authorName+" is already in the list.");
            return false;
        }
    }

    public boolean removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println("Removed author: "+authorName);
            return true;
        }
        else {
            System.out.println("Unable to remove author: "+authorName+" because the author is not in the list");
            return false;
        }
    }
}