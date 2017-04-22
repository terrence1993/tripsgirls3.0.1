package trips.girls.Entities;
import javax.persistence.*;

@Entity
@Table(name = "countries")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String code;
    @Column
    private String name;
    @Column
    private Double areainsqkm;
    @Column
    private String continent;
    @Column
    private String currency;

    public Country() {
    }

    public Country(String code, String name, Double areainsqkm, String continent, String currency) {
        this.code = code;
        this.name = name;
        this.areainsqkm = areainsqkm;
        this.continent = continent;
        this.currency = currency;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAreainsqkm() {
        return areainsqkm;
    }

    public void setAreainsqkm(Double areainsqkm) {
        this.areainsqkm = areainsqkm;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
