# Use Case Narrative Template  
*(use all fields as listed, if no information is needed for some field, enter N/A)*

---

## Use case: 
User registers for the club through a Staff member  

**Actors:**  
User, Staff  

**Purpose:**  
To enroll new users into the club  

**Requirements Implemented:**  
1  

**Overview:**  
New users will be registered with the club’s System through this process  

**Type:**  
Essential  

**Preconditions:**  
User knows their information, User has not been registered before  

**Postconditions:**  
The User has an account with the System. Now they can log into any System  

**Special Requirements:**  
N/A  

---

## Flow of Events

| **Actor Action** | **System Response** |
|------------------|---------------------|
| 1. The User will approach a Staff member |  |
| 2. The Staff will have them registered by prompting the System for a new User. | 2. The System will provide a template for data to be entered |
| 3. The User will provide their information. |  |
| 4. The Staff will enter the data into the System | 4. The System will accept the data |
|  | 5. The System will confirm the new User’s data, along with new information |

---

## Alternative Flow of Events

- **Line 3:** The User will claim that they do not need to give this information, they will be kicked out.  
- **Line 4:** The System will accept nonessential data (such as Address and phone number) as “N/A” into the info boxes.  
- **Line 5:** The System will give an error, such as it is identical to an existing User entry.
