package models;

import javax.persistence.*;
import play.db.ebean.*;

/**
 * Created with IntelliJ IDEA.
 * Users: fdong
 * Date: 8/29/13
 * Time: 10:25 AM
 * To change this template use File | Settings | File Templates.
 */

@Entity
public class Users extends Model {

    @Id
    public String email;

    public String firstName;
    public String lastName;
    public String password;


    public Users(String email, String firstName, String lastName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
    }

    public static Finder<String, Users> find = new Finder<String, Users>(
            String.class, Users.class
    );

    public static Users authenticate(String email, String password) {
        if (email == "GUEST")
            return new Users("GUEST", "GUEST", "GUEST", "");
        else
            return find.where().eq("email", email)
                .eq("password", password).findUnique();
    }
}
