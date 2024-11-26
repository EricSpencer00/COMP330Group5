/**
 * 
 * This class will be the functions that will be used to run the program
 * The Gym Check-in System will have various functions used to perform operations on the database
 */

class User {
    private String name;
    private String address;
    private int userID;
    private String userPassword;
    private String validID;

    public User(String name, String address, String userID, String userPassword, String validID) {
        this.name = name;
        this.address = address;
        this.userID = userID;
        this.userPassword = userPassword;
        this.validID = validID;
    }

    public void register() {
        // Register a new user
    }

    public void checkIn() {
        // Check in a user
    }

    public void cancelMembership() {
        // Cancel a user's membership
    }


    // Getters and Setters 
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getUserID() {
        return userID;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getValidID() {
        return validID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setValidID(String validID) {
        this.validID = validID;
    }
}

class Staff extends User {
    private int staffID;
    private String role;

    public Staff(String name, String address, String userID, String userPassword, String validID, int staffID, String role) {
        super(name, address, userID, userPassword, validID);
        this.staffID = staffID;
        this.role = role;
    }

    public void registerMember() {
        // Register a new member
    }

    public boolean verifyID() {
        // Verify the ID of a user
    }

    public void manageAccount() {
        // Change user data
    }
}

class Manager extends Staff {
    public Manager(String name, String address, String userID, String userPassword, String validID, int staffID, String role) {
        super(name, address, userID, userPassword, validID, staffID, role);
    }

    public void generateReport() {
        // Generate a report
    }

    public void manageNotif() {
        // Manage notifications
    }
}

class Database {
    private List<User> users = new ArrayList<User>();
    private List<Membership> memberships = new ArrayList<Membership>();
    private List<Notification> notifications = new ArrayList<Notification>();

    public void storeData(User user) {
        users.add(user);
    }

    public User getData(String userID) {
        for (User user : users) {
            if (user.getUserID().equals(userID)) {
                return user;
            }
        }
        return null;
    }

    public void archive() {
        // Archive data
    }
}

class Report extends Database {
    private int reportNumber;
    private String type;
    private String content;

    public Report(int reportNumber, String type, String content) {
        this.reportNumber = reportNumber;
        this.type = type;
        this.content = content;
    }

    public void generate() {
        // Generate a report
    }

    public void sortData() {
        // Sort data
    }

    public void highlightInactivity() {
        // Highlight inactivity
    }
}

class Membership extends Database {
    private int barcode;
    private String accountType;
    private String status;
    private String expiration;

    public Membership(int barcode, String accountType, String status, String expiration) {
        this.barcode = barcode;
        this.accountType = accountType;
        this.status = status;
        this.expiration = expiration;
    }

    public void method(String type) {
        // Method
    }
}

class Notification extends Database {
    private String type;
    private String message;
    private User recipient;

    public Notification(String type, String message, User recipient) {
        this.type = type;
        this.message = message;
        this.recipient = recipient;
    }

    public void send() {
        // Send a notification
    }

    public void schedule() {
        // Schedule a notification
    }
}

public class Main {
    public static void main(String[] args) {
        User user = new User("John Doe", "123 Main St", "123", "password", "validID");
        user.register();
        Staff staff = new Staff("Jane Doe", "456 Main St", "456", "password", "validID", 789, "staff");
        Manager manager = new Manager("John Smith", "789 Main St", "789", "password", "validID", 123, "manager");
        staff.registerMember();

        Database database = new Database();
        database.storeData(user);
        database.storeData(staff);
        database.storeData(manager);
    
        User retrievedUser = database.getData("123");
        System.out.println(retrievedUser.getName());
    }
}