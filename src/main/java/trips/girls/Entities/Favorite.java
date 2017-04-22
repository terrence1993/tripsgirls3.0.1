package trips.girls.Entities;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "favorites")
public class Favorite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    private User id_user;
    @OneToOne
    private User id_dest_user;
    @Column
    private Date date_add;

    public Favorite() {
    }

    public Favorite(User id_user, User id_dest_user, Date date_add) {
        this.id_user = id_user;
        this.id_dest_user = id_dest_user;
        this.date_add = date_add;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getId_user() {
        return id_user;
    }

    public void setId_user(User id_user) {
        this.id_user = id_user;
    }

    public User getId_dest_user() {
        return id_dest_user;
    }

    public void setId_dest_user(User id_dest_user) {
        this.id_dest_user = id_dest_user;
    }

    public Date getDate_add() {
        return date_add;
    }

    public void setDate_add(Date date_add) {
        this.date_add = date_add;
    }
}
