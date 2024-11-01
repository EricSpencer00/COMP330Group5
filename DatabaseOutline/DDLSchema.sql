DROP TABLE IF EXISTS AuditLog CASCADE;
DROP TABLE IF EXISTS PaymentMethods CASCADE;
DROP TABLE IF EXISTS Payments CASCADE;
DROP TABLE IF EXISTS Cancellations CASCADE;
DROP TABLE IF EXISTS Notifications CASCADE;
DROP TABLE IF EXISTS CheckIns CASCADE;
DROP TABLE IF EXISTS Subscriptions CASCADE;
DROP TABLE IF EXISTS Users CASCADE;

CREATE TABLE Users (
    ID SERIAL PRIMARY KEY,
    username VARCHAR(30) UNIQUE NOT NULL,
    PASSWORD_HASH VARCHAR(256) NOT NULL,
    firstName VARCHAR(30) NOT NULL,
    lastName VARCHAR(30) NOT NULL,
    email VARCHAR(60) UNIQUE NOT NULL,
    phoneNumber VARCHAR(20),
    address VARCHAR(255),
    dateOfBirth DATE,
    role VARCHAR(20) NOT NULL, -- 'Member', 'Staff', 'Manager'
    createdAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updatedAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE Subscriptions (
    ID INTEGER NOT NULL REFERENCES Users(ID) ON DELETE CASCADE,
    subscriptionType VARCHAR(50), -- e.g., '6 Months', '1 Year'
    subscriptionFee DECIMAL(10,2),
    subscriptionStartDate DATE,
    subscriptionEndDate DATE,
    subscriptionStatus VARCHAR(30) NOT NULL DEFAULT 'Inactive', -- 'Active', 'Expired', 'Canceled'
    QR_code BYTEA
);

CREATE TABLE CheckIns (
    CheckInID SERIAL PRIMARY KEY,
    UserID INTEGER NOT NULL REFERENCES Users(ID) ON DELETE CASCADE,
    CheckInTime TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CheckOutTime TIMESTAMP
);

CREATE TABLE Notifications (
    NotificationID SERIAL PRIMARY KEY,
    UserID INTEGER NOT NULL REFERENCES Users(ID) ON DELETE CASCADE,
    NotificationType VARCHAR(30) NOT NULL,  -- e.g., 'Renewal', 'Expiration'
    Content TEXT NOT NULL,
    SentDate TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    PreferredMethod VARCHAR(20) NOT NULL CHECK (PreferredMethod IN ('Email', 'Text')),
    Status VARCHAR(20) NOT NULL DEFAULT 'Sent'  -- 'Sent', 'Failed'
);

CREATE TABLE Cancellations (
    CancellationID SERIAL PRIMARY KEY,
    UserID INTEGER NOT NULL REFERENCES Users(ID) ON DELETE CASCADE,
    CancellationDate TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    Reason VARCHAR(255),
    ProcessedBy INTEGER NOT NULL REFERENCES Users(ID),
    Status VARCHAR(20) NOT NULL DEFAULT 'Completed'  -- 'Pending', 'Completed'
);

CREATE TABLE Payments (
    PaymentID SERIAL PRIMARY KEY,
    UserID INTEGER NOT NULL REFERENCES Users(ID) ON DELETE CASCADE,
    PaymentDate TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    Amount DECIMAL(10,2) NOT NULL,
    Status VARCHAR(20) NOT NULL DEFAULT 'Completed'  -- 'Pending', 'Completed', 'Failed'
);

CREATE TABLE PaymentMethods (
    PaymentMethodID SERIAL PRIMARY KEY,
    UserID INTEGER NOT NULL REFERENCES Users(ID) ON DELETE CASCADE,
    CardType VARCHAR(20),  -- e.g., 'Visa', 'MasterCard'
    CardNumberHash VARCHAR(256),  -- Hashed version for security
    LastFourDigits VARCHAR(4),  -- Last four digits for identification
    ExpirationMonth INTEGER NOT NULL,  -- 1-12
    ExpirationYear INTEGER NOT NULL,  -- e.g., 2025
    BillingAddress VARCHAR(255),
    PaymentToken VARCHAR(100),  -- Token from a payment gateway (optional)
    CreatedAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    UpdatedAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE AuditLog (
    AuditID SERIAL PRIMARY KEY,
    UserID INTEGER REFERENCES Users(ID),
    Action VARCHAR(255) NOT NULL,
    ActionTime TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    Details TEXT
);


