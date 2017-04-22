package trips.girls.Entities;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users_site_visit")
public class User_site_visit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    private User id_user;
    @Column
    private Date date;
}
