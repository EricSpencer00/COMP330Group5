# Use Case Narrative – User Renewal  

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
The User will request their membership to be renewed by the Manager. The Manager will renew or upgrade the User’s membership by billing their payment method on file for the next billing cycle.  

**Type:**  
Essential  

**Preconditions:**  
- User is registered in the System and has an existing Membership that has been canceled within the past 30 days.  

**Postconditions:**  
User successfully renews or upgrades their membership.  

**Special Requirements:**  
<<anything else, e.g., performance>>  

---

## Flow of Events  

| **Actor Action** | **System Response** |
|------------------|---------------------|
| User requests renewal of membership | |
| Manager requests a valid ID or text/email code | |
| Manager requests renewal | System requests valid ID to proceed. |
| Manager requests User’s profile | System allows Manager to proceed after a valid ID or code has been presented. |
| | System changes User’s profile to active status. System will confirm the payment and send a receipt to the preferred contact method on file. |

---

## Alternative Flow of Events  

- **Line 1:** User requests cancellation of their membership.  
- **Line 2:** User does not have a Valid ID or access to the text/email code.  
- **Line 1:** Manager processes member profile as a cancellation. The member’s profile will be archived.  
- **Line 2:** System will not let the Manager proceed until one of the verification methods is provided.  

---

### Source  
Stumpf and Teague, *Object-Oriented Systems Analysis and Design with UML*, as modified by W.L. Honig for University of Chicago, version 3 (adding requirements traceability links) Fall 2021.
