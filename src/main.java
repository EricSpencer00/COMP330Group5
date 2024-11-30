/**
 * 
 * This class will be the functions that will be used to run the program
 * The Gym Check-in System will have various functions used to perform operations on the database
 */

import java.util.*;

class User {
    private String name;
    private String address;
    private String userID;
    private String userPassword;
    private String validID;
    private boolean isRegistered;
    private boolean isCheckedIn;

    public User(String name, String address, String userID, String userPassword, String validID, boolean isRegistered, boolean isCheckedIn) {
        this.name = name;
        this.address = address;
        this.userID = userID;
        this.userPassword = userPassword;
        this.validID = validID;
        this.isRegistered = isRegistered;
        this.isCheckedIn = false;
    }

    public void register() {
        if (!isRegistered) {
            // Register a new user
            isRegistered = true;
        } else {
            System.out.println("User is already registered");
        }
    }

    public void checkIn() {
        if (isRegistered && !isCheckedIn) {
            // Check in a user
            isCheckedIn = true;
        } else {
            System.out.println("User is not registered or is already checked in");
        }
    }

    public void cancelMembership() {
        if  (isRegistered) {
            // Cancel a user's membership
            isRegistered = false;
        } else {
            System.out.println("User is not registered");
        }
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

    public boolean isRegistered() {
        return isRegistered;
    }

    public boolean isCheckedIn() {
        return isCheckedIn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setUserID(String  userID) {
        this.userID = userID;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setValidID(String validID) {
        this.validID = validID;
    }

    public void setRegistered(boolean isRegistered) {
        this.isRegistered = isRegistered;
    }

    public void setCheckedIn(boolean isCheckedIn) {
        this.isCheckedIn = isCheckedIn;
    }
}

class Staff extends User {
    private int staffID;
    private String role;

    public Staff(String name, String address, String userID, String userPassword, String validID, int staffID, String role, boolean isRegistered, boolean isCheckedIn) {
        super(name, address, userID, userPassword, validID, true, false);
        this.staffID = staffID;
        this.role = role;
    }

    public void registerMember() {
        // Register a new member
    }

    public void verifyID() {
        // Verify the ID of a user
    }

    public void manageAccount() {
        // Change user data
    }
}

class Manager extends Staff {
    public Manager(String name, String address, String userID, String userPassword, String validID, int staffID, String role) {
        super(name, address, userID, userPassword, validID, staffID, role, true, false);
    }

    public void generateReport() {
        // Generate a report
    }

    public void manageNotif() {
        // Manage notifications
    }
}

class Database {
    private final List<User> users = new ArrayList<>();
    private final List<Membership> memberships = new ArrayList<>();
    private final List<Notification> notifications = new ArrayList<>();

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
        // Use Case 1: User Check-in
        System.out.println("=== Use Case 1: User Check-in ===");
        User user = new User("John Doe", "123 Main St", "123", "password", "validID", false, false);

        System.out.println("Registering user: " + user.getName());
        user.register();

        System.out.println("Checking in user: " + user.getName());
        user.checkIn();
        System.out.println(user.getName() + "'s check-in status: " + user.isCheckedIn());

        System.out.println("\n=== End of Use Case 1 ===\n");

        // Use Case 2: Manager Cancels User Membership
        System.out.println("=== Use Case 2: Manager Cancels User Membership ===");
        Manager manager = new Manager("John Smith", "789 Main St", "789", "password", "validID", 123, "manager");
        
        System.out.println("Manager " + manager.getName() + " is canceling membership for user: " + user.getName());
        if (user.isRegistered()) {
            user.cancelMembership();
        } else {
            System.out.println("Membership already canceled or user not registered.");
        }
        System.out.println(user.getName() + " is registered: " + user.isRegistered());

        System.out.println("\n=== End of Use Case 2 ===");
    }
}