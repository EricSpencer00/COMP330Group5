public class Person
{
    public int UVID { get; set; }
    public int barcode { get; set; } 

    // Define an enum for Admin roles
    public enum AdminRole
    {
        Customer = 1,
        Staff = 2,
        Manager = 3
    }
    public AdminRole Admin { get; set; } // 1 = Customer, 2 = Staff, 3 = Manager
    
    public enum Status
    {
        Active = 1,
        Inactive = 2,
        Suspended = 3 // Adjust based on your requirements
    }
    public Status PersonStatus { get; set; }

    public string FirstName { get; set; }
    public string LastName { get; set; }
    public DateTime Birthday? { get; set; } // Format MM/DD/YYYY handled via DateTime

    public string Email? { get; set; }
    public string Phone? { get; set; }
    public string Address? { get; set; }

    public DateTime DateCreated { get; set; } // DateTime type is suitable for MM/DD/YYYY
    public DateTime? LastCheckedIn { get; set; } // Nullable DateTime to allow for missing check-ins
}
