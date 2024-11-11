# Manager Generating a Report  

| **Shape** | **Details** |
|-----------|-------------|
| **Use Case:** | Report Generation |
| **Actors:** | Manager |
| **Purpose:** | To help managers easily create reports showing important information on memberships, notifications, and other activities, aiding in decision-making and record-keeping. |
| **Requirements Implemented:** | 5 |
| **Overview:** | A Manager will have access to generate reports to monitor performance, memberships, and other necessary metrics. |
| **Type:** | Essential |
| **Preconditions:** | 1. The manager is logged into the system.<br> 2. Required data (e.g., membership details, financial records, user activity logs) is updated and available in the database. |
| **Postconditions:** | 1. The report is generated and available for viewing.<br> 2. The report is saved for future reference. |
| **Special Requirements:** | N/A |

---

## Flow of Events

| **Actor Action** | **System Response** |
|------------------|---------------------|
| 1. Manager navigates to the "Report Generation" section in the system. ||
||2.  The system displays available report types (e.g., renewals/cancellations, membership growth). |
| 3. Manager makes a report selection. ||
||4.  The system prompts the manager for specific report parameters, such as date or membership type. |
| 5. Manager enters parameters and confirms. ||
||6.  The system retrieves relevant data, generates the report, and displays it to the manager. |
| 7. Manager reviews the report and chooses to save or download it. ||
||8.  The system performs the chosen action and logs the report activity. |

---

## Alternative Flow of Events

| **Line** | **Details** |
|----------|-------------|
| **Line 1** | Manager attempts to generate a report, but the system identifies missing data required for report generation. |
| **Line 3** | The system notifies the manager about missing data. |
| **Line 5** | The manager decides to proceed with available data or cancel the report generation. |
