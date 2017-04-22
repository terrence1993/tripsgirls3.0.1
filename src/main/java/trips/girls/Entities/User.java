package trips.girls.Entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.*;

import org.jboss.aerogear.security.otp.api.Base32;

@Entity
@Table(name = "user_account")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    @Column(length = 60)
    private String password;
    private boolean enabled;
    private String secret;
    @OneToOne
    @JoinTable(name = "user_type", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "user_type_id", referencedColumnName = "id"))
    private User_type gender; //or sex//
    @Column
    private String user_looking_type;
    @Column
    private Integer approved; //approve by moderator//
    @Column
    private String user_main_photo;
    @OneToOne
    private City id_city;
    @OneToOne
    private Region id_region;
    @OneToOne
    private Country id_country;
    @Column
    private String phone;
    @Column
    private Date birth_day;
    @Column
    private Integer age;//user age
    @Column
    private Integer age_min;//user looking users from this age to
    @Column
    private Integer age_max;// this age
    @Column
    private Date date_created;
    @Column
    private Date date_modified;
    @Column
    private Integer views_count;
    @Column
    private Date activated_end_date;
    @Column
    private Integer online_status;
    @Column
    private Date date_last_activity;
    @Column
    private Integer raiting_count;
    @Column
    private Double rating_value;
    //

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public User_type getGender() {
        return gender;
    }

    public void setGender(User_type gender) {
        this.gender=gender;
    }

    public String getUser_looking_type() {
        return user_looking_type;
    }

    public void setUser_looking_type(String user_looking_type) {
        this.user_looking_type = user_looking_type;
    }

    public Integer getApproved() {
        return approved;
    }

    public void setApproved(Integer approved) {
        this.approved = approved;
    }

    public String getUser_main_photo() {
        return user_main_photo;
    }

    public void setUser_main_photo(String user_main_photo) {
        this.user_main_photo = user_main_photo;
    }

    public City getId_city() {
        return id_city;
    }

    public void setId_city(City id_city) {
        this.id_city = id_city;
    }

    public Region getId_region() {
        return id_region;
    }

    public void setId_region(Region id_region) {
        this.id_region = id_region;
    }

    public Country getId_country() {
        return id_country;
    }

    public void setId_country(Country id_country) {
        this.id_country = id_country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirth_day() {
        return birth_day;
    }

    public void setBirth_day(Date birth_day) {
        this.birth_day = birth_day;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge_min() {
        return age_min;
    }

    public void setAge_min(Integer age_min) {
        this.age_min = age_min;
    }

    public Integer getAge_max() {
        return age_max;
    }

    public void setAge_max(Integer age_max) {
        this.age_max = age_max;
    }

    public Date getDate_created() {
        return date_created;
    }

    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }

    public Date getDate_modified() {
        return date_modified;
    }

    public void setDate_modified(Date date_modified) {
        this.date_modified = date_modified;
    }

    public Integer getViews_count() {
        return views_count;
    }

    public void setViews_count(Integer views_count) {
        this.views_count = views_count;
    }

    public Date getActivated_end_date() {
        return activated_end_date;
    }

    public void setActivated_end_date(Date activated_end_date) {
        this.activated_end_date = activated_end_date;
    }

    public Integer getOnline_status() {
        return online_status;
    }

    public void setOnline_status(Integer online_status) {
        this.online_status = online_status;
    }

    public Date getDate_last_activity() {
        return date_last_activity;
    }

    public void setDate_last_activity(Date date_last_activity) {
        this.date_last_activity = date_last_activity;
    }

    public Integer getRaiting_count() {
        return raiting_count;
    }

    public void setRaiting_count(Integer raiting_count) {
        this.raiting_count = raiting_count;
    }

    public Double getRating_value() {
        return rating_value;
    }

    public void setRating_value(Double rating_value) {
        this.rating_value = rating_value;
    }

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
    private Collection<Role> roles;

    public User() {
        super();
        this.secret = Base32.random();
        this.enabled = false;
    }

    public User(String firstName, String lastName, String email, String password, boolean enabled, String secret, User_type gender, String user_looking_type, Integer approved, String user_main_photo, City id_city, Region id_region, Country id_country, String phone, Date birth_day, Integer age, Integer age_min, Integer age_max, Date date_created, Date date_modified, Integer views_count, Date activated_end_date, Integer online_status, Date date_last_activity, Integer raiting_count, Double rating_value, Collection<Role> roles) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.enabled = enabled;
        this.secret = secret;
        this.gender = gender;
        this.user_looking_type = user_looking_type;
        this.approved = approved;
        this.user_main_photo = user_main_photo;
        this.id_city = id_city;
        this.id_region = id_region;
        this.id_country = id_country;
        this.phone = phone;
        this.birth_day = birth_day;
        this.age = age;
        this.age_min = age_min;
        this.age_max = age_max;
        this.date_created = date_created;
        this.date_modified = date_modified;
        this.views_count = views_count;
        this.activated_end_date = activated_end_date;
        this.online_status = online_status;
        this.date_last_activity = date_last_activity;
        this.raiting_count = raiting_count;
        this.rating_value = rating_value;
        this.roles = roles;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + ((email == null) ? 0 : email.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User user = (User) obj;
        if (!email.equals(user.email)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("User [id=").append(id).append(", firstName=").append(firstName).append(", lastName=").append(lastName).append(", email=").append(email).append(", password=").append(password).append(", enabled=").append(enabled)
                .append(", secret=").append(secret).append(", roles=").append(roles).append("]");
        return builder.toString();
    }

}