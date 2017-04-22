package trips.girls.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "like_counts")
public class Like_count implements Serializable {
    @Id
    @OneToOne
    private Like id;
    @Column
    private long count;

    public Like_count() {
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Like_count(Like id, long count) {
        this.id = id;
        this.count = count;
    }

    public Like getId() {
        return id;
    }

    public void setId(Like id) {
        this.id = id;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
