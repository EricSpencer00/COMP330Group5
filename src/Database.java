import java.util.List;

public class Database {
    private List<User> users;
    private List<Membership> members;
    private List<Notification> notification;

    public Database(List<User> users, List<Membership> members, List<Notification> notification) {
        this.users = users;
        this.members = members;
        this.notification = notification;
    }

    public void storeData() {

    }

    public User getData() {
        return null;
    }

    public void archive() {

    }
}
