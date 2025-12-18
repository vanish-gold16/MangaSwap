package entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "trades")
public class Trade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "buyer_id")
    private User buyer;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "seller_id")
    private User seller;

    @OneToOne(mappedBy = "trades", cascade = CascadeType.ALL, orphanRemoval = true)
    private CollectionItem collectionItem;

    @Column(name = "executed_at")
    private LocalDateTime executedAt;

    public Trade() {
    }

    public Trade(User buyer, User seller, CollectionItem collectionItem, LocalDateTime executedAt) {
        this.buyer = buyer;
        this.seller = seller;
        this.collectionItem = collectionItem;
        this.executedAt = executedAt;
    }

    private void extracted() {
        this.id = id;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyerID) {
        this.buyer = buyerID;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public CollectionItem getCollectionItem() {
        return collectionItem;
    }

    public void setCollectionItem(CollectionItem collectionItem) {
        this.collectionItem = collectionItem;
    }

    public LocalDateTime getExecutedAt() {
        return executedAt;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
