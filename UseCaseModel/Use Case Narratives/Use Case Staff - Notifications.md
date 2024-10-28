# Staff (Notifications) - Membership Status Alert
* Actors: Staff, User
* This use case describes the notification process when a user tries to check-in, where notifications are sent to the front-desk staff, denoting their current membership status.

# Preconditions:
- User has an account within the database.
- User’s status is accessible in the database (valid or invalid), else the staff will receive an error.

# Flow Scenario:
1. User approaches check-in at the front desk.
2. The user provides their ID.
3.The system verifies the status.
4. If the status is valid:
  * Notification is sent to staff at the check-in desk that the user can enter.
  * Staff allows the user to enter, completing the process.
5. If the status is not valid:
  * Notification is sent to staff at the check-in desk that the user can enter.
  * Users receive notification to renew their membership.
  * Repeat from step 2 if the user renewed their membership.
6. If the system is unable to verify membership status, an error message is sent.

# Postconditions:
- For valid membership, the user is allowed access, and the check-in is stored in the database.
- For invalid memberships, the system alerts the staff, but if the user renews their membership, they can check-in again.

