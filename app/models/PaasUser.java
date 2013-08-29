package models;

import javax.persistence.*;
import play.db.ebean.*;

/**
 * Created with IntelliJ IDEA.
 * PaasUser: fdong
 * Date: 8/29/13
 * Time: 10:25 AM
 * To change this template use File | Settings | File Templates.
 */

@Entity
public class PaasUser extends Model {

    @Id
    public long id;

    public String firstName;
    public String lastName;
    public String password;
    public String email;

    public PaasUser(String firstName, String lastName, String password, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
    }

    public static Finder<String, PaasUser> find = new Finder<String, PaasUser>(
            String.class, PaasUser.class
    );
}
