package entity;

import javax.persistence.*;

@Entity
@Table(name = "offers")
public class Offer {

    @Id
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "item_id")
    private CollectionItem collectionItem;

    @OneToOne()
    @JoinColumn(name = "manga_id")
    private Manga manga;

    @ManyToOne
    @JoinColumn(name = "from_user_id")
    private User fromUser;

    @ManyToOne
    @JoinColumn(name = "to_user_id")
    private User toUser;

    @Column(name = "offer_status")
    private boolean offerStatus;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}
