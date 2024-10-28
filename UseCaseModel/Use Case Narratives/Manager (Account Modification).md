# Use Case Narrative Template  
*(use all fields as listed, if no information is needed for some field, enter N/A)*

---

## Use Case:  
Account Management  

**Actors:**  
Manager, User  

**Purpose:**  
To modify users’ accounts by the Manager  

**Requirements Implemented:**  
5, 4, 3  

**Overview:**  
A Manager will have access to the official database to modify and delete users’ data  

**Type:**  
Essential  

**Preconditions:**  
Manager knows who the User is; if they don’t, they can search them up by ID. Information must be in correct syntax  

**Postconditions:**  
A User’s data is changed  

**Special Requirements:**  
N/A  

---

## Flow of Events

| **Actor Action** | **System Response** |
|------------------|---------------------|
| 1. User requests data to be changed | |
| 2. Manager approves request | |
| 3. Manager enters the change to the System knowing which one to change | 4. The System confirms the request |

---

## Alternative Flow of Events

- **Line 1:** User requests data to be deleted. Manager accepts the request.  
- **Line 2:** Manager denies request; User is notified.  
- **Line 3:** Manager does not know the Customer name / is ambiguous, so they will use an ID number instead.  
- **Line 4:** Manager enters a command incorrectly into the System, producing an error.
