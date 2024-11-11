# Use Case Narrative – Notifications

## Use Case: Staff Receives Membership Status Alert During User Check-In

**Actors**: Staff, User, System

**Purpose**: To notify staff of a user's membership status during check-in, allowing them to determine if the user is eligible to enter the facility.

**Requirements Implemented**: 4, 2, 3

### Overview
This Use Case describes the process of notifying front-desk staff of a user’s membership status when they attempt to check in. It includes actions taken when the user’s membership is valid, invalid, or unverified due to system errors.

**Type**: Essential

### Preconditions
- The user has an account within the system database.
- The user’s membership status (valid or invalid) is accessible in the database; otherwise, an error message is triggered.

### Postconditions
- **Valid membership**: The user is granted access, and the check-in is recorded in the database.
- **Invalid membership**: The staff is alerted, and if the user renews their membership, they can proceed to check in again.
- **Error**: The system sends an error message, requiring staff to verify manually or address the issue.

**Special Requirements**: N/A

## Flow of Events

| Actor Action | System Response |
|--------------|------------------|
| 1. The user approaches the front desk for check-in. | |
| 2. The user provides their ID to the system. | |
| | 3. The system checks if the membership status is valid. |
| | 4. The system sends a notification to the staff indicating that the user’s membership is invalid. |
| 5. Both staff and user receive the notification, denoting the status of the user's membership. | |
| 6. The staff checks the user’s current membership status. If invalid, the user has the option to renew their membership and enter; otherwise, the process is terminated. | |
| 7. The staff allows the user, completing the check-in process. | |

## Alternative Flow of Events

**Line 6**: If the user’s membership is invalid, and they decide not to renew their membership:
- The system maintains the user’s status as invalid.
- The check-in process is terminated, and the user is not granted access.

**Line 3**: If the system is unable to verify the user’s membership status due to technical issues:
- The system sends an error message to the staff.
- The staff may perform a manual lookup in the system using the user’s name and birthday.
