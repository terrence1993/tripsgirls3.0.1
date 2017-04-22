package trips.girls.Entities;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users_viewers")
public class User_viewers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    private User id_user;
    @OneToOne
    private User id_viewer;
    @Column
    private Integer is_new;
    @Column
    private Date view_date;

    public User_viewers() {
    }

    public User_viewers(User id_user, User id_viewer, Integer is_new, Date view_date) {
        this.id_user = id_user;
        this.id_viewer = id_viewer;
        this.is_new = is_new;
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

    public Integer getIs_new() {
        return is_new;
    }

    public void setIs_new(Integer is_new) {
        this.is_new = is_new;
    }

    public Date getView_date() {
        return view_date;
    }

    public void setView_date(Date view_date) {
        this.view_date = view_date;
    }
}
