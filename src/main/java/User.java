import org.hibernate.annotations.Table;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Table(name = "Users")
public class User {
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }


}
