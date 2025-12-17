package Entity;

import javax.persistence.*;

@Entity
@Table(name = "offers")
public class Offer {

    @Id
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "")
    private

    @OneToOne(mappedBy = "mangas", cascade = CascadeType.ALL)
    private Manga manga;

    @Column(name = "from_user_id")
    private User fromUser;

    @Column(name = "to_user_id")
    private User toUser;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}
