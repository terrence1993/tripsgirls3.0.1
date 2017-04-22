package trips.girls.Entities;
import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "users_views")
public class User_views {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    private User id_user;
    @OneToOne
    private User id_viewer;
    @Column
    private Date view_date;

    public User_views() {
    }

    public User_views(User id_user, User id_viewer, Date view_date) {
        this.id_user = id_user;
        this.id_viewer = id_viewer;
        this.view_date = view_date;
    }

    public User getId_user() {
        return id_user;
    }

    public void setId_user(User id_user) {
        this.id_user = id_user;
    }

    public User getId_viewer() {
        return id_viewer;
    }

    public void setId_viewer(User id_viewer) {
        this.id_viewer = id_viewer;
    }

    public Date getView_date() {
        return view_date;
    }

    public void setView_date(Date view_date) {
        this.view_date = view_date;
    }
}
