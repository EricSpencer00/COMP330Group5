# Manager Membership Cancellation

**Actors:**  
Manager, Actor  

**Purpose:**  
To allow managers to easily cancel member subscriptions, keeping records accurate and notifying members of any changes. This helps maintain smooth and organized membership management.  

**Requirements Implemented:**  
3, 4  

**Overview:**  
This use case allows managers to handle cancellations effectively. Managers can access member information, approve or process cancellation requests, and update the system to reflect the member’s current status. The system sends notifications to members about any changes to ensure they are informed and that membership records are kept up to date.  

**Type:**  
Essential  

**Preconditions:**  
1. The manager is logged into the system.  
2. Member information (e.g., membership status, expiration date) is up to date in the system.  

**Postconditions:**  
1. Membership status is updated to reflect cancellation.  
2. Member receives a confirmation regarding the cancellation.  
3. The system logs the cancellation for tracking and future reference.  

**Special Requirements:**  
1. Access Membership Management  
2. View member details including payments made or not made.   
3. Process cancellations  
4. Send notifications  
5. Log actions  

---

## Flow of Events

| **Actor Action** | **System Response** |
|------------------|---------------------|
| 1. Manager logs into the system and navigates to the “Membership Management” section ||
|| 2. The system displays a list of active memberships and allows for search of members through ID. |
| 3. Manager searches for a specific member’s details ||
|| 4. The system displays the member’s current details, including contact information and current membership status. |
| 5. Manager chooses to cancel the membership ||
|| 6.  The system processes the or cancellation request. ||
| 7. The system updates the member’s status in the database, reflecting the cancellation ||
|| 8. The system sends a confirmation notification to the member regarding the cancellation of their membership. |
|| 9. The system logs the action taken by the manager for future reference | |

---

## Alternative Flow of Events

| **Line** | **Details** |
|----------|-------------|
| **A1. Member Not Found** |  |
| Line 1 | The manager attempts to search for a member, but the system cannot locate the member. |
| Line 3 | The system displays a message indicating that the member is not found. |
| Line 5 | The manager verifies the member's information or searches again. |
| Line 5 | Manager chooses to renew membership. | 
| **A2. Membership Already Inactive** |  |
| Line 1 | The manager selects a member whose membership is already marked as inactive. |
| Line 3 | The system notifies the manager that the membership is not eligible for cancellation. |
| Line 5 | The manager may return to the main menu or select a different member. |
