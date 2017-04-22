package trips.girls.Entities;
import javax.persistence.*;

@Entity
@Table(name = "user_type")
public class User_type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String sex;
}
