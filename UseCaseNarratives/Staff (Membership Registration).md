# Use Case Narrative Template  
*(use all fields as listed, if no information is needed for some field, enter N/A)*  

---

## Use Case:  
Staff Member works on membership registration  

**Actors:**  
Staff Member, User  

**Purpose:**  
To enroll new users to the club  

**Requirements Implemented:**  
Requirement #1  

**Overview:**  
This Use Case will help outline the steps taken for new users.  

**Type:**  
Essential  

**Preconditions:**  
- The User’s first time at the club location, not a previous member  

**Postconditions:**  
- The User has a membership account, is stored in the system database, and can access the app.  

**Special Requirements:**  
N/A  

---

## Flow of Events  

| **Actor Action** | **System Response** |
|------------------|---------------------|
| 1. The staff member creates an account for the new user ||
|| 2. The system creates a new user row in the current database with other customers. |
| 3. The user presents a valid ID, and the staff member inputs the user’s age |
|| 4. The system checks the User’s age to determine the type of membership. |
| 5. The staff member inputs billing information, birthday, contact info, and address into the system, along with a picture of the user. ||
|| 6. The system stores the provided information in data columns for the user’s profile. |
| 7. The user is prompted to create a User ID and a password ||
|| 8. The system assigns the password to pair with the User ID. The account creation process moves all collected data into the user’s account. |
| 9. A unique barcode is created and assigned to the user |
|| 10. The system generates a readable barcode, accessible through the App. |
| 11. The user downloads the app | |

---
## Alternative Flow of Events  

- **Line 4:** A User is not old enough for a membership, they will be told.
- **Line 6:** Any information that is not present can be written as "N/A"

