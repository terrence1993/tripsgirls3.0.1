package trips.girls.Entities;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users_deleted")
public class User_deleted {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    private User id_user;
    @Column
    private String nickname;
    @Column
    private String fname;
    @Column
    private String sname;
    @Column
    private String email;
    @Column
    private Date date_deleted;

    public User_deleted() {
    }

    public User_deleted(User id_use, String nickname, String fname, String sname, String email, Date date_deleted) {
        this.id_user = id_use;
        this.nickname = nickname;
        this.fname = fname;
        this.sname = sname;
        this.email = email;
        this.date_deleted = date_deleted;
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate_deleted() {
        return date_deleted;
    }

    public void setDate_deleted(Date date_deleted) {
        this.date_deleted = date_deleted;
    }
}
