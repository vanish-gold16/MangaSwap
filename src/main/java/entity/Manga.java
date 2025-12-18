package entity;

import javax.persistence.*;

@Entity
@Table(name = "mangas")
public class Manga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;


    @OneToOne(mappedBy = "mangas", cascade =  CascadeType.ALL)
    private CollectionItem item;


    public CollectionItem getItem() {
        return item;
    }

    public void setItem(CollectionItem item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Manga: " + title + "\nby: " + author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
