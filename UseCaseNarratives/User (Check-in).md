# Use Case Narrative – User Check-in  

---

## Use Case:  
User Check-in  

**Actors:**  
Manager, User  

**Purpose:**  
Allows Users to access the Health Club and renew their membership in the System through a Manager.  

**Requirements Implemented:**  
2  

**Overview:**  
The User will enter the club and scan their MemberID at the front desk. The User’s profile will be logged, and the user will be granted entry to the Health Club.  

**Type:**  
Essential  

**Preconditions:**  
- User is registered in the System and has been assigned a MemberID.  
- User has the MemberID physically in their possession at the time of entry.  

**Postconditions:**  
User is recognized by the System and successfully enters the Health Club.  

**Special Requirements:**  
<<anything else, e.g., performance>>  

---

## Flow of Events  

| **Actor Action** | **System Response** |
|------------------|---------------------|
| 1. User physically scans MemberID at the Health Club front desk. | |
||2. System logs User’s profile with a time and date stamp. System retrieves and displays User’s profile photo. |
|| 3. System logs User’s profile with a time and date stamp. 
|| 4. System retrieves and displays User’s profile photo. |

---

## Alternative Flow of Events  

- **Line 1:** User is not recognized by the System.  
- **Line 1:** System displays an error message that the MemberID is invalid.  
- **Line 1:** Manager can also signin a User
- **Line 1:** User checks in by telling staff their ID number, full name, or other distinguishing characteristic.  

