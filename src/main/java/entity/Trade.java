package entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "trades")
public class Trade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "buyer_id")
    private User buyerID;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "seller_id")
    private User sellerID;

    @OneToOne(mappedBy = "trades", cascade = CascadeType.ALL, orphanRemoval = true)
    private CollectionItem collectionItem;

    @Column(name = "executed_at")
    private LocalDateTime executedAt;

    public User getBuyerID() {
        return buyerID;
    }

    public void setBuyerID(User buyerID) {
        this.buyerID = buyerID;
    }

    public User getSellerID() {
        return sellerID;
    }

    public void setSellerID(User sellerID) {
        this.sellerID = sellerID;
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
