Atomic Requirements for Membership Management System - SoftEng

Requirement #1: Membership Registration
Importance: Essential  
Description: The process for new customer registration, handled by staff or manager.  

1.1 Initial Registration  
- Customer visits the club for membership setup.  

1.2 Membership Selection  
- System presents available membership durations and payment plans.  

1.3 Age Verification  
- Customer provides valid ID; system verifies age compliance.  

1.4 Customer Information Entry  
- Data captured:  
  - Full Name  
  - Address  
  - Card Payment Information (with billing address)  
  - Valid ID details  

1.4.2 Error Handling  
- Manager can override incomplete data with "N/A" values if needed.  

1.5 Account Creation  
- Customer receives a UserID and Password for mobile app access.  

1.6 App Download and Access Key  
- Customer downloads the app and receives a scannable digital key for entry.  

---

Requirement #2: User Check-in  
Importance: Essential  
Description: Users check-in using barcodes at the front desk.  

2.1 Barcode Verification  
- Barcode checked against the database.  

2.2 User Photo Display  
- Photo shown on the system screen.  

2.3 Membership Status Display  
- Membership status verified and displayed.  
  - “Pass” if valid.  
  - “Error” if invalid, with notification to staff.  
  - Staff notified if membership is expired or inactive.  

---

Requirement #3: Membership Cancellation/Renewal  
Importance: Essential  
Description: Users can cancel or renew memberships via multiple channels.  

3.1 Cancellation Initiation  
- Methods: In-person, Online, or Phone (ID verification or code required).  

3.2 Confirmation/Feedback  
- User confirms cancellation and provides optional feedback.  

3.3 Cancellation Processing  
- Membership deactivated at the end of the billing cycle.  

3.4 Notification of Cancellation  
- User receives email/text confirmation with cancellation details.  

3.5 Record Keeping  
- Cancellation logged; account accessible for 30 days post-cancellation.  

3.6 Reactivation Option  
- Membership can be reactivated within 30 days without re-registration.  

3.7 Billing/Payment Handling  
- No further payments post-cancellation unless reactivated.  

---

Requirement #4: Notifications  
Importance: Non-essential  
Description: System sends reminders and notifications to users and managers.  

4.1 Automated Renewal Notification  
- Sent 30 days before expiration via preferred contact method.  

4.2 Expiration Notification upon Check-in  
- System notifies member if membership has expired.  

4.3 Manual Re-Engagement for Inactive Members  
- Manager notified of members inactive for 30 days.  

---

Requirement #5: Manager Operational Report Generation  
Importance: Essential  
Description: Managers generate reports with customization and insights.  

5.1 Customizable Reports  
- Columns rearranged to focus on specific data fields.  

5.2 Inactivity Highlighting  
- Inactive members (30+ days) automatically highlighted.  

5.3 Advanced Metrics and Insights  
- Includes peak hours, behavior trends, and sales performance.  

5.4 Auditability  
- All changes logged to ensure data integrity.  

5.5 Data Deletion  
- Data deleted upon user request; re-entry required.  

5.6 Manual Transaction Updates  
- Payment updates managed manually by authorized staff.  

