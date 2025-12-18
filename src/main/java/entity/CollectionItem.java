package entity;

import javax.persistence.*;

@Entity
@Table(name = "items")
public class CollectionItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "manga_id")
    private int mangaID;

    @Column(name = "for_trade")
    private boolean forTrade;

    @OneToOne
    @JoinColumn(name = "manga_id")
    private Manga manga;

    @Column(name = "price")
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Manga getManga() {
        return manga;
    }

    public void setManga(Manga manga) {
        this.manga = manga;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMangaID() {
        return mangaID;
    }

    public void setMangaID(int mangaID) {
        this.mangaID = mangaID;
    }

    public boolean isForTrade() {
        return forTrade;
    }

    public void setForTrade(boolean forTrade) {
        this.forTrade = forTrade;
    }
}
