# Use Case Narrative Template  
*(Use all fields as listed; if no information is needed for some field, enter N/A)*

---

## Use Case:  
Membership Registration  

**Actors:**  
User, Manager  

**Purpose:**  
To handle errors with the registration process using the manager  

**Requirements Implemented:**  
1  

**Overview:**  
The Manager will access the system to address and correct errors within the registration process  

**Type:**  
Essential  

**Preconditions:**  
Manager needs access to the system and reports  

**Postconditions:**  
User will have a membership, and errors with the registration process will be resolved  

**Special Requirements:**  
N/A  

---

## Flow of Events

| **Actor Action** | **System Response** |
|------------------|---------------------|
| 1. User starts the registration process | |
| 2. System encounters an error during the registration process | |
| 3. User encounters an error with the registration process | 3. System reports the error to the manager or staff | |
| 5. Manager accesses the system to fix the issue | |
| | 6. System registers the user and completes the registration process |

---

## Alternative Flow of Events

- **Line 4:** If staff cannot fix the issue, the manager gets involved.  
- **Line 5:** Manager is unable to fix the problem, and the system itself might need adjustments.  
- **Line 6:** Issue might resolve itself or may be impossible to fix due to an invalid user ID or other critical information.  

---

### Source:  
Stumpf and Teague, *Object-Oriented Systems Analysis and Design with UML*, modified by W.L. Honig for the University of Chicago, version 3 (adding requirements traceability links), Fall 2021.
