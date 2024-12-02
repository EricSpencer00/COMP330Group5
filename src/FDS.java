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

    public void logCheckIn(String barcode, String time) {
        // Log check-in
    }
}

// class Report extends Database {
//     private int reportNumber;
//     private String type;
//     private String content;

//     public Report(int reportNumber, String type, String content) {
//         this.reportNumber = reportNumber;
//         this.type = type;
//         this.content = content;
//     }

//     public void generate() {
//         // Generate a report
//     }

//     public void sortData() {
//         // Sort data
//     }

//     public void highlightInactivity() {
//         // Highlight inactivity
//     }
// }

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
    private User recipient; // User who will receive the notification
    private Manager manager; // Manager who sent the notification

    public Notification(String type, String message, User recipient, Manager manager) {
        this.type = type;
        this.message = message;
        this.recipient = recipient;
        this.manager = manager;
    }

    public void send() {
        // Send a notification
    }

    public void schedule() {
        // Schedule a notification
    }
}

public class FDS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Hardcoded Database Initialization
        Database database = new Database();
        User user1 = new User("John Doe", "123 Main St", "123", "password", "validID", true, false);
        User user2 = new User("Jane Smith", "456 Elm St", "456", "securePassword", "validID2", true, false);
        Manager manager = new Manager("Alice Johnson", "789 Oak St", "789", "adminPassword", "validID3", 789, "Manager");

        // Adding hardcoded users to the database
        database.storeData(user1);
        database.storeData(user2);
        database.storeData(manager);

        while (true) {
            System.out.println("\n=== Gym Management System ===");
            System.out.println("1. User Check-in");
            System.out.println("2. Manager Cancel Membership");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1: // User Check-in
                    System.out.print("Enter user barcode to check-in: ");
                    String userBarcode = scanner.nextLine();
                    User foundUser = database.getData(userBarcode);

                    if (foundUser != null) {
                        System.out.println("User found: " + foundUser.getName());
                        if (!foundUser.isCheckedIn()) {
                            foundUser.checkIn();
                            System.out.println(foundUser.getName() + " successfully checked in.");
                        } else {
                            System.out.println(foundUser.getName() + " is already checked in.");
                        }
                    } else {
                        System.out.println("No user found with barcode: " + userBarcode);
                    }
                    break;

                case 2: // Manager Cancel Membership
                    System.out.println("What is your staff barcode?");
                    String staffBarcode = scanner.nextLine();
                    User staff = database.getData(staffBarcode);
                    if (staff != null) {
                        System.out.println("Staff found: " + staff.getName());
                        if (staff instanceof Manager) {
                            System.out.println("What is your password?");
                            String password = scanner.nextLine();
                            if (!staff.getUserPassword().equals(password)) {
                                System.out.println("Incorrect password. Access denied.");
                                break;
                            }
                            System.out.println("Manager verified. Proceeding to cancel membership.");
                        } else {
                            System.out.println("Staff is not a manager. Access denied.");
                            break;
                        }
                    } else {
                        System.out.println("No staff found with barcode: " + staffBarcode);
                        break;
                    }
                    System.out.print("Enter user barcode to cancel membership: ");
                    String cancelBarcode = scanner.nextLine();
                    User userToCancel = database.getData(cancelBarcode);

                    if (userToCancel != null) {
                        System.out.println("User found: " + userToCancel.getName());
                        if (userToCancel.isRegistered()) {
                            userToCancel.cancelMembership();
                            System.out.println(userToCancel.getName() + "'s membership has been canceled.");
                        } else {
                            System.out.println(userToCancel.getName() + "'s membership is already canceled.");
                        }
                    } else {
                        System.out.println("No user found with barcode: " + cancelBarcode);
                    }
                    break;

                case 3: // Exit
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}