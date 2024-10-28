# Use Case Narrative Template  
*(use all fields as listed, if no information is needed for some field, enter N/A)*  

---

## Use Case:  
Staff Member facilitates user check-in  

**Actors:**  
Staff Member, User  

**Purpose:**  
The staff member will oversee check-in by user scan-in process.  

**Requirements Implemented:**  
Requirement 2  

**Overview:**  
This Use Case describes the process for a staff member to check in a user, including barcode scanning, identity verification through a photo, and membership status validation.  

**Type:**  
Essential  

**Preconditions:**  
- The user has a valid membership with a valid barcode.  
- The staff member is signed into the system.  

**Postconditions:**  
The check-in will be recorded, and the members will be able to access the club.  

**Special Requirements:**  
N/A  

---

## Flow of Events  

| **Actor Action** | **System Response** |
|------------------|---------------------|
| 1. The user presents their barcode to the staff member at the front desk. | 2. The system scans the barcode and retrieves the user’s data from the database. |
| 3. The staff member confirms the user’s identity by matching the on-screen photo with the user. | 4. The system displays the user’s photo on the screen using database information. |
| 5. The staff member checks the status of the user’s account. | 6. The system presents the account status on the screen. |
| | 7. If valid, the screen will display green. |
| | 8. If invalid, the screen will display an error with the reason for the error. |

---

## Alternative Flow of Events  

- **Line 2:** The barcode is unreadable or not working. The user will be called back to the desk, and the staff member will search for the user in the system using their name and birthday.  
- **Line 6:** If the membership is expired or invalid, the system displays an error message and prevents check-in.  

---

