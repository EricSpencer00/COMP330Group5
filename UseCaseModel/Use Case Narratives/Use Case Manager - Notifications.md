# Manager (Notifications) - Inactivity Alerts
* Actors: Manager, System
* This use case covers notifications sent to the manager when users have been inactive for a period of 30 days.

# Preconditions:
* Users’ check-in data is stored in the database.
* The system tracks the last date of check-in for each user

# Flow Scenario:
1. System monitors each users’ check-in activity.
2. If the user has not checked in for 30 consecutive days:
3. The system sends a notification to the manager, altering them of the user’s inactivity.
* The manager can follow up to encourage re-engagement through contact methods listed for each user.
4. If more than one user is inactive for 30 days:
* The manager can generate a list of users who have been inactive.
* The system generates a list of inactive users.
* A notification is sent to the manager with a list of the inactive users.
* The manager can follow up to encourage re-engagement through contact methods listed for each user.
5. If the manager does not receive notifications, they can request an inactivity report.
* A notification is sent to the manager with a list of the inactive users.
* The manager can follow up to encourage re-engagement through contact methods listed for each user.
  
# Postconditions:
* The manager receives notifications, detailing an inactive user along with their contact details.
* The manager receives a list of inactive users and their contact information.
