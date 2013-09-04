import models.*;


import org.junit.*;
import static org.junit.Assert.*;
import play.test.WithApplication;
import static play.test.Helpers.*;

/**
 * Created with IntelliJ IDEA.
 * User: fdong
 * Date: 9/4/13
 * Time: 11:52 AM
 * To change this template use File | Settings | File Templates.
 */
public class UsersTest extends WithApplication {
    @Before
    public void setUp() {
        start(fakeApplication());
    }

    @Test
    public void createAndRetrieveUser() {
        new Users("bob@gmail.com", "Bob", "Lee", "secret").save();
        Users bob = Users.find.where().eq("email", "bob@gmail.com").findUnique();
        assertNotNull(bob);
        assertEquals("Bob", bob.firstName);
    }
}
