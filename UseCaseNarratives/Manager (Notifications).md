# Use Case Narrative – Inactivity Alerts

## Use Case: Manager Receives Notifications for User Renewal

**Actors**: Manager, User, System

**Purpose**: Allows managers to be notified when users need to renew their memberships, facilitating the renewal process to grant users continued access to the Health Club.

**Requirements Implemented**: 4, 3

### Overview
This Use Case describes how the system notifies the manager when a user's membership is approaching expiration or has been canceled within the past 30 days. It outlines the steps the manager takes to renew or upgrade the user's membership by billing their payment method on file for the next billing cycle.

**Type**: Essential

### Preconditions
- The user is registered in the system.
- The user has an existing membership that is about to expire or has been canceled within the past 30 days.
- The system is capable of tracking membership statuses and expiration dates.

### Postconditions
- The user's membership is successfully renewed or upgraded.
- The system records the renewal and sends a receipt to the user's preferred contact method.
- The user regains or continues access to the Health Club facilities.

**Special Requirements**: N/A

## Flow of Events

| Actor Action | System Response |
|--------------|------------------|
| | 1. The system continuously monitors each user’s check-in activity. |
| | 2. The system identifies users who have not checked in for 30 consecutive days. |
| | 3. The system generates a list of these inactive users. |
| | 4. The system sends a notification to the manager, providing a list of users who have been inactive for 30 days along with their contact information. |
| 5. The manager reviews the list of inactive users. | |
| 6. The manager decides to follow up with selected users using the contact methods the system provides (e.g., email, phone). | |
| 7. The manager contacts users to encourage their re-engagement with the Health Club. | |

## Alternative Flow of Events

**Line 3**: If the manager does not receive notifications due to a system error:
- The manager manually checks the system for memberships nearing expiration.
- The system generates a report of users needing renewal.

**Line 6**: If the user declines to renew their membership:
- The manager notes the user's decision in the system.
- The system maintains the user's membership status as expired or canceled.
- The user loses access to the Health Club facilities until they choose to renew.

---
