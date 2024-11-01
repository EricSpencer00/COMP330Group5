# Use Case Narrative Template  
*(Use all fields as listed; if no information is needed for some field, enter N/A)*

---

## Use Case:  
User Renewal  

**Actors:**  
Manager, User  

**Purpose:**  
Allows Users to continue their existing membership to have access to the Health Club by renewing their account through the Manager.  

**Requirements Implemented:**  
3, 4, 5  

**Overview:**  
The User will request their membership be renewed to the Manager. The Manager will renew or upgrade the User’s membership by billing their payment method on file for the next billing cycle.  

**Type:**  
Essential  

**Preconditions:**  
User is registered in the system and has an existing membership that has been canceled within the past 30 days.  

**Postconditions:**  
User successfully renews or upgrades their membership.  

**Special Requirements:**  
N/A  

---

## Flow of Events

| **Actor Action** | **System Response** |
|------------------|---------------------|
| 1. User requests renewal of membership |  |
| 2. Manager requests a valid ID or text/email code |  |
| 3. Manager requests renewal |  |
| 4. Manager requests User’s profile ||
|| 5. System requests valid ID to proceed. |
| 6. System allows Manager to proceed after a valid ID or code has been presented ||
|| 7. System changes User’s profile to active status. |
|  | 8. System confirms the payment and sends a receipt to the preferred contact method on file. |

---

## Alternative Flow of Events

| **Line** | **Details** |
|----------|-------------|
| Line 1 | User requests cancellation of their membership. |
| Line 2 | User does not have a valid ID or access to the text/email code. |
| Line 3 | Manager processes the member profile as cancellation. Member’s profile will be archived. |
| Line 4 | System will not let Manager proceed until one of the verification methods is provided. |
