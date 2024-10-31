# Manager Membership Renewal or Cancellation

**Actors:**  
Manager, Actor  

**Purpose:**  
To allow managers to easily renew or cancel member subscriptions, keeping records accurate and notifying members of any changes. This helps maintain smooth and organized membership management.  

**Requirements Implemented:**  
3, 4  

**Overview:**  
This use case allows managers to handle renewals and cancellations effectively. Managers can access member information, approve or process renewal and cancellation requests, and update the system to reflect the member’s current status. The system sends notifications to members about any changes to ensure they are informed and that membership records are kept up to date.  

**Type:**  
Essential  

**Preconditions:**  
1. The manager is logged into the system.  
2. Member information (e.g., membership status, expiration date) is up to date in the system.  

**Postconditions:**  
1. Membership status is updated to reflect renewal or cancellation.  
2. Member receives a confirmation regarding the renewal or cancellation.  
3. The system logs the renewal or cancellation for tracking and future reference.  

**Special Requirements:**  
1. Access Membership Management  
2. View member details including payments made or not made.  
3. Process renewals  
4. Process cancellations  
5. Send notifications  
6. Log actions  

---

## Flow of Events

| **Actor Action** | **System Response** |
|------------------|---------------------|
| 1. Manager logs into the system and navigates to the “Membership Management” section | The system displays a list of active memberships and allows for search of members through ID. |
| 2. Manager searches for a specific member’s details | The system displays the member’s current details, including contact information and current membership status. |
| 3. Manager chooses to renew or cancel the membership | The system processes the renewal or cancellation request. |
| 4. The system updates the member’s status in the database, reflecting the renewal or cancellation | The system sends a confirmation notification to the member regarding the renewal or cancellation of their membership. |
| 5. The system logs the action taken by the manager for future reference | |

---

## Alternative Flow of Events

| **Line** | **Details** |
|----------|-------------|
| **A1. Member Not Found** |  |
| Line 1 | The manager attempts to search for a member, but the system cannot locate the member. |
| Line 2 | The system displays a message indicating that the member is not found. |
| Line 3 | The manager verifies the member's information or searches again. |
| **A2. Membership Already Inactive** |  |
| Line 1 | The manager selects a member whose membership is already marked as inactive. |
| Line 2 | The system notifies the manager that the membership is not eligible for renewal or cancellation. |
| Line 3 | The manager may return to the main menu or select a different member. |
