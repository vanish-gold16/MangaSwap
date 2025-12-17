package Entity;

import javax.annotation.processing.Generated;
import javax.persistence.*;

@Entity
@Table(name = "Mangas")
public class Manga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "owner_id")
    private int ownerID;

    @OneToOne(mappedBy = "Mangas", cascade =  CascadeType.ALL)
    private CollectionItem item;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;

    public CollectionItem getItem() {
        return item;
    }

    public void setItem(CollectionItem item) {
        this.item = item;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Manga: " + title + "\nby: " + author;
    }


    public int getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
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
